// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package edument.perl6idea.build

import org.jetbrains.intellij.build.ApplicationInfoProperties
import org.jetbrains.intellij.build.BuildContext
import org.jetbrains.intellij.build.MacDistributionCustomizer

/**
 * @author nik
 */
class CommaMacDistributionCustomizer extends MacDistributionCustomizer {
  @Override
  void copyAdditionalFiles(BuildContext context, String targetDirectory) {
    def underTeamCity = System.getProperty("teamcity.buildType.id") != null

    context.ant.copy(todir: "$targetDirectory/skeletons", failonerror: underTeamCity) {
      fileset(dir: "$context.paths.projectHome/skeletons", erroronmissingdir: underTeamCity) {
        include(name: "skeletons-mac*.zip")
      }
    }
  }

  @Override
  Map<String, String> getCustomIdeaProperties(ApplicationInfoProperties applicationInfo) {
    ["ide.mac.useNativeClipboard": "false"]
  }
}