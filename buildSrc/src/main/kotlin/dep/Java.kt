package dep

import getVer

/**
 * @作者 做就行了！
 * @时间 2021/8/20 11:05
 * @该类描述： -
 * @使用说明： -
 */
object Java {
  val junit =junit()
  
  fun junit(version: String = getVer("java_junit")): String {
    return "org.junit.jupiter:junit-jupiter-api:${version}"
  }
}