package dep

import ver.Kotlin

/**
 * @作者 做就行了！
 * @时间 2021/8/20 11:03
 * @该类描述： -
 * @使用说明： -
 */
object Kotlinx {
  /**
   * 自动导入"serializationCore"。
   * [ver.Kotlin.KotlinxSerializationJson]
   */
  val SerializationJson =SerializationJson("+")
  
  /**
   * [ver.Kotlin.KotlinxCoroutinesCore]
   */
  val CoroutinesCore =CoroutinesCore("+")
  
  fun SerializationJson(version: String): String {
    return "org.jetbrains.kotlinx:kotlinx-serialization-json:${version}"
  }
  fun CoroutinesCore(version: String): String {
    return "org.jetbrains.kotlinx:kotlinx-coroutines-core:${version}"
  }
}