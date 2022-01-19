package dep

import getVer

/**
 * @作者 做就行了！
 * @时间 2021/8/20 11:04
 * @该类描述： -
 * @使用说明： -
 */
object Android {
  val appCompat = appCompat()
  val activity = activity()
  val constraintLayout = constraintLayout()
  
  fun appCompat(
    version: String = getVer("android_appcompat")
  ): String {
    return "androidx.appcompat:appcompat:${version}"
  }
  
  
  fun activity(
    version: String
    = getVer("android_activity_compose")
  ): String {
    return "androidx.activity:activity-compose:${version}"
  }
  
  fun constraintLayout(
    version: String
    = getVer("android_constraintlayout_compose")
  ): String {
    return "androidx.constraintlayout:constraintlayout-compose:${version}"
  }
}