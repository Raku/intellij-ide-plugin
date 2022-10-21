// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package edument.perl6idea.build

import org.jetbrains.intellij.build.BuildContext
import org.jetbrains.intellij.build.FileSet
import org.jetbrains.intellij.build.WindowsDistributionCustomizer

/**
 * @author nik
 */
class CommaWindowsDistributionCustomizer extends WindowsDistributionCustomizer {
  @Override
  void copyAdditionalFilesBlocking(BuildContext context, String targetDirectory) {
    def underTeamCity = System.getProperty("teamcity.buildType.id") != null

    //new FileSet(context.paths.communityHomeDir.communityRoot)
    //.include("LICENSE.txt")
    //.include("NOTICE.txt")
    //  .copyToDir(Path.of(targetDirectory, "license"))
    //context.ant.copy(todir: "$targetDirectory/skeletons", failonerror: underTeamCity) {
    //  fileset(dir: "$context.paths.projectHome/skeletons", erroronmissingdir: underTeamCity) {
    //    include(name: "skeletons-win*.zip")
    //  }
    //}
  }
}