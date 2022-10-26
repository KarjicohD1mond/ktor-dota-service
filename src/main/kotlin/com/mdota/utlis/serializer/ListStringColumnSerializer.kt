package com.mdota.utlis.serializer

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.jsonArray

object ListStringColumnSerializer : KSerializer<List<String>?> {
    private val listSerializer = ListSerializer(String.serializer())
    override val descriptor: SerialDescriptor
        get() = ListSerializer(String.serializer()).descriptor

    override fun deserialize(decoder: Decoder): List<String>? = with(decoder as JsonDecoder) {
        try {
            return decodeJsonElement().jsonArray.mapNotNull {
                try {
                    json.decodeFromJsonElement(String.serializer(), it)
                } catch (e: SerializationException) {
                    return null
                }
            }
        } catch (e: IllegalArgumentException) {
            return null
        }
    }

    override fun serialize(encoder: Encoder, value: List<String>?) {
        listSerializer.serialize(encoder, value ?: listOf())
    }
}