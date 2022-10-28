package com.mdota.utlis.serializer


import com.mdota.data.model.constants.HeroDto
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object MapSerializer : KSerializer<Map<String, HeroDto>> {
    private val mapSerializer = MapSerializer(String.serializer(), HeroDto.serializer())

    override val descriptor: SerialDescriptor get() = mapSerializer.descriptor

    override fun serialize(encoder: Encoder, value: Map<String, HeroDto>) {
        mapSerializer.serialize(encoder, value)
    }

    override fun deserialize(decoder: Decoder): Map<String, HeroDto> {
        return mapSerializer.deserialize(decoder)
    }
}