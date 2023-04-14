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
package edument.perl6idea.build.community

import org.jetbrains.intellij.build.*
import edument.perl6idea.build.CommaPropertiesBase
import edument.perl6idea.build.CommaMacDistributionCustomizer
import edument.perl6idea.build.CommaWindowsDistributionCustomizer
import org.jetbrains.intellij.build.dependencies.BuildDependenciesCommunityRoot

import java.nio.file.Files
import java.nio.file.Path

import static org.jetbrains.intellij.build.impl.PluginLayoutGroovy.plugin

/**
 * @author nik
 */
class CommaCommunityProperties extends CommaPropertiesBase {
  CommaCommunityProperties(BuildDependenciesCommunityRoot communityHome) {
    productLayout.mainJarName = "comma.jar"
    platformPrefix = "CommaCore"
    applicationInfoModule = "edument.perl6.comma.community"
    brandingResourcePaths = List.of(communityHome.communityRoot.resolve("comma-build/complete/resources"))

    productLayout.mainModules = List.of("edument.perl6.comma.community")
    productLayout.productApiModules = ["intellij.xml.dom", "edument.perl6.comma.community"]
    productLayout.productImplementationModules = [
      "intellij.xml.dom.impl",
      "intellij.platform.main",
      "edument.perl6.plugin"
    ]
    productLayout.bundledPluginModules.add("edument.perl6.comma.community")
    productLayout.bundledPluginModules.addAll(Files.readAllLines(communityHome.communityRoot.resolve("comma-build/build/plugin-list.txt")))

    productLayout.pluginLayouts = CommunityRepositoryModules.COMMUNITY_REPOSITORY_PLUGINS.add(
      plugin("edument.perl6.comma.community") {
        directoryName = "comma"
        mainJarName = "comma.jar"
        withModule("edument.perl6.plugin")
      })
    productLayout.pluginModulesToPublish = List.of("edument.perl6.comma.community")
  }

  @Override
  void copyAdditionalFilesBlocking(BuildContext context, String targetDirectory) {
    super.copyAdditionalFilesBlocking(context, targetDirectory)
    new FileSet(context.paths.communityHomeDir.communityRoot)
    .include("LICENSE.txt")
    .include("NOTICE.txt")
      .copyToDir(Path.of(targetDirectory, "license"))
  }

  String getSystemSelector(ApplicationInfoProperties applicationInfo, String buildNumber) {
    "CommaCT${applicationInfo.majorVersion}.${applicationInfo.minorVersionMainPart}"
  }

  @Override
  String getBaseFileName() {
    return "comma"
  }

  @Override
  String getBaseArtifactName(ApplicationInfoProperties applicationInfo, String buildNumber) {
    "commaCT-$buildNumber"
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
        "Comma Community Edition"
      }
    }
  }

  @Override
  LinuxDistributionCustomizer createLinuxCustomizer(String projectHome) {
    return new LinuxDistributionCustomizer() {
      {
        iconPngPath = "$projectHome/comma-build/community/resources/CommaCore128.png"
        snapName = "comma-community"
        snapDescription =
          "Community edition of the Comma Raku Integrated Development Environment."
          "Developed by Edument."
      }

      @Override
      String getRootDirectoryName(ApplicationInfoProperties applicationInfo, String buildNumber) {
        "comma-community-${applicationInfo.isEAP() ? buildNumber : applicationInfo.fullVersion}"
      }
    }
  }

  @Override
  MacDistributionCustomizer createMacCustomizer(String projectHome) {
    return new CommaMacDistributionCustomizer() {
      {
        icnsPath = "$projectHome/comma-build/community/resources/CommaCore.icns"
        bundleIdentifier = "com.edument.comma"
        dmgImagePath = "$projectHome/comma-build/build/dmg_background.tiff"
      }

      @Override
      String getRootDirectoryName(ApplicationInfoProperties applicationInfo, String buildNumber) {
        String suffix = applicationInfo.isEAP() ? " ${applicationInfo.majorVersion}.${applicationInfo.minorVersion} EAP" : ""
        "Comma CT${suffix}.app"
      }
    }
  }

  @Override
  String getOutputDirectoryName(ApplicationInfoProperties applicationInfo) {
    "comma"
  }

  @Override
  String getEnvironmentVariableBaseName(ApplicationInfoProperties applicationInfo) {
    return "COMMA"
  }
}
