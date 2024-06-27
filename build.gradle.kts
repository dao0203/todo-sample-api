plugins {
    kotlin("jvm") version "2.0.0"
    id("io.ktor.plugin") version "2.3.4"
}

group = "org.dao"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.ktor:ktor-server-netty")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}