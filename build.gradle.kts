import publish.configPublishPlan1

buildscript {
  initVersions(rootProject)
  
  repositories {
    maven("https://repo.huaweicloud.com/repository/maven/")
    gradlePluginPortal()
    google()
    mavenCentral()
  }
  
  dependencies {
    classpath(classpath.kotlinGradlePlugin)
    classpath(classpath.androidToolsBuildGradle)
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
    maven("https://repo.huaweicloud.com/repository/maven/")
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
    mavenCentral()
    mavenLocal()
  }
}
//buildSrc
//println("subprojects.size=${subprojects.size}")
//subprojects.forEach{
//  println("name=$name")
//
//}
//配置子模块的发布信息。
subprojects {
//  println("name=$name")
//  if(name=="buildSrc"){
//    val path = rootProject.path + "/buildSrcBuild"
//    println("path=$path")
//    setBuildDir(path)
//  }
  configPublishPlan1()
}

