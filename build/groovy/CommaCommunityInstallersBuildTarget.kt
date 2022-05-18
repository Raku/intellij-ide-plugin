import edument.perl6idea.build.community.CommaCommunityProperties
import org.jetbrains.intellij.build.*

object CommaCommunityInstallersBuildTarget {
  private fun getMacHost(): MacHostProperties? {
    if (System.getenv("COMMA_DMG_HOST") != null) {
      val host = System.getenv("COMMA_DMG_HOST")
      val username = System.getenv("COMMA_DMG_USERNAME")
      val password = System.getenv("COMMA_DMG_PASSWORD")
      val signid = System.getenv("COMMA_DMG_SIGNID")
      return MacHostProperties(host, username, password, signid)
    } else {
      return null
    }
  }

  @JvmStatic
  fun main(args: Array<String>) {
    val communityHome = IdeaProjectLoaderUtil.guessCommunityHome(javaClass).toString()
    val context = BuildContext.createContext(
      communityHome,
      communityHome,
      CommaCommunityProperties(communityHome),
      ProprietaryBuildTools(null, null, getMacHost(), null),
      BuildOptions()
    )
    BuildTasks.create(context).buildDistributions()
  }
}
