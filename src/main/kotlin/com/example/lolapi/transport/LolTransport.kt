package com.example.lolapi.transport

import com.example.lolapi.models.HOST
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import khttp.get

class LolTransport {
    private val apiKey: String = "apikey"
    private val baseUrl: String = ".api.riotgames.com/lol/"

    fun getSendGet(suffix: String, server: HOST): JsonNode? {
        val requestUrl = "$server$baseUrl$suffix"
        val response = get(requestUrl, params = mapOf("api_key" to apiKey))
        //todo better handling, unparseable, errors etc.
        return ObjectMapper().readTree(response.content)
    }
}