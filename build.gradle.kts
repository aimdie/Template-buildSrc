plugins {
  `kotlin-dsl`
  `java-gradle-plugin`
}

repositories {
  mavenCentral()
  maven("https://repo.huaweicloud.com/repository/maven/")
}

//gradlePlugin {
//  plugins.register("person-publish") {
//    id = "person-publish"
//    implementationClass = "PersonPublish"
//  }
//}