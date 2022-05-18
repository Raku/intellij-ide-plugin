class CommaCommunityPluginBuildTarget {
  @JvmStatic
  fun main(args: Array<String>) {
    val communityHome = IdeaProjectLoaderUtil.guessCommunityHome(javaClass).toString()
    PythonCommunityPluginBuilder(communityHome).build()
  }
}