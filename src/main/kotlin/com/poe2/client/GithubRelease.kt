package com.poe2.client

import io.micronaut.serde.annotation.Serdeable

@Serdeable
data class GithubRelease(val name: String, val url: String)