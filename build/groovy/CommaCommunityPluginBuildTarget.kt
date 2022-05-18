import edument.perl6idea.build.community.Perl6CommunityPluginBuilder
import org.jetbrains.intellij.build.IdeaProjectLoaderUtil

object CommaCommunityPluginBuildTarget {
  @JvmStatic
  fun main(args: Array<String>) {
    val communityHome = IdeaProjectLoaderUtil.guessCommunityHome(javaClass).toString()
    Perl6CommunityPluginBuilder(communityHome).build()
  }
}
