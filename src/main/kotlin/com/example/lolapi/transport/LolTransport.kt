package com.example.lolapi.transport

import com.example.lolapi.models.HOST
import com.fasterxml.jackson.databind.JsonNode
import khttp.get

class LolTransport {
    private val apiKey: String = "apikey"
    private val baseUrl: String = ".api.riotgames.com/lol/"

    fun getSendGet(suffix: String, server: HOST): JsonNode? {
        val requestUrl = "$server$baseUrl$suffix?api_key=$apiKey"
        val response = get(requestUrl)
        return null
    }
}