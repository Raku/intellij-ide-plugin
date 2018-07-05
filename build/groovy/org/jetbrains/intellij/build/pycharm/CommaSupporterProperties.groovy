/*
 * Copyright 2000-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.intellij.build.pycharm

import org.jetbrains.intellij.build.*

/**
 * @author nik
 */
class CommaSupporterProperties extends CommaPropertiesBase {
  CommaSupporterProperties(String communityHome) {
    productCode = "CO"
    platformPrefix = "CommaCore"
    applicationInfoModule = "intellij.perl6.community.impl"
    brandingResourcePaths = ["$communityHome/comma-build/resources"]

    productLayout.platformApiModules = CommunityRepositoryModules.PLATFORM_API_MODULES + ["intellij.xml.dom", "intellij.java"]
    productLayout.platformImplementationModules = CommunityRepositoryModules.PLATFORM_IMPLEMENTATION_MODULES + [
      "intellij.xml.dom.impl", "intellij.java.impl", "intellij.java.ui", "intellij.perl6.community.impl",
      "edument.comma.supporter", "intellij.platform.main", "intellij.java.psi", "intellij.platform.lang", "perl6.community.plugin.main"
    ]
    productLayout.bundledPluginModules = new File("$communityHome/comma-build/build/plugin-list.txt").readLines()
    productLayout.mainModules = ["intellij.comma.supporter.main", "intellij.java", "intellij.java.impl", "intellij.java.ui", "intellij.java.psi", "intellij.platform.lang", "perl6.community.plugin.main"]
  }

  @Override
  void copyAdditionalFiles(BuildContext context, String targetDirectory) {
    super.copyAdditionalFiles(context, targetDirectory)
    context.ant.copy(todir: "$targetDirectory/license") {
      fileset(file: "$context.paths.communityHome/LICENSE.txt")
      fileset(file: "$context.paths.communityHome/NOTICE.txt")
    }
  }

  @Override
  String getSystemSelector(ApplicationInfoProperties applicationInfo) {
    "CommaSE${applicationInfo.majorVersion}.${applicationInfo.minorVersionMainPart}"
  }

  @Override
  String getBaseArtifactName(ApplicationInfoProperties applicationInfo, String buildNumber) {
    "commaCO-$buildNumber"
  }

  @Override
  WindowsDistributionCustomizer createWindowsCustomizer(String projectHome) {
    return new CommaWindowsDistributionCustomizer() {
      {
        installerImagesPath = "$projectHome/comma-build/build/resources"
        fileAssociations = [".p6", ".pm6", ".pl6"]
      }

      @Override
      String getFullNameIncludingEdition(ApplicationInfoProperties applicationInfo) {
        "Comma Supporter Edition"
      }

      @Override
      String getBaseDownloadUrlForJre() { "https://download.jetbrains.com/python" }
    }
  }

  @Override
  LinuxDistributionCustomizer createLinuxCustomizer(String projectHome) {
    return new LinuxDistributionCustomizer() {
      {
        iconPngPath = "$projectHome/comma-build/resources/CommaCore128.png"
        snapName = "comma-supporter"
        snapDescription =
          "The Integrated Development Environment for Perl 6."
          "From your friends at Edument!"
      }

      @Override
      String getRootDirectoryName(ApplicationInfoProperties applicationInfo, String buildNumber) {
        "comma-supporter-${applicationInfo.isEAP ? buildNumber : applicationInfo.fullVersion}"
      }
    }
  }

  @Override
  MacDistributionCustomizer createMacCustomizer(String projectHome) {
    return new CommaMacDistributionCustomizer() {
      {
        icnsPath = "$projectHome/comma-build/resources/CommaCore.icns"
        bundleIdentifier = "com.edument.comma"
        dmgImagePath = "$projectHome/comma-build/build/dmg_background.tiff"
      }

      @Override
      String getRootDirectoryName(ApplicationInfoProperties applicationInfo, String buildNumber) {
        String suffix = applicationInfo.isEAP ? " ${applicationInfo.majorVersion}.${applicationInfo.minorVersion} EAP" : ""
        "Comma SE${suffix}.app"
      }
    }
  }

  @Override
  String getOutputDirectoryName(ApplicationInfoProperties applicationInfo) {
    "comma-se"
  }
}
