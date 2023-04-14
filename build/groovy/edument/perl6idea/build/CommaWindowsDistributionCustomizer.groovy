// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package edument.perl6idea.build

import org.jetbrains.intellij.build.BuildContext
import org.jetbrains.intellij.build.WindowsDistributionCustomizer

import java.nio.file.Path

/**
 * @author nik
 */
class CommaWindowsDistributionCustomizer extends WindowsDistributionCustomizer {
  @Override
  void copyAdditionalFilesBlocking(BuildContext context, String targetDirectory) {
  }
}
