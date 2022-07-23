package test

import getVer

/**
 * @作者 向死而生
 * @时间 2022/7/23 18:27
 * @该类描述： -
 * @使用说明： -
 */
object Android {
  val junitKtx = junitKtx()
  val junit = junit()
  val espresso=espresso()
  fun espresso(version: String = getVer("androidx_test_espresso")): String {
  return "androidx.test.espresso:espresso-core:${version}"
  }
  fun junit(version: String = getVer("androidx_test_junit")): String {
    return "androidx.test.ext:junit:${version}"
  }
  fun junitKtx(version: String = getVer("androidx_test_junit_ktx")): String {
    return "androidx.test.ext:junit-ktx:${version}"
  }
  
}