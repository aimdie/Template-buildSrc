package ver

import org.gradle.api.Project
import java.io.FileInputStream
import java.lang.reflect.Constructor
import java.lang.reflect.Field
import java.util.*

/**
 * @作者 做就行了！
 * @时间 22.1.14 22:43
 * @该类描述： -
 * @使用说明： -
 */
object SumLib{
  val kotlin_ver = "1.5.32"
  val kotlinx_coroutine_ver = "1.6.0"
  val kotlinx_serialization_ver = "1.3.2"
  val okio_ver = "3.0.0"
  val sqldelight_ver = "1.5.3"
  fun Project.m(){
    val c: Class<*> = Class.forName("")
    val cs: Constructor<*> = c.constructors.get(0)
    val method = c.getMethod("")
    val field = c.getDeclaredField("")
//    field.get()
    val ist: Any = cs.newInstance()
//    ist.
    val properties: Properties = Properties()
    properties.load(FileInputStream(this.rootProject.file("gradle.properties")))
//    kotlin.reflect.KTypeProjection
//    kotlin.reflect.
//    KTypeParameter
//    kotlin.reflect.KVariance
//    kotlin.reflect.KVisibility
  }
}