package com.mdota



import com.mdota.data.model.constants.HeroData
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.util.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.builtins.*



private val json = Json {
    ignoreUnknownKeys = true
}

suspend fun main() {
    val client = HttpClient() {
        install(Logging) {
            logger = Logger.DEFAULT
            level = LogLevel.BODY
        }
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }
    }
    val response: HttpResponse = client.request("https://api.opendota.com/api/constants/heroes") {
        method = HttpMethod.Get
    }
    val result = response.body<Map<String, HeroData>>()
    println(result)
    client.close()
}