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
  val activityCompose = activityCompose()
  val constraintLayout = constraintLayout()
  val coreKtx = coreKtx()
  fun appCompat(
    version: String = getVer("androidx_appcompat")
  ): String {
    return "androidx.appcompat:appcompat:${version}"
  }
  
  
  fun activityCompose(
    version: String
    = getVer("androidx_activity_compose")
  ): String {
    return "androidx.activity:activity-compose:${version}"
  }
  
  fun constraintLayout(
    version: String
    = getVer("androidx_constraintlayout_compose")
  ): String {
    return "androidx.constraintlayout:constraintlayout-compose:${version}"
  }
  
  fun coreKtx(
    version: String
    = getVer("androidx_core_ktx")
  ): String {
    return "androidx.core:core-ktx:${version}"
  }
}