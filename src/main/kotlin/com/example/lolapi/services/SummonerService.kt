package com.example.lolapi.services

import com.example.lolapi.models.HOST
import com.example.lolapi.models.Summoner

interface SummonerService {
    fun getSummoner(summonerName: String, server: HOST): Summoner?
}