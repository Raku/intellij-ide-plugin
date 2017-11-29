package edument.perl6idea.event;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileManager;
import com.intellij.openapi.vfs.newvfs.BulkFileListener;
import com.intellij.openapi.vfs.newvfs.events.VFileDeleteEvent;
import com.intellij.openapi.vfs.newvfs.events.VFileEvent;
import com.intellij.util.messages.MessageBusConnection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.io.File.separator;

public class ModuleMetaChangeListener implements ApplicationComponent, BulkFileListener {
    private final MessageBusConnection conn;

    @Override
    public void after(@NotNull List<? extends VFileEvent> events) {
        for (VFileEvent event : events) {
            if (event instanceof VFileDeleteEvent) {
                VFileDeleteEvent evt = (VFileDeleteEvent)event;
                VirtualFile file = evt.getFile();
                if (Objects.equals(file.getExtension(), "pm6")) {
                    Matcher m = Pattern.compile("(.*)/lib/(.+).pm6").matcher(file.getPath());
                    String moduleName;
                    if(m.matches()) {
                        moduleName = m.group(2).replaceAll(separator, "::");
                    } else {
                        continue; // XXX We probably should throw here.
                    }
                    Path metaPath = Paths.get(m.group(1), "META6.json");
                    try {
                        String content = new String (Files.readAllBytes(metaPath));
                        JSONObject metaInfo = new JSONObject(content);
                        JSONObject providesSection = metaInfo.getJSONObject("provides");
                        providesSection.remove(moduleName);
                        metaInfo.put("provides", providesSection);
                        Files.write(metaPath, Collections.singletonList(metaInfo.toString(4)), StandardCharsets.UTF_8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
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