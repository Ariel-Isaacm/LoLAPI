package com.example.lolapi.models

data class Summoner(val id: String, val summonerName: String, val level: Int, val rank: String, val mastery: Map<String, Mastery>,
                    val division: String, val wins: Int, val losses: Int)


//mastery summonername.id
//https://la1.api.riotgames.com/lol/champion-mastery/v4/champion-masteries/by-summoner/uHRs4nZrGPaObr705x3gvRWpMWgvCMBUdEjvHQ0M0q5s?api_key=RGAPI-79a892e5-c274-468e-aa22-74e839cbd6bf

// rank
//https://la1.api.riotgames.com/lol/league/v4/entries/by-summoner/eQ1lVQDFJWKqItlfkOcOURD9fgAkr2UYTY-mpSJxJzUL?api_key=RGAPI-79a892e5-c274-468e-aa22-74e839cbd6bf
