package com.mdota.client.route

import com.mdota.data.model.constants.HeroDto
import com.mdota.data.model.constants.ItemDto
import com.mdota.data.model.constants.MatchItemDto

abstract class DotaApiService {
    interface Constants {
        suspend fun getHeroes(): List<HeroDto>
        suspend fun getItems(): Map<String, ItemDto>
    }

    interface Players {}
    interface Matches {
        suspend fun getProMatches(): List<MatchItemDto>
    }
}