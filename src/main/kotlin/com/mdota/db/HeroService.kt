package com.mdota.db

import com.mdota.data.model.dbmodel.Hero
import com.mongodb.client.MongoClient
import org.litote.kmongo.*


class HeroService(client: MongoClient) {
    private val database = client.getDatabase("heroes")
    private val heroCollection = database.getCollection<Hero>()

    suspend fun createHeroes(heroes: List<Hero>) {
        heroes.forEach {
            createHero(it)
        }
    }

    suspend fun createHero(hero: Hero) {
        updateOne(hero)
    }

    suspend fun updateOne(hero: Hero) {
        heroCollection.updateOne(
            Hero::idHero eq hero.idHero,
            set(
                SetTo(Hero::name, hero.name),
                SetTo(Hero::img, hero.img)
            ),
            upsert()
        )
    }

    suspend fun findAll(): List<Hero> =
        heroCollection.find()
            .toList()


    suspend fun findByHeroId(idHero: String): Hero? {
        val caseSensitiveTypeSafeFilter = Hero::name regex idHero
        return heroCollection.findOne(idHero)
    }

    suspend fun findByName(name: String): List<Hero> {
        val caseSensitiveTypeSafeFilter = Hero::name regex name
        return heroCollection.find(caseSensitiveTypeSafeFilter)
            .toList()
    }
}