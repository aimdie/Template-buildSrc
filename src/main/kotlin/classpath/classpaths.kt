package classpath

import init.getVer

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

fun KotlinGradlePlugin(version: String = getVer("kotlin")): String {
//  println("DEBUG:KotlinGradlePlugin:version=$version")
//  println("DEBUG:KotlinGradlePlugin:version=$version")
//  println("DEBUG:KotlinGradlePlugin:version=$version")
  return "org.jetbrains.kotlin:kotlin-gradle-plugin:${version}"
}

fun AndroidToolsBuildGradle(version: String = getVer("android_gradle_tool")): String {
  return "com.android.tools.build:gradle:${version}"
}