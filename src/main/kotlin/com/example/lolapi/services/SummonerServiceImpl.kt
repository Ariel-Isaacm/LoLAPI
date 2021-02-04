package com.example.lolapi.services

import com.example.lolapi.models.HOST
import com.example.lolapi.models.Summoner
import org.springframework.stereotype.Service

@Service
class SummonerServiceImpl : SummonerService {
    override fun getSummoner(summonerName: String, server: HOST): Summoner? {

        return null
    }

}