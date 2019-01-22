package edument.perl6idea.build.community

class Perl6CommunityPluginModules {
  public static String COMMA_COMPLETE_PLUGIN_MODULE = "perl6.community.plugin.main"

  static String getPluginBuildNumber() {
    System.getProperty("build.number", "SNAPSHOT")
  }
}
