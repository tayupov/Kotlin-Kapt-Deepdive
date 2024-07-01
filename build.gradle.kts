plugins {
    kotlin("jvm") version "1.9.23"
    kotlin("kapt") version "2.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
}

dependencies {
    kapt("com.google.dagger:dagger-compiler:2.38.1")
    implementation("com.google.dagger:dagger:2.38.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

kapt {
    correctErrorTypes = true
    mapDiagnosticLocations = true
    arguments {
        arg("kapt.mode", "compile")
    }
}