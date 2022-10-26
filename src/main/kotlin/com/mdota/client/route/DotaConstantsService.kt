package com.mdota.client.route

import com.mdota.client.DotaApiClient.client
import com.mdota.data.model.constants.Hero
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*

object DotaConstantsService : DotaApiService.Constants {
    override suspend fun getHeroes(): Map<String, Hero> {
        val response =
            client.get {
                url {
                    path("/api/constants/heroes")
                }
            }
        val result = response.body<Map<String, Hero>>()
        client.close()
        return result
    }
}