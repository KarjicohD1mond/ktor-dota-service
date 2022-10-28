package com.mdota.utlis.mapper

import com.mdota.data.model.constants.HeroDto
import com.mdota.data.model.dbmodel.Hero

fun Hero.toDto(): HeroDto {
    return HeroDto(
        id = this.idHero,
        img = this.img,
        localizedName = this.name
    )
}

fun HeroDto.toHero(): Hero {
    return Hero(
        idHero = this.id,
        img = this.img,
        name = this.localizedName,
    )
}