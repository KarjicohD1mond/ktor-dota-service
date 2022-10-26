package com.mdota.client.route

import com.mdota.data.model.constants.Hero
import com.mdota.data.model.constants.Item

abstract class DotaApiService {
    interface Constants {
        suspend fun getHeroes(): Map<String, Hero>
        suspend fun getItems(): Map<String, Item>
    }
    interface Players {}
    interface Matches {}
}