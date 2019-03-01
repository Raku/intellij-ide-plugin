// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package edument.perl6idea.build

import org.jetbrains.intellij.build.*

/**
 * @author nik
 */
abstract class CommaPropertiesBase extends ProductProperties {
  CommaPropertiesBase() {
    baseFileName = "comma"
    reassignAltClickToMultipleCarets = true
    productLayout.mainJarName = "comma.jar"
  }

  @Override
  void copyAdditionalFiles(BuildContext context, String targetDirectory) {
  }

  @Override
  String getEnvironmentVariableBaseName(ApplicationInfoProperties applicationInfo) {
    "COMMA"
  }
}
