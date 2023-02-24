import edument.perl6idea.build.complete.Perl6CompletePluginBuilder
import org.jetbrains.intellij.build.IdeaProjectLoaderUtil
import kotlin.io.path.Path

object CommaCompletePluginBuildTarget {
  @JvmStatic
  fun main(args: Array<String>) {
    val communityHome = Path("/home/koto/Work/comma-production/intellij-community")//IdeaProjectLoaderUtil.guessCommunityHome(javaClass).toString()
    Perl6CompletePluginBuilder(communityHome).build()
  }
}
