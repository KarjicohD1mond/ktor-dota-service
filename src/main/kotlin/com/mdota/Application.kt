package com.mdota



import com.mdota.client.route.DotaConstantsService
import kotlinx.serialization.json.Json


private val json = Json {
    ignoreUnknownKeys = true
}

suspend fun main() {

    val heroes = DotaConstantsService.getHeroes()
    println(heroes)

    val items = DotaConstantsService.getItems()
    println(items)

}