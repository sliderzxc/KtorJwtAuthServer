package com.main.app

import com.main.data.token.TokenConfig
import com.main.database.MongoUserDataSource
import com.main.security.hashing.SHA256HashingService
import com.main.security.token.JwtTokenService
import com.main.services.monitoring.configureMonitoring
import com.main.services.routing.configureRouting
import com.main.services.securiuty.configureSecurity
import com.main.services.serialization.configureSerialization
import com.typesafe.config.ConfigFactory
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

fun Application.startApplication() {
//    val config = ConfigFactory.load().getConfig("ktor")
//    val hashingService = SHA256HashingService()
//    val mongoPw = System.getenv("MONGO_PW")
//    val dbName = "KtorJwtAuthService"
//    val connectionString = "mongodb+srv://vadymhrynyk:$mongoPw@cluster0.zyib6zc.mongodb.net/$dbName?retryWrites=true&w=majority"
//    val db = KMongo.createClient(connectionString).coroutine.getDatabase(dbName)
//    val userDataSource = MongoUserDataSource(db)
//    val tokenService = JwtTokenService()
//    val tokenConfig = TokenConfig(
//        issuer = config.getString("jwt.issuer"),
//        audience = config.getString("jwt.audience"),
//        expiresIn = 365L * 1000L * 60L * 60L * 24L,
//        secret = System.getenv("JWT_SECRET")
//    )
//
//    configureSerialization()
//    configureMonitoring()
//    configureSecurity(tokenConfig)
    configureRouting(
//        userDataSource = userDataSource,
//        hashingService = hashingService,
//        tokenService = tokenService,
//        tokenConfig = tokenConfig
    )
}

fun main() {
    embeddedServer(Netty, 8080) {
        startApplication()
    }.start(true)
}