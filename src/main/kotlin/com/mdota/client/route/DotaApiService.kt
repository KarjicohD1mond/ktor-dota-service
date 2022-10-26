package com.mdota.client.route

import com.mdota.data.model.constants.Hero

abstract class DotaApiService {
    interface Constants {
        suspend fun getHeroes() : Map<String, Hero>
    }
    interface Players {}
    interface Matches {}
}