package com.main.services.routing

import com.main.data.token.TokenConfig
import com.main.database.UserDataSource
import com.main.security.hashing.HashingService
import com.main.security.token.TokenService
import com.main.services.routing.auth.authenticateRouting
import com.main.services.routing.auth.getUserIdRouting
import com.main.services.routing.auth.signInRouting
import com.main.services.routing.auth.signUpRouting
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting(
    userDataSource: UserDataSource,
    hashingService: HashingService,
    tokenService: TokenService,
    tokenConfig: TokenConfig
) {
    routing {
        signInRouting(
            userDataSource = userDataSource,
            hashingService = hashingService,
            tokenService = tokenService,
            tokenConfig = tokenConfig
        )
        signUpRouting(
            userDataSource = userDataSource,
            hashingService = hashingService
        )
        authenticateRouting()
        getUserIdRouting()
    }
}