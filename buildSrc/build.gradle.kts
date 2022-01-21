plugins {
  `kotlin-dsl`
}

repositories {
  google()
  mavenCentral()
}

setBuildDir(project.projectDir.parent + "/.${name}Build")