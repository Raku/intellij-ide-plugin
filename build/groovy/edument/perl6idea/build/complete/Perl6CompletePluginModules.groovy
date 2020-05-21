/*
 * Copyright 2000-2017 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */
package edument.perl6idea.build.complete

import org.jetbrains.intellij.build.BuildContext
import org.jetbrains.intellij.build.impl.PluginLayout

/**
 * @author nik
 */
class Perl6CompletePluginModules {
  static List<String> COMPLETE_MODULES = [
    "edument.perl6.plugin"
  ]
  public static String PERL6_COMPLETE_PLUGIN_MODULE = "edument.perl6.comma.complete"

  static PluginLayout perl6CompletePluginLayout(@DelegatesTo(PluginLayout.PluginLayoutSpec) Closure body = {}) {
    perl6Plugin(PERL6_COMPLETE_PLUGIN_MODULE, "comma-cp", COMPLETE_MODULES) {
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
      doNotCreateSeparateJarForLocalizableResources()
      body.delegate = delegate
      body()
    }
  }
}
