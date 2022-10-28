package com.mdota.data.model.constants
import kotlinx.serialization.Serializable



@Serializable
data class HeroDto(
    @kotlinx.serialization.SerialName("img")
    val img: String? = null,
    @kotlinx.serialization.SerialName("primary_attr")
    val primaryAttr: String? = null,
    @kotlinx.serialization.SerialName("attack_range")
    val attackRange: Int? = null,
    @kotlinx.serialization.SerialName("attack_type")
    val attackType: String? = null,
    @kotlinx.serialization.SerialName("cm_enabled")
    val cmEnabled: Boolean? = null,
    @kotlinx.serialization.SerialName("roles")
    val roles: List<String>? = null,
    @kotlinx.serialization.SerialName("icon")
    val icon: String? = null,
    @kotlinx.serialization.SerialName("base_mana")
    val baseMana: Int? = null,
    @kotlinx.serialization.SerialName("localized_name")
    val localizedName: String? = null,
    @kotlinx.serialization.SerialName("base_health")
    val baseHealth: Int? = null,
    @kotlinx.serialization.SerialName("legs")
    val legs: Int? = null,
    @kotlinx.serialization.SerialName("id")
    val id: Int? = null,
    @kotlinx.serialization.SerialName("str_gain")
    val strGain: Double? = null,
    @kotlinx.serialization.SerialName("base_armor")
    val baseArmor: Double? = null,
    @kotlinx.serialization.SerialName("attack_rate")
    val attackRate: Double? = null,
    @kotlinx.serialization.SerialName("base_mana_regen")
    val baseManaRegen: Double? = null,
    @kotlinx.serialization.SerialName("base_attack_max")
    val baseAttackMax: Int? = null,
    @kotlinx.serialization.SerialName("base_int")
    val baseInt: Int? = null,
    @kotlinx.serialization.SerialName("int_gain")
    val intGain: Double? = null,
    @kotlinx.serialization.SerialName("base_str")
    val baseStr: Int? = null,
    @kotlinx.serialization.SerialName("move_speed")
    val moveSpeed: Int? = null,
    @kotlinx.serialization.SerialName("agi_gain")
    val agiGain: Double? = null,
    @kotlinx.serialization.SerialName("name")
    val name: String? = null,
    @kotlinx.serialization.SerialName("base_attack_min")
    val baseAttackMin: Int? = null,
    @kotlinx.serialization.SerialName("projectile_speed")
    val projectileSpeed: Int? = null,
    @kotlinx.serialization.SerialName("base_agi")
    val baseAgi: Int? = null,
    @kotlinx.serialization.SerialName("base_health_regen")
    val baseHealthRegen: Double? = null,
    @kotlinx.serialization.SerialName("base_mr")
    val baseMr: Int? = null
)