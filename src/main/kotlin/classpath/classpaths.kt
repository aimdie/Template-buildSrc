package classpath

/**
 * @作者 做就行了！
 * @时间 2021/8/20 11:13
 * @该类描述： -
 * @使用说明： -
 */
/**
 * [ver.Kotlin.KotlinVersion]
 */
val KotlinGradlePlugin = KotlinGradlePlugin()

/**
 * [ver.ClassPath.AndroidToolsBuildGradle]
 * 对应的gradle版本。
distributionUrl=https\://services.gradle.org/distributions/gradle-7.1-all.zip
 */
val AndroidToolsBuildGradle = AndroidToolsBuildGradle()

fun KotlinGradlePlugin(version: String = "+"): String {
  return "org.jetbrains.kotlin:kotlin-gradle-plugin:${version}"
}
fun AndroidToolsBuildGradle(version: String = "+"): String {
  return "com.android.tools.build:gradle:${version}"
}