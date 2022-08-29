@file:Suppress("PackageDirectoryMismatch")

import org.gradle.plugin.use.PluginDependenciesSpec

/**
 * @作者 向死而生
 * @时间 2022/1/19 22:45
 * @该类描述： -
 * @使用说明： -
 */
fun PluginDependenciesSpec.pluginCompose(
  version: String = getVer("compose")
) {
  id("org.jetbrains.compose").version(version)
}