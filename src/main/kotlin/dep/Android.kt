package dep

import init.getVer

/**
 * @作者 做就行了！
 * @时间 2021/8/20 11:04
 * @该类描述： -
 * @使用说明： -
 */
object Android {
  val appCompat = appCompat()
  fun appCompat(
    version: String = getVer("android_appcompat")
  ): String {
    return "androidx.appcompat:appcompat:${version}"
  }
}