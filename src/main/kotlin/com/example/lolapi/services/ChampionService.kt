package com.example.lolapi.services

import com.example.lolapi.models.Champion

interface ChampionService {
    fun getAllChampions(): List<Champion>
    fun getChampionById(id: String): Champion
}