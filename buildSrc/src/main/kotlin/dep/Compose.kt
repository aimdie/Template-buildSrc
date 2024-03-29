package dep

import getVer

/**
 * @作者 向死而生
 * @时间 2021/8/20 20:56
 * @该类描述： -
 * @使用说明： -
 */
object Compose {
  val ui = ui()
  val material = material()
  val animation = animation()
  val foundation = foundation()
  val runtime = runtime()
  val uiTooling = uiTooling()
  val uiToolingPreview = uiToolingPreview()
  val materialIconsExtended = materialIconsExtended()
  
  object Android {
    val uiTooling = uiTooling()
    val uiToolingPreview = uiToolingPreview()
    //////////////////////////////////////////////////
    
    fun uiTooling(
      version: String
      = getVer("compose")
    ): String {
      return "androidx.compose.ui:ui-tooling:${version}"
    }
    
    fun uiToolingPreview(
      version: String
      = getVer("compose")
    ): String {
      return "androidx.compose.ui:ui-tooling-preview:${version}"
    }
  }
  //////////////////////////////////////////////////
  
  fun ui(
    version: String
    = getVer("compose")
  ): String {
    return "org.jetbrains.compose.ui:ui:${version}"
  }
  
  fun material(
    version: String
    = getVer("compose")
  ): String {
    return "org.jetbrains.compose.material:material:${version}"
  }
  
  fun animation(
    version: String
    = getVer("compose")
  ): String {
    return "org.jetbrains.compose.animation:animation:${version}"
  }
  
  fun foundation(
    version: String
    = getVer("compose")
  ): String {
    return "org.jetbrains.compose.foundation:foundation:${version}"
  }
  
  fun runtime(
    version: String
    = getVer("compose")
  ): String {
    return "org.jetbrains.compose.runtime:runtime:${version}"
  }
  
  fun uiTooling(
    version: String
    = getVer("compose")
  ): String {
    return "org.jetbrains.compose.ui:ui-tooling:${version}"
  }
  
  fun uiToolingPreview(
    version: String
    = getVer("compose")
  ): String {
    return "org.jetbrains.compose.ui:ui-tooling-preview:${version}"
  }
  
  fun materialIconsExtended(
    version: String
    = getVer("compose")
  ): String {
    return "org.jetbrains.compose.material:material-icons-extended:${version}"
  }
}