package test
import getVer
/**
 * @作者 向死而生
 * @时间 2022/7/23 20:39
 * @该类描述： -
 * @使用说明： -
 */

object Squareup {
  object Okio {
    val fakefilesystem = fakefilesystem()
    fun fakefilesystem(version: String = getVer("squareup_okio")): String {
      return "com.squareup.okio:okio-fakefilesystem:${version}"
    }
  }
}