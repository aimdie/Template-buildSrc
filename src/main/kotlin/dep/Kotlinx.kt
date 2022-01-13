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
  val SerializationJson =
    "org.jetbrains.kotlinx:kotlinx-serialization-json:${Kotlin.KotlinxSerializationJson}"
  
  /**
   * [ver.Kotlin.KotlinxCoroutinesCore]
   */
  val CoroutinesCore =
    "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Kotlin.KotlinxCoroutinesCore}"
  
}