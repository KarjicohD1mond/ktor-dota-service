package com.mdota.data.model.dbmodel

import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId

@Serializable
data class Hero(
    val img: String? = null,
    val name: String? = null,
    @BsonId
    val idHero: Int? = null,
)