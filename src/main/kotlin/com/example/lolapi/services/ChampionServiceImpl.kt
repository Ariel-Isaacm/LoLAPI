package com.example.lolapi.services

import com.example.lolapi.models.Champion
import com.example.lolapi.repositories.ChampionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ChampionServiceImpl(@Autowired val championRepository: ChampionRepository) : ChampionService {

    override fun getAllChampions(): List<Champion> {
        return championRepository.championStorage.map { it.value }
    }

    override fun getChampionById(id: String): Champion {
        return championRepository.championStorage[id] ?: throw Exception()
    }

}