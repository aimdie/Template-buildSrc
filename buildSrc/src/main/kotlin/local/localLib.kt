package local

import publish.mGroupId
import publish.util.getVersionIlike

/**
 * @作者 向死而生
 * @时间 2022/1/17 10:56
 * @该类描述： -
 * @使用说明： -
 */
fun getLocalLib(id: String, version: String = "+"): String {
  return "$mGroupId:lib-$id:$version"
}