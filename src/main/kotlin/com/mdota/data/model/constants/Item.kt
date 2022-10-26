package com.mdota.data.model.constants

import kotlinx.serialization.Serializable

@Serializable
data class Item(
    val cd: Int? = null,
    val img: String? = null,
    val components: String? = null,
    val cost: Int? = null,
    val notes: String? = null,
    val lore: String? = null,
    val created: Boolean? = null,
    val charges: Boolean? = null,
    val attrib: List<Attribute>? = null,
    val mc: Boolean? = null,
    val hint: List<String?>? = null,
    val qual: String? = null,
    val id: Int? = null,
    val dname: String? = null
)

@Serializable
data class Attribute(
    val footer: String? = null,
    val header: String? = null,
    val value: String? = null,
    val key: String? = null
)