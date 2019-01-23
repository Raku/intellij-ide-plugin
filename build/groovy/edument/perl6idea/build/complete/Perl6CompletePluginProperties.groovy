// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package edument.perl6idea.build.complete

import org.jetbrains.intellij.build.CommunityRepositoryModules
import edument.perl6idea.build.Perl6PluginPropertiesBase
import edument.perl6idea.build.complete.Perl6CompletePluginModules

/**
 * @author vlan
 */
class Perl6CompletePluginProperties extends Perl6PluginPropertiesBase {
  Perl6CompletePluginProperties() {
    super()
    productCode = "CO"
    platformPrefix = "CommaCore"
    applicationInfoModule = "perl6.community.plugin.main"
    productLayout.pluginModulesToPublish = [Perl6CompletePluginModules.COMMA_COMPLETE_PLUGIN_MODULE]
    productLayout.allNonTrivialPlugins = CommunityRepositoryModules.COMMUNITY_REPOSITORY_PLUGINS //+ [
//      Perl6CompletePluginModules.pythonCommunityPluginLayout()
//    ]
  }
}
