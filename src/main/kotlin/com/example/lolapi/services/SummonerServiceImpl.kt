package com.example.lolapi.services

import com.example.lolapi.models.HOST
import com.example.lolapi.models.Summoner
import com.example.lolapi.transport.LolTransport
import org.springframework.stereotype.Service

@Service
class SummonerServiceImpl : SummonerService {
    private val summonerPath: String = "summoner/v4/summoners/by-name/"
    private val transport = LolTransport()
    override fun getSummoner(summonerName: String, server: HOST): Summoner? {

        val summonerNode = transport.getSendGet("$summonerPath$summonerName", server)
        // todo better handling of null/empty values
        val uid = summonerNode?.findPath("puuid")?.asText() ?:""
        val level = summonerNode?.findPath("summonerLevel")?.asInt()?:0



//        Summoner(uid, summonerName, level, )
        return null
    }

//{
//    "id": "eQ1lVQDFJWKqItlfkOcOURD9fgAkr2UYTY-mpSJxJzUL",
//    "accountId": "83Z55_5Mf6oz-Nl2rzecf04NedDaRc1kv8vTjhvNqjb0Rww",
//    "puuid": "BbIuRO8OFPChvOyt6WpwhK8vdQeYURvDXs5v0dulepTh05e-4hrcrzBUctt-JK4FnCMPr9OuOukZcQ",
//    "name": "Yarento",
//    "profileIconId": 548,
//    "revisionDate": 1612424321713,
//    "summonerLevel": 258
//}

    //summoner name
    //https://la1.api.riotgames.com/lol/summoner/v4/summoners/by-name/Yarento?api_key=RGAPI-79a892e5-c274-468e-aa22-74e839cbd6bf

//mastery summonername.id
//https://la1.api.riotgames.com/lol/champion-mastery/v4/champion-masteries/by-summoner/uHRs4nZrGPaObr705x3gvRWpMWgvCMBUdEjvHQ0M0q5s?api_key=RGAPI-79a892e5-c274-468e-aa22-74e839cbd6bf

// rank
//https://la1.api.riotgames.com/lol/league/v4/entries/by-summoner/eQ1lVQDFJWKqItlfkOcOURD9fgAkr2UYTY-mpSJxJzUL?api_key=RGAPI-79a892e5-c274-468e-aa22-74e839cbd6bf

}
