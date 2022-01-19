package classpath

import getVer
/**
 * @作者 做就行了！
 * @时间 2021/8/20 11:13
 * @该类描述： -
 * @使用说明： -
 */
val KotlinGradlePlugin = KotlinGradlePlugin()

val AndroidToolsBuildGradle = AndroidToolsBuildGradle()
fun KotlinGradlePlugin(
  version: String = getVer("kotlin")
): String {
  return "org.jetbrains.kotlin:kotlin-gradle-plugin:${version}"
}

fun AndroidToolsBuildGradle(
  version: String = getVer("android_tools_build_gradle")
): String {
  return "com.android.tools.build:gradle:${version}"
}