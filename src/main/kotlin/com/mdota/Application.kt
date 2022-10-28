package com.mdota


import com.mdota.client.route.DotaConstantsService
import com.mdota.db.HeroService
import com.mdota.utlis.` extension`.configLog
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.serialization.json.Json
import org.litote.kmongo.KMongo

private val client = KMongo.createClient()
private val heroService = HeroService(client)
private val json = Json {
    ignoreUnknownKeys = true
}

suspend fun main() {
    client.configLog(disable = true)
    val heroes = DotaConstantsService.getHeroes()
    println(heroes)
    coroutineScope {
//        async {
//            heroService.createHeroes(heroes.map(HeroDto :: toHero))
//        }
        async {
            val hero = heroService.findByName("Anti-Mage")
            println(hero)
        }

        async {
            val hero = heroService.findByName("A")
            println(hero)
        }

        async {
            val hero = heroService.findByName("t")
            println(hero)
        }
        async {
            val hero = heroService.findByName("w")
            println(hero)
        }
        async {
            val hero = heroService.findByName("c")
            println(hero)
        }
        async {
            val hero = heroService.findByName("cr")
            println(hero)
        }
        async {
            val hero = heroService.findByName("j")
            println(hero)
        }
        async {
            val hero = heroService.findByName("v")
            println(hero)
        }
        async {
            val hero = heroService.findByName("hu")
            println(hero)
        }
        async {
            val hero = heroService.findByName("wing")
            println(hero)
        }
        async {
            val hero = heroService.findByName("ax")
            println(hero)
        }
        async {
            val hero = heroService.findByName("ti")
            println(hero)
        }

    }
}