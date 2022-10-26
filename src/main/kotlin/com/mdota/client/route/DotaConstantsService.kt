package com.mdota.client.route

import com.mdota.client.DotaApiClient.client
import com.mdota.data.model.constants.Hero
import com.mdota.data.model.constants.Item
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*

object DotaConstantsService : DotaApiService.Constants {
    override suspend fun getHeroes(): Map<String, Hero> {
        val response =
            client.get {
                url {
                    path("/api/constants/heroes")
                }
            }
        return response.body()
    }

    override suspend fun getItems(): Map<String, Item> {
        val response =
            client.get {
                url {
                    path("/api/constants/items")
                }
            }
        return response.body()
    }
}