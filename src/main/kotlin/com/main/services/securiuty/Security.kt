package com.main.services.securiuty

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import com.main.data.token.TokenConfig
import com.typesafe.config.ConfigFactory
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.auth.jwt.*

fun Application.configureSecurity(tokenConfig: TokenConfig) {
    val config = ConfigFactory.load().getConfig("ktor")
    authentication {
        jwt {
            realm = config.getString("jwt.realm")
            verifier(
                JWT.require(Algorithm.HMAC256(tokenConfig.secret))
                    .withAudience(tokenConfig.audience)
                    .withIssuer(tokenConfig.issuer)
                    .build()
            )
            validate { credential ->
                if (credential.payload.audience.contains(tokenConfig.audience)) {
                    JWTPrincipal(credential.payload)
                } else null
            }
        }
    }
}