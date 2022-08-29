@file:Suppress("PackageDirectoryMismatch")

import org.gradle.plugin.use.PluginDependenciesSpec

/**
 * @作者 向死而生
 * @时间 2021/8/20 20:50
 * @该类描述： -
 * @使用说明： -
 */
fun PluginDependenciesSpec.pluginAndroidLibrary() {
  id("com.android.library")
}

fun PluginDependenciesSpec.pluginAndroidApplication() {
  id("com.android.application")
}
