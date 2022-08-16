package com.example.countries

data class Country(
    val name: String,
    val capital: String,
    val population: Long,
    val area: Long,
    val flag: String,
    val languages: List<Language>
)

data class Language(val name: String)