package com.androdude.covid19_appupdate.db.ModelClass.WordWide

data class CountryInfo(
    val _id: Int,
    val flag: String,
    val iso2: String,
    val iso3: String,
    val lat: Float,
    val long: Float
)