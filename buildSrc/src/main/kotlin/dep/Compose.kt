package dep

import getVer

/**
 * @作者 做就行了！
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
    val activity = activity()
    val constraintLayout = constraintLayout()
    //////////////////////////////////////////////////
    
    fun uiTooling(
      version: String
      = getVer("compose_android_ui_tooling")
    ): String {
      return "androidx.compose.ui:ui-tooling:${version}"
    }
    
    fun uiToolingPreview(
      version: String
      = getVer("compose_android_ui_tooling_preview")
    ): String {
      return "androidx.compose.ui:ui-tooling-preview:${version}"
    }
    
    fun activity(
      version: String
      = getVer("compose_android_activity")
    ): String {
      return "androidx.activity:activity-compose:${version}"
    }
    
    fun constraintLayout(
      version: String
      = getVer("compose_android_constraintlayout")
    ): String {
      return "androidx.constraintlayout:constraintlayout-compose:${version}"
    }
  }
  //////////////////////////////////////////////////
  
  fun ui(
    version: String
    = getVer("compose_ui")
  ): String {
    return "org.jetbrains.compose.ui:ui:${version}"
  }
  
  fun material(
    version: String
    = getVer("compose_material")
  ): String {
    return "org.jetbrains.compose.material:material:${version}"
  }
  
  fun animation(
    version: String
    = getVer("compose_animation")
  ): String {
    return "org.jetbrains.compose.animation:animation:${version}"
  }
  
  fun foundation(
    version: String
    = getVer("compose_foundation")
  ): String {
    return "org.jetbrains.compose.foundation:foundation:${version}"
  }
  
  fun runtime(
    version: String
    = getVer("compose_runtime")
  ): String {
    return "org.jetbrains.compose.runtime:runtime:${version}"
  }
  
  fun uiTooling(
    version: String
    = getVer("compose_ui_tooling")
  ): String {
    return "org.jetbrains.compose.ui:ui-tooling:${version}"
  }
  
  fun uiToolingPreview(
    version: String
    = getVer("compose_ui_tooling_preview")
  ): String {
    return "org.jetbrains.compose.ui:ui-tooling-preview:${version}"
  }
  
  fun materialIconsExtended(
    version: String
    = getVer("compose_material_icons_extended")
  ): String {
    return "org.jetbrains.compose.material:material-icons-extended:${version}"
  }
}