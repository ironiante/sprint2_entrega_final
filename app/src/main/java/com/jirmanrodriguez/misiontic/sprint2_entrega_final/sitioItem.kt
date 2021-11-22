package com.jirmanrodriguez.misiontic.sprint2_entrega_final


import com.google.gson.annotations.SerializedName

data class sitioItem(
    @SerializedName("Descripción")
    val descripción: String,
    @SerializedName("Nombre del lugar")
    val nombreDelLugar: String,
    @SerializedName("urlpicture")
    val urlpicture: String
)