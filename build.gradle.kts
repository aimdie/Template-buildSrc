import publish.configPublishPlan1

buildscript {
  initVersions(rootProject)
  
  repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
  }
  
  dependencies {
    classpath(classpath.KotlinGradlePlugin)
    classpath(classpath.AndroidToolsBuildGradle)
  }
}

//plugins {
//  val kotlinVer = "1.5.31"
//  val composeVer = "1.0.0-beta5"
//
//  kotlin("multiplatform").version(kotlinVer).apply(false)
//  kotlin("plugin.serialization").version(kotlinVer).apply(false)
//  id("org.jetbrains.compose").version(composeVer).apply(false)
//}
allprojects {
  repositories {
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
    mavenCentral()
    mavenLocal()
  }
}

//配置子模块的发布信息。
subprojects {
  configPublishPlan1()
}

