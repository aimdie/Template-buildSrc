package dep

import getVer

/**
 * @作者 向死而生
 * @时间 2022/9/13 10:27
 * @该类描述： -
 * @使用说明： -
 */
object Korlibs {
  val korim = korim()
  fun korim(version: String = getVer("korlibs_korim")): String {
    return "com.soywiz.korlibs.korim:korim:${version}"
//    return "com.soywiz.korlibs.korim:korim:3.1.0"
  }
}