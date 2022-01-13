package dep

import ver.Kotlin

/**
 * @作者 做就行了！
 * @时间 2021/8/20 11:03
 * @该类描述： -
 * @使用说明： -
 */
object Kotlin {
  val Stdlib =
    "org.jetbrains.kotlin:kotlin-stdlib:${Kotlin.KotlinVersion}"
  object Test{
    
    /**
     * 导入后可调试。
     */
    val Junit =
      "org.jetbrains.kotlin:kotlin-test-junit:${Kotlin.KotlinVersion}"
  }
}