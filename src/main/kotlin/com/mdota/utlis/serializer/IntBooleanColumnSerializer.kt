package com.mdota.utlis.serializer

import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object IntBooleanColumnSerializer : KSerializer<Int?> {
    private val intSerializer = Int.serializer()
    override val descriptor: SerialDescriptor
        get() = Int.serializer().descriptor

    override fun serialize(encoder: Encoder, value: Int?) {
        intSerializer.serialize(encoder, value ?: 0)
    }


    override fun deserialize(decoder: Decoder): Int? {
        val value = decoder.decodeString()
        return value.toIntOrNull()
    }
}