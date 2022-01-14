package dep


/**
 * @作者 做就行了！
 * @时间 2021/8/20 11:03
 * @该类描述： -
 * @使用说明： -
 */
object Kotlin {
  val Stdlib =Stdlib()
  
  fun Stdlib(version: String = "+"): String {
    return "org.jetbrains.kotlin:kotlin-stdlib:${version}"
  }
  object Test{
    
    /**
     * 导入后可调试。
     */
    val Junit =Junit()
  
    fun Junit(version: String = "+"): String {
      return "org.jetbrains.kotlin:kotlin-test-junit:${version}"
    }
  }
}