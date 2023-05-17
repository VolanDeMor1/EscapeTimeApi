import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.21"
    id("java")
    id("maven-publish")
}

val groupVal = "lol.asgard"
val artifactVal = "EscapeTimeApi"
val versionVal = "1.2.1"

group = groupVal
version = versionVal

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

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = groupId
            artifactId = artifactVal
            version = versionVal

            from(components["java"])
        }
    }
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

tasks.javadoc {
    if (JavaVersion.current().isJava9Compatible) {
        (options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
    }
}

kotlin {
    jvmToolchain(17)
}

java {
    withJavadocJar()
    withSourcesJar()
}
