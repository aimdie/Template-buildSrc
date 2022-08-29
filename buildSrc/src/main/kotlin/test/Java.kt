package test

import getVer

/**
 * @作者 向死而生
 * @时间 2021/8/20 11:05
 * @该类描述： -
 * @使用说明： -
 */
object Java {
  val junit = junit()
  val junitJupiterApi = junitJupiterApi()
  
  fun junit(version: String = getVer("junit")): String {
    return "junit:junit:${version}"
  }
  
  fun junitJupiterApi(version: String = getVer("org_junit_jupiter_api")): String {
    return "org.junit.jupiter:junit-jupiter-api:${version}"
  }
}