// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package edument.perl6idea.build

import org.jetbrains.intellij.build.ApplicationInfoProperties
import org.jetbrains.intellij.build.LinuxDistributionCustomizer
import org.jetbrains.intellij.build.MacDistributionCustomizer
import org.jetbrains.intellij.build.WindowsDistributionCustomizer
/**
 * @author vlan
 */
abstract class Perl6PluginPropertiesBase extends CommaPropertiesBase {
  Perl6PluginPropertiesBase() {
    super()
  }

  @Override
  String getBaseArtifactName(ApplicationInfoProperties applicationInfo, String buildNumber) {
    return null
  }

  @Override
  WindowsDistributionCustomizer createWindowsCustomizer(String projectHome) {
    return null
  }

  @Override
  LinuxDistributionCustomizer createLinuxCustomizer(String projectHome) {
    return null
  }

  @Override
  MacDistributionCustomizer createMacCustomizer(String projectHome) {
    return null
  }
}
