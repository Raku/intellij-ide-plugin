package org.jetbrains.intellij.build.comma

class Perl6CompletePluginModules {
  public static String COMMA_COMPLETE_PLUGIN_MODULE = "perl6.community.plugin.main"

  static String getPluginBuildNumber() {
    System.getProperty("build.number", "SNAPSHOT")
  }
}
