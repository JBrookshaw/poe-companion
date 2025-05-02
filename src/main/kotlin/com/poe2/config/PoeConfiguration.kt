package com.poe2.config

import io.micronaut.context.annotation.ConfigurationProperties
import io.micronaut.context.annotation.Requires

@ConfigurationProperties(PoeConfiguration.PREFIX)
@Requires(property = PoeConfiguration.PREFIX)
class PoeConfiguration {

    companion object {
        const val PREFIX = "poe"
    }
}