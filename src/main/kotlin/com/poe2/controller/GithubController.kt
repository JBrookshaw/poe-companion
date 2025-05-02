package com.poe2.controller

import com.poe2.client.GithubClient
import com.poe2.client.GithubRelease
import io.micronaut.core.async.annotation.SingleResult
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import org.reactivestreams.Publisher

@Controller("/github")
class GithubController(private val githubLowLevelClient: GithubClient,
                       private val githubApiClient: GithubClient) {

    @Get("/releases-lowlevel")
    @SingleResult
    fun releasesWithLowLevelClient(): Publisher<List<GithubRelease>> {
        return githubLowLevelClient.fetchReleases()
    }

    @Get("/releases")
    @SingleResult
    fun fetchReleases(): Publisher<List<GithubRelease>> {
        return githubApiClient.fetchReleases()
    }
}