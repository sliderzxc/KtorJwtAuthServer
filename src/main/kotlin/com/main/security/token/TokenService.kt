package com.main.security.token

import com.main.data.token.TokenClaim
import com.main.data.token.TokenConfig

interface TokenService {
    fun generate(
        config: TokenConfig,
        vararg claims: TokenClaim
    ): String
}