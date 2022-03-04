//package funx//@file:Suppress("PackageDirectoryMismatch")
//
//import groovy.lang.Closure
//import org.gradle.api.artifacts.Dependency
//import org.gradle.api.artifacts.ExternalModuleDependency
//import org.gradle.util.ConfigureUtil
//import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler
//
///**
// * @作者 做就行了！
// * @时间 2022/1/18 17:33
// * @该类描述： -
// * @使用说明： -
// */
//
//fun KotlinDependencyHandler.imp(dependencyNotation: Any): Dependency? {
//  return implementation(dependencyNotation)
//}
//
//fun KotlinDependencyHandler.imp(
//  dependencyNotation: String,
//  configure: ExternalModuleDependency.() -> Unit
//): ExternalModuleDependency {
//  return implementation(dependencyNotation, configure)
//}
//
//fun <T : Dependency> KotlinDependencyHandler.imp(dependency: T, configure: T.() -> Unit): T {
//  return implementation(dependency, configure)
//}
//
//fun KotlinDependencyHandler.imp(dependencyNotation: String, configure: Closure<*>) =
//  implementation(dependencyNotation) { ConfigureUtil.configure(configure, this) }
//
//fun <T : Dependency> KotlinDependencyHandler.imp(dependency: T, configure: Closure<*>) =
//  implementation(dependency) { ConfigureUtil.configure(configure, this) }
