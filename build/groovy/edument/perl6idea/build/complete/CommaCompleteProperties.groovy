// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package edument.perl6idea.build.complete

import org.jetbrains.intellij.build.*
import edument.perl6idea.build.CommaPropertiesBase
import edument.perl6idea.build.CommaMacDistributionCustomizer
import edument.perl6idea.build.CommaWindowsDistributionCustomizer

/**
 * @author nik
 */
class CommaCompleteProperties extends CommaPropertiesBase {
  CommaCompleteProperties(String communityHome) {
    productCode = "CP"
    platformPrefix = "CommaCore"
    applicationInfoModule = "edument.perl6.plugin"
    brandingResourcePaths = ["$communityHome/comma-build/resources"]

    productLayout.platformApiModules = CommunityRepositoryModules.PLATFORM_API_MODULES + ["intellij.xml.dom", "intellij.java"]
    productLayout.platformImplementationModules = CommunityRepositoryModules.PLATFORM_IMPLEMENTATION_MODULES + [
      "intellij.xml.dom.impl", "intellij.java.impl", "intellij.java.ui",
      "intellij.platform.main", "intellij.java.psi", "intellij.platform.lang", "intellij.java.compiler", "intellij.java.compiler.impl", "edument.perl6.plugin"
    ]
    productLayout.bundledPluginModules = new File("$communityHome/comma-build/build/plugin-list.txt").readLines()
    productLayout.mainModules = ["intellij.java", "intellij.java.impl", "intellij.java.ui", "intellij.java.psi", "intellij.platform.lang", "edument.perl6.plugin"]
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
    "CommaCP${applicationInfo.majorVersion}.${applicationInfo.minorVersionMainPart}"
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
        fileAssociations = [".p6", ".pm6", ".pl6", ".pod6"]
      }

      @Override
      String getFullNameIncludingEdition(ApplicationInfoProperties applicationInfo) {
        "Comma Complete Edition"
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
        snapName = "comma-complete"
        snapDescription =
          "The Integrated Development Environment for Perl 6: Complete edition."
          "From your friends at Edument!"
      }

      @Override
      String getRootDirectoryName(ApplicationInfoProperties applicationInfo, String buildNumber) {
        "comma-complete-${applicationInfo.isEAP ? buildNumber : applicationInfo.fullVersion}"
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
        "Comma CP${suffix}.app"
      }
    }
  }

  @Override
  String getOutputDirectoryName(ApplicationInfoProperties applicationInfo) {
    "commaCP"
  }
}
