package edument.perl6idea.build

import org.jetbrains.intellij.build.BuildContext
import org.jetbrains.intellij.build.ProductProperties

abstract class CommaPropertiesBase : ProductProperties() {
  override suspend fun copyAdditionalFiles(context: BuildContext, targetDirectory: String) {
    copyAdditionalFilesBlocking(context, targetDirectory)
  }

  open fun copyAdditionalFilesBlocking(context: BuildContext, targetDirectory: String) {

  }
}
