import edument.perl6idea.build.community.CommaCommunityProperties
import org.jetbrains.intellij.build.*
import org.jetbrains.intellij.build.impl.BuildContextImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking

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
    runBlocking(Dispatchers.Default) {
      val communityHome = IdeaProjectLoaderUtil.guessCommunityHome(javaClass)
      val context = BuildContextImpl.createContext(
        communityHome = communityHome,
        projectHome = communityHome.communityRoot,
        productProperties = CommaCommunityProperties(communityHome),
        proprietaryBuildTools = ProprietaryBuildTools(macHostProperties = getMacHost(),
                                                      signTool = null, scrambleTool = null, artifactsServer = null, featureUsageStatisticsProperties = null, licenseServerHost = null),
        options = BuildOptions()
      )
      BuildTasks.create(context).buildDistributions()
    }
  }
}
