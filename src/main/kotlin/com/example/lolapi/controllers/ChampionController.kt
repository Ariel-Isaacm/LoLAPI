package com.example.lolapi.controllers

import com.example.lolapi.models.Champion
import com.example.lolapi.services.ChampionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/champions")
class ChampionController(@Autowired val championService: ChampionService) {
    @GetMapping("/")
    fun getChampions(): List<Champion> {
        return championService.getAllChampions()
    }

    @GetMapping("/{id}")
    fun getChampion(@PathVariable id: String): Champion {
        return championService.getChampionById(id)
    }
}