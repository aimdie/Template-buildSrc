package dep

/**
 * @作者 做就行了！
 * @时间 2021/12/24 下午12:48
 * @该类描述： -
 * @使用说明： -
 */
object SqlDelight {
  val AndroidDriver = AndroidDriver("+")
  val NativeDriver = NativeDriver("+")
  val JvmDriver = JvmDriver("+")
  
  fun AndroidDriver(version: String): String {
    return "com.squareup.sqldelight:android-driver:${version}"
  }
  
  fun NativeDriver(version: String): String {
    return "com.squareup.sqldelight:native-driver:${version}"
  }
  
  fun JvmDriver(version: String): String {
    return "com.squareup.sqldelight:sqlite-driver:${version}"
  }
}