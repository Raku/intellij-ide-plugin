/*
 * Copyright 2000-2017 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */
package edument.perl6idea.build.community

import org.jetbrains.intellij.build.BuildContext
import org.jetbrains.intellij.build.impl.PluginLayout

/**
 * @author nik
 */
class Perl6CommunityPluginModules {
  static List<String> COMMUNITY_MODULES = [
    "edument.perl6.plugin"
  ]
  public static String PERL6_COMMUNITY_PLUGIN_MODULE = "edument.perl6.comma.community"

  static PluginLayout perl6CommunityPluginLayout(@DelegatesTo(PluginLayout.PluginLayoutSpec) Closure body = {}) {
    perl6Plugin(PERL6_COMMUNITY_PLUGIN_MODULE, "comma-ct", COMMUNITY_MODULES) {
      body.delegate = delegate
      body()
    }
  }

  static PluginLayout perl6Plugin(String mainModuleName, String name, List<String> modules,
                                   @DelegatesTo(PluginLayout.PluginLayoutSpec) Closure body = {}) {
    PluginLayout.plugin(mainModuleName) {
      directoryName = name
      mainJarName = "${name}.jar"
      modules.each { module ->
        withModule(module, mainJarName, null)
      }
      withCustomVersion { BuildContext context ->
        def pluginBuildNumber = getPluginBuildNumber()
        "$context.applicationInfo.majorVersion.$context.applicationInfo.minorVersionMainPart.$pluginBuildNumber"
      }
      doNotCreateSeparateJarForLocalizableResources()
      body.delegate = delegate
      body()
    }
  }

  static String getPluginBuildNumber() {
    System.getProperty("build.number", "SNAPSHOT")
  }
}
