// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package edument.perl6idea.build.community

import groovy.io.FileType
import org.jetbrains.intellij.build.*
/**
 * @author vlan
 */
@SuppressWarnings("unused")
class Perl6CommunityPluginBuilder {
  private final String home

  Perl6CommunityPluginBuilder(String home) {
    this.home = home
  }

  def build() {
    def pluginBuildNumber = System.getProperty("build.number", "201.1.0")
    def pluginsForIdeaCommunity = [
      "edument.perl6.comma.community"
    ]
    def options = new BuildOptions(targetOS: BuildOptions.OS_NONE, buildNumber: pluginBuildNumber, outputRootPath: "$home/out/commaCT", incrementalCompilation: true)
    def buildContext = BuildContext.createContext(home,
                                                  home,
                                                  new Perl6CommunityPluginProperties(),
                                                  ProprietaryBuildTools.DUMMY,
                                                  options)
    BuildTasks.create(buildContext).buildNonBundledPlugins(pluginsForIdeaCommunity)

    List<File> builtPlugins = []
    new File(buildContext.paths.artifacts, "${buildContext.applicationInfo.productCode}-plugins").eachFileRecurse(FileType.FILES) {
      if (it.name.endsWith(".zip")) {
        builtPlugins << it
      }
    }
    if (builtPlugins.isEmpty()) {
      buildContext.messages.warning("No plugins were built")
      return
    }

    def pluginsPaths = new File("$buildContext.paths.buildOutputRoot/plugins-paths.txt")
    pluginsPaths.text = builtPlugins.collect { it.toString() }.join("\n")
  }
}