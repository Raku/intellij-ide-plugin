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
package org.jetbrains.intellij.build.comma

import org.jetbrains.intellij.build.CommunityRepositoryModules
import org.jetbrains.intellij.build.comma.Perl6CompletePluginModules

/**
 * @author vlan
 */
class Perl6CompletePluginProperties extends Perl6PluginPropertiesBase {
  Perl6CompletePluginProperties() {
    super()
    productCode = "CO"
    platformPrefix = "CommaCore"
    applicationInfoModule = "intellij.perl6.community.impl"
    productLayout.pluginModulesToPublish = [Perl6CompletePluginModules.COMMA_COMPLETE_PLUGIN_MODULE]
    productLayout.allNonTrivialPlugins = CommunityRepositoryModules.COMMUNITY_REPOSITORY_PLUGINS //+ [
//      Perl6CompletePluginModules.pythonCommunityPluginLayout()
//    ]
  }
}
