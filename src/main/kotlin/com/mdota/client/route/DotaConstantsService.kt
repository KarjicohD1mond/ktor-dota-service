package com.mdota.client.route

import com.mdota.client.DotaApiClient.client
import com.mdota.data.model.constants.HeroDto
import com.mdota.data.model.constants.ItemDto
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*

object DotaConstantsService : DotaApiService.Constants {
    override suspend fun getHeroes(): List<HeroDto> {
        val response =
            client.get {
                url {
                    path("/api/constants/heroes")
                }
            }

        val heroesMap = response.body<Map<String, HeroDto>>()
        val heroesList = heroesMap.map {
            it.value
        }
        return heroesList
    }

    override suspend fun getItems(): Map<String, ItemDto> {
        val response =
            client.get {
                url {
                    path("/api/constants/items")
                }
            }
        return response.body()
    }
}