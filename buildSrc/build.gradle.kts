import org.gradle.kotlin.dsl.`kotlin-dsl`

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
  val aver = "7.0.4"
  val kver = "1.5.21"
  implementation("com.android.tools.build:gradle:$aver")
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kver")
  implementation("org.jetbrains.kotlin:kotlin-serialization:$kver")
//  implementation("com.android.tools.build:gradle-api:4.2.2")
}