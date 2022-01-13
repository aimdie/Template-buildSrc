package util

import projectVersion
import java.util.Calendar.*

/**
 * 获取库版本。我，月，日。
 * @return String
 */
fun getVersionMe(): String {
  val projectVersion = projectVersion
  if(projectVersion.isNotEmpty()){
    return projectVersion
  }
  val cal = getInstance()
  val year: Int = cal.get(YEAR) - 1992
  val month: Int = cal.get(MONTH) + 1
  val day: Int = cal.get(DATE)
  return "$year.$month.$day"
}
