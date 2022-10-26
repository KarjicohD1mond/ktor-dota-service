package com.mdota



import com.mdota.client.route.DotaConstantsService
import com.mdota.data.model.constants.Hero
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.*


private val json = Json {
    ignoreUnknownKeys = true
}

suspend fun main() {
    coroutineScope {
        withContext(Dispatchers.IO) {
            val heroes = DotaConstantsService.getHeroes()
            println(heroes)
        }
    }
}