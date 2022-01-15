package init

import org.gradle.api.Project
import java.io.FileInputStream
import java.util.*

/**
 * @作者 做就行了！
 * @时间 2022/1/15 20:29
 * @该类描述： -
 * @使用说明： -
 */
/**
 * 项目的根目录文件："vers.properties"
 */
private val VersionsFileName = "vers.properties"
private var p: Properties? = null

/**
 * 初始化：项目的根目录文件："vers.properties"
 */
fun initVersions(rootProject:Project) {
  if(p!=null){
    throw IllegalCallerException("禁止多次初始化。")
  }
  p = Properties()
  p!!.load(FileInputStream(rootProject.file(VersionsFileName)))
}

internal fun getVer(keyInProperties: String, defaultVersion:String="+"): String {
  return p?.get(keyInProperties)?.toString() ?: defaultVersion
}