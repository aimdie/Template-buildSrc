import org.gradle.kotlin.dsl.`kotlin-dsl`
import java.util.*
plugins {
  `kotlin-dsl`
  `kotlin-dsl-precompiled-script-plugins`
}

sourceSets{
  setBuildDir(rootDir.toString()+"Build")
}
repositories {
  google()
  mavenCentral()
}

dependencies {
  val versFileName = "vers.properties"
  val file: File = file(versFileName)
  val properties = Properties()
  properties.load(file.inputStream())
  val aver = properties.getProperty("android_tools_build_gradle","+")
  val kver = properties.getProperty("kotlin","+")
  implementation("com.android.tools.build:gradle:$aver")
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kver")
  implementation("org.jetbrains.kotlin:kotlin-serialization:$kver")
//  implementation("com.android.tools.build:gradle-api:4.2.2")
}