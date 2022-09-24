package dep

import getVer

/**
 * @作者 向死而生
 * @时间 2022/8/30 9:52
 * @该类描述： -
 * @使用说明： -
 */
object Ktor {
  val io = io()
  fun io(version: String = getVer("ktor_io")): String {
    return "io.ktor:ktor-io:${version}"
  }
}