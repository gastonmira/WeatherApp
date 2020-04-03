package com.example.domain.entities

const val NOT_FOUND = "NOT FOUND"
const val DEFAULT_ID = 0
const val DEFAULT_TEMP = 0.0

class City(
    val id: Int = DEFAULT_ID,
    val main: String = NOT_FOUND,
    val description: String = NOT_FOUND,
    val temp: Double = DEFAULT_TEMP
)