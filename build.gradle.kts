plugins {
    kotlin("jvm") version "1.8.10"
    id("io.ktor.plugin") version "2.2.3"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.8.10"
}

group = "com.main"
version = "0.0.1"
application {
    mainClass.set("io.ktor.server.netty.EngineMain")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    //Ktor
    implementation(Dependencies.Ktor.CallLogging)
    implementation(Dependencies.Ktor.CallLogging)
    implementation(Dependencies.Ktor.ContentNegotiation)
    implementation(Dependencies.Ktor.Core)
    implementation(Dependencies.Ktor.Serialization)
    implementation(Dependencies.Ktor.Auth)
    implementation(Dependencies.Ktor.AuthJVM)
    implementation(Dependencies.Ktor.Netty)
    implementation(Dependencies.Ktor.NettyJWM)
    testImplementation(Dependencies.Ktor.Tests)
    //Logback
    implementation(Dependencies.Logback.Classic)
    //Kotlin
    testImplementation(Dependencies.Kotlin.JUnit)
    //Kmongo
    implementation(Dependencies.KMongo.Main)
    implementation(Dependencies.KMongo.Coroutine)
    //Codec
    implementation(Dependencies.Codec.Main)
    //Java JWT
    implementation(Dependencies.JavaJWT.Main)
    //Javalin
    implementation(Dependencies.Javalin.Main)
}