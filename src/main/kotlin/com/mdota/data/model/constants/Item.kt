package com.mdota.data.model.constants


import com.mdota.utlis.serializer.IntBooleanColumnSerializer
import com.mdota.utlis.serializer.ListStringColumnSerializer
import kotlinx.serialization.Serializable

@Serializable
data class Item(
    @Serializable(with = IntBooleanColumnSerializer::class)
    val cd: Int? = null,
    val img: String? = null,
    val components: List<String>? = null,
    val cost: Int? = null,
    val notes: String? = null,
    val lore: String? = null,
    val created: Boolean? = null,
    @Serializable(with = IntBooleanColumnSerializer::class)
    val charges: Int? = null,
    val attrib: List<Attribute>? = null,
    @Serializable(with = IntBooleanColumnSerializer::class)
    val mc: Int? = null,
    val hint: List<String>? = null,
    val qual: String? = null,
    val id: Int? = null,
    val dname: String? = null
)

@Serializable
data class Attribute(
    val footer: String? = null,
    val header: String? = null,
    @Serializable(with = ListStringColumnSerializer::class)
    val value: List<String>? = null,
    val key: String? = null
)