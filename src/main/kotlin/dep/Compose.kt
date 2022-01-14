package dep

/**
 * @作者 做就行了！
 * @时间 2021/8/20 20:56
 * @该类描述： -
 * @使用说明： -
 */
object Compose {
  val Ui = Ui()
  val Material = Material()
  val Animation = Animation()
  val Foundation = Foundation()
  val Runtime = Runtime()
  val UiTooling = UiTooling()
  val Preview = Preview()
  val MaterialIconsExtended = MaterialIconsExtended()
  
  object Android {
    val UiTooling = UiTooling()
    val UiToolingPreview =UiToolingPreview()
    val Activity = Activity()
    val ConstraintLayout =ConstraintLayout()
    //////////////////////////////////////////////////
    
    fun UiTooling(version: String = "+"): String {
      return "androidx.compose.ui:ui-tooling:${version}"
    }
    
    fun UiToolingPreview(version: String = "+"): String {
      return "androidx.compose.ui:ui-tooling-preview:${version}"
    }
    
    fun Activity(version: String = "+"): String {
      return "androidx.activity:activity-compose:${version}"
    }
    
    fun ConstraintLayout(version: String = "+"): String {
      return "androidx.constraintlayout:constraintlayout-compose:${version}"
    }
  }
  //////////////////////////////////////////////////
  
  fun Ui(version: String = "+"): String {
    return "org.jetbrains.compose.ui:ui:${version}"
  }
  
  fun Material(version: String = "+"): String {
    return "org.jetbrains.compose.material:material:${version}"
  }
  
  fun Animation(version: String = "+"): String {
    return "org.jetbrains.compose.animation:animation:${version}"
  }
  
  fun Foundation(version: String = "+"): String {
    return "org.jetbrains.compose.foundation:foundation:${version}"
  }
  
  fun Runtime(version: String = "+"): String {
    return "org.jetbrains.compose.runtime:runtime:${version}"
  }
  
  fun UiTooling(version: String = "+"): String {
    return "org.jetbrains.compose.ui:ui-tooling:${version}"
  }
  
  fun Preview(version: String = "+"): String {
    return "org.jetbrains.compose.ui:ui-tooling-preview:${version}"
  }
  
  fun MaterialIconsExtended(version: String = "+"): String {
    return "org.jetbrains.compose.material:material-icons-extended:${version}"
  }
}