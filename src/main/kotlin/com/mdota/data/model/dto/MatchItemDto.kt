package com.mdota.data.model.constants

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MatchItemDto(
    @SerialName("match_id")
    val matchId: Long? = null,
    @SerialName("league_name")
    val leagueName: String? = null,
    @SerialName("series_type")
    val seriesType: Int? = null,
    @SerialName("series_id")
    val seriesId: Int? = null,
    @SerialName("duration")
    val duration: Int? = null,
    @SerialName("start_time")
    val startTime: Int? = null,
    @SerialName("radiant_name")
    val radiantName: String? = null,
    @SerialName("radiant_win")
    val radiantWin: Boolean? = null,
    @SerialName("dire_name")
    val direName: String? = null,
    @SerialName("leagueid")
    val leagueid: Int? = null,
    @SerialName("dire_score")
    val direScore: Int? = null,
    @SerialName("radiant_team_id")
    val radiantTeamId: Int? = null,
    @SerialName("radiant_score")
    val radiantScore: Int? = null,
    @SerialName("dire_team_id")
    val direTeamId: Int? = null
)

