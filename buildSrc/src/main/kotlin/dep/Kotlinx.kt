package dep

import getVer


/**
 * @作者 向死而生
 * @时间 2021/8/20 11:03
 * @该类描述： -
 * @使用说明： -
 */
object Kotlinx {
  
  /**
   * 自动导入"serializationCore"。
   */
  val serializationJson = serializationJson()
  
  val coroutinesCore = coroutinesCore()
  val atomicfu = atomicfu()
  
  //  fun serializationJson(version: String = "+" = "+"): String {
  fun serializationJson(version: String = getVer("kotlinx_serialization_json")): String {
    return "org.jetbrains.kotlinx:kotlinx-serialization-json:${version}"
  }
  
  fun coroutinesCore(version: String = getVer("kotlinx_coroutines_core")): String {
    return "org.jetbrains.kotlinx:kotlinx-coroutines-core:${version}"
  }
  
  fun atomicfu(version: String = getVer("kotlinx_atomicfu")): String {
    return "org.jetbrains.kotlinx:atomicfu:${version}"
  }
}