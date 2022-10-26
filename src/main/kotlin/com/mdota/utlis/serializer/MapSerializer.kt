package com.mdota.utlis.serializer

import com.mdota.data.model.constants.Hero
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object MapSerializer : KSerializer<Map<String, Hero>> {
    private val mapSerializer = MapSerializer(String.serializer(), Hero.serializer())

    override val descriptor: SerialDescriptor get() = mapSerializer.descriptor

    override fun serialize(encoder: Encoder, value: Map<String, Hero>) {
        mapSerializer.serialize(encoder, value)
    }

    override fun deserialize(decoder: Decoder): Map<String, Hero> {
        return mapSerializer.deserialize(decoder)
    }
}