package com.example.lolapi.controllers

import com.example.lolapi.models.HOST
import com.example.lolapi.services.SummonerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/summoner")
class SummonerController(@Autowired val summonerService: SummonerService) {

    @GetMapping("/{summonerName}/{server}")
    fun getSummoner(@PathVariable server: HOST, @PathVariable summonerName: String) {
        summonerService.getSummoner(summonerName, server)
    }
}