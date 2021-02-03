package com.example.lolapi.models

enum class Roles {
    MAGE, ASSASIN, SUPPORT, TANK, FIGHTER, MARKSMAN;

    fun getName() = this.toString().capitalize()

}
