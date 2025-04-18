package com.example.herenciadevoces.domain.SpanishWordData.model

import com.example.herenciadevoces.data.local.model.SpanishWordDataEntity
import com.example.herenciadevoces.domain.LanguageWordDate.model.LanguageWordData


data class SpanishWordData(
    val idSpanishWordData: Int,
    val idSemanticField: Int,
    val spanishWord: String,
    val pathAudio: String,
    val pathImage: String,
    val LWD: MutableList<LanguageWordData> = mutableListOf()
)

fun SpanishWordDataEntity.toSpanishWordData(): SpanishWordData {
    return  SpanishWordData(
        idSpanishWordData = idSpanishWordData,
        idSemanticField = idSemanticField,
        spanishWord = spanishWord,
        pathAudio = pathAudio,
        pathImage = pathImage,
    )
}

fun SpanishWordData.toSpanishWordDataEntity(): SpanishWordDataEntity {
    return  SpanishWordDataEntity(
        idSpanishWordData = idSpanishWordData,
        idSemanticField = idSemanticField,
        spanishWord = spanishWord,
        pathAudio = pathAudio,
        pathImage = pathImage
    )
}