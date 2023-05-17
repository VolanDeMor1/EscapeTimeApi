plugins {
    kotlin("jvm") version "1.8.21"
}

group = "lol.asgard"
version = "1.1"

repositories {
    mavenCentral()
    maven("https://repo.purpurmc.org/snapshots")
}

dependencies {
    testImplementation(kotlin("test"))
    compileOnly("org.purpurmc.purpur:purpur-api:1.19.4-R0.1-SNAPSHOT")
    compileOnly("net.kyori:adventure-text-minimessage:4.13.0")
}

tasks.compileJava {
    options.encoding = "UTF-8"
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
