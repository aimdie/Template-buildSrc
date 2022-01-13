package dep

/**
 * @作者 做就行了！
 * @时间 2021/8/20 11:04
 * @该类描述： -
 * @使用说明： -
 */
object Android {
  val AppCompat = AppCompat("+")
  fun AppCompat(version: String): String {
    return "androidx.appcompat:appcompat:${version}"
  }
}