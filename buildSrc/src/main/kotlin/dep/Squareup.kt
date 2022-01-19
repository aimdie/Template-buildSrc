package dep

import getVer

/**
 * @作者 做就行了！
 * @时间 22.1.14 22:20
 * @该类描述： -
 * @使用说明： -
 */
object Squareup {
  object Okio {
    val okio = okio()
    fun okio(version: String = getVer("squareup_okio")): String {
      return "com.squareup.okio:okio:${version}"
    }
  }
  
  object SqlDelight {
    val runtime = runtime()
    val androidDriver = androidDriver()
    val nativeDriver = nativeDriver()
    val jvmDriver = jvmDriver()
    
    fun runtime(version: String = getVer("squareup_sqldelight")): String {
      return "com.squareup.sqldelight:runtime:${version}"
    }
    
    fun androidDriver(version: String = getVer("squareup_sqldelight")): String {
      return "com.squareup.sqldelight:android-driver:${version}"
    }
    
    fun nativeDriver(version: String = getVer("squareup_sqldelight")): String {
      return "com.squareup.sqldelight:native-driver:${version}"
    }
    
    fun jvmDriver(version: String = getVer("squareup_sqldelight")): String {
      return "com.squareup.sqldelight:sqlite-driver:${version}"
    }
  }
}