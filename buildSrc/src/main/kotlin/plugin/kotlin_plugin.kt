@file:Suppress("PackageDirectoryMismatch")

import org.gradle.kotlin.dsl.kotlin
import org.gradle.plugin.use.PluginDependenciesSpec

/**
 * @作者 做就行了！
 * @时间 2021/8/20 20:50
 * @该类描述： -
 * @使用说明： -
 */
fun PluginDependenciesSpec.pluginKotlinMultiplatform(){
  kotlin("multiplatform")
}
fun PluginDependenciesSpec.pluginKotlinAndroid(){
  kotlin("android")
}
fun PluginDependenciesSpec.pluginKotlinSerialization(){
  kotlin("plugin.serialization")
}

/**
 * kotlin-parcelize必须在com.android.library之后。
 */
fun PluginDependenciesSpec.pluginKotlinParcelize(){
  id("kotlin-parcelize")
}
fun PluginDependenciesSpec.pluginKotlinAndroidExtension(){
  id("kotlin-android-extensions")
}
