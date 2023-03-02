// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package edument.perl6idea.build.complete

import groovy.io.FileType
import org.jetbrains.intellij.build.*
import org.jetbrains.intellij.build.dependencies.BuildDependenciesCommunityRoot
import org.jetbrains.intellij.build.impl.BuildContextImpl
import java.nio.file.Path

/**
 * @author vlan
 */
@SuppressWarnings("unused")
class Perl6CompletePluginBuilder {
  private final Path home

  Perl6CompletePluginBuilder(Path home) {
    this.home = home
  }

  def build() {
    def pluginBuildNumber = System.getProperty("build.number", "223.0.0")
    def pluginsForIdeaCommunity = [
      "edument.perl6.comma.complete"
    ]
    def options = new BuildOptions()
    options.buildNumber = pluginBuildNumber
    options.outputRootPath = this.home.resolve("out/commaCP")
    options.incrementalCompilation = true
    def communityRoot = new BuildDependenciesCommunityRoot(this.home)
    def buildContext = BuildContextImpl.createContextBlocking(communityRoot,
                                                  this.home,
                                                  new CommaCompleteProperties(communityRoot),
                                                  ProprietaryBuildTools.DUMMY,
                                                  options)
    BuildTasks.create(buildContext).blockingBuildNonBundledPlugins(pluginsForIdeaCommunity)

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