package com.mdota.client.route

import com.mdota.client.DotaApiClient
import com.mdota.data.model.constants.MatchItemDto
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*

object DotaMatchService : DotaApiService.Matches {
    override suspend fun getProMatches(): List<MatchItemDto> {
        val response =
            DotaApiClient.client.get {
                url {
                    path("/api/proMatches")
                }
            }
        return response.body()
    }

}