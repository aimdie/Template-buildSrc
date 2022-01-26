plugins {
  `kotlin-dsl`
}

repositories {
  google()
  mavenCentral()
}
val rootDir = project.rootDir
val projectDir = project.projectDir

println("rootDir=$rootDir")
println("projectDir=$projectDir")
setBuildDir(project.projectDir.parent + "/.builds/.${name}Build")