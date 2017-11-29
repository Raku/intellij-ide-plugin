package edument.perl6idea.event;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileManager;
import com.intellij.openapi.vfs.newvfs.BulkFileListener;
import com.intellij.openapi.vfs.newvfs.events.VFileDeleteEvent;
import com.intellij.openapi.vfs.newvfs.events.VFileEvent;
import com.intellij.openapi.vfs.newvfs.events.VFileMoveEvent;
import com.intellij.openapi.vfs.newvfs.events.VFilePropertyChangeEvent;
import com.intellij.util.messages.MessageBusConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.io.File.separator;

public class ModuleMetaChangeListener implements ApplicationComponent, BulkFileListener {
    private final MessageBusConnection conn;

    @Nullable
    private List<String> calculateModuleName(String path) {
        Matcher m = Pattern.compile("(.*)/lib/(.+).pm6").matcher(path);
        if (m.matches()) {
            return Arrays.asList(m.group(1),
                                 m.group(2).replaceAll(separator, "::"));
        }
        return null;
    }

    @Override
    public void after(@NotNull List<? extends VFileEvent> events) {
        for (VFileEvent event : events) {
            if (event instanceof VFileDeleteEvent) {
                VFileDeleteEvent evt = (VFileDeleteEvent)event;
                processEvent(evt);
            } else if (event instanceof VFilePropertyChangeEvent) {
                VFilePropertyChangeEvent evt = (VFilePropertyChangeEvent)event;
                if (Objects.equals(evt.getPropertyName(), VirtualFile.PROP_NAME)) {
                    processEvent(evt);
                }
            } else if (event instanceof VFileMoveEvent) {
                VFileMoveEvent evt = (VFileMoveEvent)event;
                processEvent(evt);
            }
        }
    }

    private void processEvent(VFileDeleteEvent evt) {
        if (Objects.equals(evt.getFile().getExtension(), "pm6")) {
            List<String> metaAndModule = calculateModuleName(evt.getPath());
            if (metaAndModule == null) return;
            Path metaPath = Paths.get(metaAndModule.get(0), "META6.json");
            String oldName = metaAndModule.get(1);
            updateMeta(metaPath, oldName, null);
            LocalFileSystem.getInstance().refresh(false);
        }
    }

    private void processEvent(VFilePropertyChangeEvent evt) {
        if (Objects.equals(evt.getFile().getExtension(), "pm6")) {
            List<String> metaAndModule = calculateModuleName(evt.getOldPath());
            if (metaAndModule == null) return;
            Path metaPath = Paths.get(metaAndModule.get(0), "META6.json");
            String oldName = metaAndModule.get(1);
            String newName = calculateModuleName(evt.getPath()).get(1);
            updateMeta(metaPath, oldName, newName);

        }
    }

    private void processEvent(VFileMoveEvent evt) {
        if (Objects.equals(evt.getFile().getExtension(), "pm6")) {
            List<String> metaAndModule = calculateModuleName(evt.getOldPath());
            if (metaAndModule == null) return;
            Path metaPath = Paths.get(metaAndModule.get(0), "META6.json");
            String oldName = metaAndModule.get(1);
            String newName = calculateModuleName(evt.getPath()).get(1);
            updateMeta(metaPath, oldName, newName);
        }
    }

    private void updateMeta(Path metaPath, String oldName, String newName) {
        try {
            String content = new String(Files.readAllBytes(metaPath));
            JSONObject metaInfo = new JSONObject(content);
            JSONObject providesSection = metaInfo.getJSONObject("provides");
            providesSection.remove(oldName);
            if (newName != null) {
                providesSection.put(newName,
                        String.format("lib%s%s.pm6", separator, newName.replaceAll("::", separator)));
            }
            metaInfo.put("provides", providesSection);
            Files.write(metaPath, Collections.singletonList(metaInfo.toString(4)), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ModuleMetaChangeListener() {
        conn = ApplicationManager.getApplication().getMessageBus().connect();
    }

    @Override
    public void initComponent() {
        conn.subscribe(VirtualFileManager.VFS_CHANGES, this);
    }

    @Override
    public void disposeComponent() {
        conn.disconnect();
    }
}