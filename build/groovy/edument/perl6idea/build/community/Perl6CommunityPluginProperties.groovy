// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package edument.perl6idea.build.community

import org.jetbrains.intellij.build.CommunityRepositoryModules
import edument.perl6idea.build.Perl6PluginPropertiesBase

/**
 * @author vlan
 */
class Perl6CommunityPluginProperties extends Perl6PluginPropertiesBase {
  Perl6CommunityPluginProperties() {
    super()
    productCode = "CT"
    platformPrefix = "CommaCore"
    applicationInfoModule = "edument.perl6.comma.community"
    productLayout.pluginModulesToPublish = [Perl6CommunityPluginModules.PERL6_COMMUNITY_PLUGIN_MODULE]

    productLayout.allNonTrivialPlugins = CommunityRepositoryModules.COMMUNITY_REPOSITORY_PLUGINS + [
      Perl6CommunityPluginModules.perl6CommunityPluginLayout()
    ]
  }
}
