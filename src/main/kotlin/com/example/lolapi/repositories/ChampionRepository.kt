package com.example.lolapi.repositories

import com.example.lolapi.models.Champion
import com.example.lolapi.models.Image
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import org.springframework.stereotype.Repository
import java.io.File

@Repository
class ChampionRepository {
    val championStorage: Map<String, Champion> = populateMap()

    //todo this should be a proper call to the db instead of just a init loader
    private final fun populateMap(): Map<String, Champion> {
        val champions = HashMap<String, Champion>()

        val mapper = jacksonObjectMapper()
        mapper.registerKotlinModule()
        mapper.registerModule(JavaTimeModule())
        val jsonString: String = File("./src/main/resources/11.3.1/champions.json").readText(Charsets.UTF_8)
        mapper.readTree(jsonString).findPath("data").forEach {
            val id = it.findPath("id").asText().toLowerCase()
            val name = it.findPath("name").asText()
            val title = it.findPath("title").asText()
            val lore = it.findPath("blurb").asText()
            val imageNode = it.findPath("image")
            val image = Image(imageNode.findPath("full").asText(), imageNode.findPath("sprite").asText())
            champions[id] = Champion(id, name, title, image, lore)
        }

        return champions
    }
}