object Dependencies {

    object Ktor {
        private const val version = "2.2.3"

        const val CallLogging = "io.ktor:ktor-server-call-logging-jvm:$version"
        const val ContentNegotiation = "io.ktor:ktor-server-content-negotiation-jvm:$version"
        const val Core = "io.ktor:ktor-server-core-jvm:$version"
        const val Serialization = "io.ktor:ktor-serialization-kotlinx-json-jvm:$version"
        const val Auth = "io.ktor:ktor-server-auth-jvm:$version"
        const val AuthJVM = "io.ktor:ktor-server-auth-jwt-jvm:$version"
        const val Netty = "io.ktor:ktor-server-netty-jvm:$version"
        const val Tests = "io.ktor:ktor-server-tests-jvm:$version"
    }

    object Kotlin {
        private const val version = "1.8.10"

        const val JUnit = "org.jetbrains.kotlin:kotlin-test-junit:$version"
    }

    object Logback {
        private const val version = "1.2.11"

        const val Classic = "ch.qos.logback:logback-classic:$version"
    }

    object KMongo {
        private const val version = "4.8.0"

        const val Main = "org.litote.kmongo:kmongo:$version"
        const val Coroutine = "org.litote.kmongo:kmongo-coroutine:$version"
    }

    object Codec {
        private const val version = "1.15"

        const val Main = "commons-codec:commons-codec:$version"
    }
}