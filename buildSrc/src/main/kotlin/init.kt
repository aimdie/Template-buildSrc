import org.gradle.api.Project
import java.io.FileInputStream
import java.util.*

/**
 * @作者 向死而生
 * @时间 2022/1/15 20:29
 * @该类描述： -
 * @使用说明： -
 */
/**
 * 项目的根目录文件："vers.properties"
 */
private var p: Properties? = null
private var initCount = 0

/**
 * 初始化：项目的根目录文件："vers.properties"
 *
 * 使用方法，调用位置：
 * buildscript {
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
 
 */
fun initVersions(rootProject: Project) {
  initCount++
  if (p != null) {
    println("当前调用次数：initCount=$initCount")
    return
  }
  val fileInputStream = try {
    FileInputStream(rootProject.file(VersionsFileName))
  } catch (e: Exception) {
    return
  }
  p = Properties()
  p!!.load(fileInputStream)
}

internal fun getVer(
  keyInProperties: String,
  defaultVersion: String = "+"
): String {
  val version = p?.get(keyInProperties)?.toString() ?: defaultVersion
  if (debug) {
    println("$keyInProperties=$version")
  }
  return version
}
