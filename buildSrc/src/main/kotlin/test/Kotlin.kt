@file:Suppress("PackageDirectoryMismatch")
package test

import getVer

/**
 * @作者 做就行了！
 * @时间 2022/1/24 11:43
 * @该类描述： -
 * @使用说明： -
 */
object Kotlin {
  val testJunit = testJunit()
  val test = test()
  
  fun testJunit(version: String = getVer("kotlin")): String {
    return "org.jetbrains.kotlin:kotlin-test-junit:${version}"
  }
  
  fun test(version: String = getVer("kotlin")): String {
    return "org.jetbrains.kotlin:kotlin-test:${version}"
  }
}
