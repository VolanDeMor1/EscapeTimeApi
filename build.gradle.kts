import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.21"
}

group = "lol.asgard"
version = "1.2"

repositories {
    mavenCentral()
    maven("https://repo.purpurmc.org/snapshots")
    maven("https://jitpack.io")
}

dependencies {
    testImplementation(kotlin("test"))
    compileOnly("org.purpurmc.purpur:purpur-api:1.19.4-R0.1-SNAPSHOT")
    compileOnly("net.kyori:adventure-text-minimessage:4.13.0")
    implementation("com.github.jitpack:gradle-simple:master-SNAPSHOT")
}

tasks.compileJava {
    options.encoding = "UTF-8"
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

kotlin {
    jvmToolchain(17)
}
