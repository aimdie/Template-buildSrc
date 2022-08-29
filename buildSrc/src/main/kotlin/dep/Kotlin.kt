package dep

import getVer


/**
 * @作者 向死而生
 * @时间 2021/8/20 11:03
 * @该类描述： -
 * @使用说明： -
 */
object Kotlin {
  val stdlib = stdlib()
  
  fun stdlib(version: String = getVer("kotlin")): String {
    return "org.jetbrains.kotlin:kotlin-stdlib:${version}"
  }
  
  object Java {
    val reflect = reflect()
    fun reflect(version: String = getVer("kotlin")): String {
      return "org.jetbrains.kotlin:kotlin-reflect:${version}"
    }
  }
}