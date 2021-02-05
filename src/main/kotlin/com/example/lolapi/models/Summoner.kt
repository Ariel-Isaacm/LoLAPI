package com.example.lolapi.models

data class Summoner(val id: String, val summonerName: String, val level: Int, val rank: String, val mastery: Map<String, Mastery>,
                    val division: String, val wins: Int, val losses: Int)
