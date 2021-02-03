package com.example.lolapi

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LoLApiApplication

fun main(args: Array<String>) {
	runApplication<LoLApiApplication>(*args){
		setBannerMode(Banner.Mode.OFF)
	}
}
