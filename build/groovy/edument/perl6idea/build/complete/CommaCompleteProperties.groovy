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
    applicationInfoModule = "edument.perl6.comma.complete"
    brandingResourcePaths = ["$communityHome/comma-build/complete/resources"]

    productLayout.productImplementationModules = CommunityRepositoryModules.PLATFORM_IMPLEMENTATION_MODULES + [
      "intellij.xml.dom", "intellij.xml.dom.impl", "intellij.java.impl", "intellij.java.ui",
      "intellij.platform.main", "intellij.java.psi",
      "intellij.platform.lang", "intellij.java.compiler", "intellij.java.compiler.impl",
      "edument.perl6.comma.complete", "edument.perl6.plugin"
    ]
    productLayout.bundledPluginModules = new File("$communityHome/comma-build/build/plugin-list.txt").readLines()
    productLayout.mainModules = ["intellij.java", "intellij.java.impl", "intellij.java.ui", "intellij.java.psi", "intellij.platform.lang", "edument.perl6.comma.complete", "edument.perl6.plugin"]
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
    "commaCP-$buildNumber"
  }

  @Override
  WindowsDistributionCustomizer createWindowsCustomizer(String projectHome) {
    return new CommaWindowsDistributionCustomizer() {
      {
        installerImagesPath = "$projectHome/comma-build/build/resources"
        fileAssociations = [".p6", ".pm6", ".pl6", ".pod6", ".raku", ".rakumod", ".rakutest", ".rakudoc"]
      }

      @Override
      String getFullNameIncludingEdition(ApplicationInfoProperties applicationInfo) {
        "Comma Complete Edition"
      }
    }
  }

  @Override
  LinuxDistributionCustomizer createLinuxCustomizer(String projectHome) {
    return new LinuxDistributionCustomizer() {
      {
        iconPngPath = "$projectHome/comma-build/complete/resources/CommaCore128.png"
        snapName = "comma-complete"
        snapDescription =
          "Complete edition of the Comma Raku Integrated Development Environment."
          "Developed by Edument."
      }

      @Override
      String getRootDirectoryName(ApplicationInfoProperties applicationInfo, String buildNumber) {
        "comma-complete-${applicationInfo.isEAP ? buildNumber : applicationInfo.fullVersion}"
      }
    }
  }

  @Override
  MacDistributionCustomizer createMacCustomizer(String projectHome) {
    return null
  }

  @Override
  String getOutputDirectoryName(ApplicationInfoProperties applicationInfo) {
    "comma"
  }
}
