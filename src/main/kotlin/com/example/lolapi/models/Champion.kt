package com.example.lolapi.models

import com.fasterxml.jackson.databind.annotation.JsonSerialize

@JsonSerialize
data class Champion(val id: String, val name: String, val title: String, val image: Image, val lore: String) {

}