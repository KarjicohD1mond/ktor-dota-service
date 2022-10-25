package com.mdota.utlis

import com.mdota.data.model.constants.HeroData
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object MapSerializer: KSerializer<Map<String, HeroData>> {
    private val mapSerializer = MapSerializer(String.serializer(), HeroData.serializer())

    override val descriptor: SerialDescriptor = mapSerializer.descriptor

    override fun serialize(encoder: Encoder, value: Map<String, HeroData>) {
        mapSerializer.serialize(encoder, value)
    }

    override fun deserialize(decoder: Decoder): Map<String, HeroData> {
        return mapSerializer.deserialize(decoder)
    }
}