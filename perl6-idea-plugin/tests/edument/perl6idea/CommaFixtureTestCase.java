package edument.perl6idea;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.projectRoots.impl.SdkConfigurationUtil;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.testFramework.LightProjectDescriptor;
import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import edument.perl6idea.psi.Perl6File;
import edument.perl6idea.sdk.Perl6SdkType;
import org.jetbrains.annotations.NotNull;
import org.junit.Ignore;

@Ignore
public class CommaFixtureTestCase extends BasePlatformTestCase {
    protected Sdk testSdk;

    @NotNull
    @Override
    protected LightProjectDescriptor getProjectDescriptor() {
        return new Perl6LightProjectDescriptor();
    }

    protected void ensureModuleIsLoaded(String moduleName) throws InterruptedException {
        ensureModuleIsLoaded(moduleName, "use");
    }

    protected void ensureModuleIsLoaded(String moduleName, String invocation) throws InterruptedException {
        Perl6SdkType sdkType = (Perl6SdkType)testSdk.getSdkType();
        Perl6File file = sdkType.getPsiFileForModule(getProject(), moduleName, invocation + " " + moduleName);
        while (file.getName().equals("DUMMY")) {
            Thread.sleep(100);
            file = sdkType.getPsiFileForModule(getProject(), moduleName, invocation + " " + moduleName);
        }
    }

    private void ensureSetting() throws InterruptedException {
        Perl6SdkType sdkType = (Perl6SdkType)testSdk.getSdkType();
        Perl6File file = sdkType.getCoreSettingFile(getProject());
        while (file.getName().equals("DUMMY")) {
            Thread.sleep(100);
            file = sdkType.getCoreSettingFile(getProject());
        }
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ApplicationManager.getApplication().runWriteAction(() -> {
            String homePath = Perl6SdkType.getInstance().suggestHomePath();
            assertNotNull("Found a perl6 in path to use in tests", homePath);
            testSdk = SdkConfigurationUtil.createAndAddSDK(homePath, Perl6SdkType.getInstance());
            ProjectRootManager.getInstance(myFixture.getModule().getProject()).setProjectSdk(testSdk);
        });
        ensureSetting();
    }

    @Override
    protected void tearDown() throws Exception {
        try {
            Perl6SdkType sdkType = (Perl6SdkType)testSdk.getSdkType();
            sdkType.invalidateFileCaches(getProject());
            SdkConfigurationUtil.removeSdk(testSdk);
        } catch (Exception ignored) {
        }
        finally {
            super.tearDown();
        }
    }
}
