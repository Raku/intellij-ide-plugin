// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package edument.perl6idea.build.complete

import org.jetbrains.intellij.build.BuildContext
import org.jetbrains.intellij.build.BuildOptions
import org.jetbrains.intellij.build.BuildTasks
import org.jetbrains.intellij.build.ProprietaryBuildTools

/**
 * @author vlan
 */
class Perl6CompletePluginBuilder {
  private final String home

  Perl6CompletePluginBuilder(String home) {
    this.home = home
  }

  def build() {
    def pluginBuildNumber = System.getProperty("build.number", "SNAPSHOT")
    def options = new BuildOptions(targetOS: BuildOptions.OS_NONE, buildNumber: pluginBuildNumber, outputRootPath: "$home/out/commaCP", incrementalCompilation: true)
    def buildContext = BuildContext.createContext(home, home, new Perl6CompletePluginProperties(), ProprietaryBuildTools.DUMMY, options)
    def buildTasks = BuildTasks.create(buildContext)
    buildTasks.buildDistributions()

    def builtPlugins = new File("$buildContext.paths.artifacts/${buildContext.productProperties.productCode}-plugins").listFiles()
    if (builtPlugins == null || builtPlugins.length == 0) {
      buildContext.messages.warning("No plugins were built")
      return
    }

    def pluginsPaths = new File("$buildContext.paths.buildOutputRoot/plugins-paths.txt")
    pluginsPaths.text = builtPlugins.collect { it.toString() }.join("\n") }
}