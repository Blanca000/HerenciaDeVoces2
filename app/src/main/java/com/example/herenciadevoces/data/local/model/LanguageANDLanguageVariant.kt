package com.example.herenciadevoces.data.local.model

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class LanguageANDLanguageVariant(
    val idLanguageVariant: Int,
    val idLanguage: Int,
    val variantName: String,
    val variantRegionName: String,
    val languageName: String,
    val pathImage: String,

)
