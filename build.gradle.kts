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
    val logback_version: String by project

    testImplementation(kotlin("test"))
    implementation("io.ktor:ktor-server-netty")
    implementation("ch.qos.logback:logback-classic:$logback_version")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}