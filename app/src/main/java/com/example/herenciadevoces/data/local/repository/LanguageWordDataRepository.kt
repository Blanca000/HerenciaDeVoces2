package com.example.herenciadevoces.data.local.repository

import com.example.herenciadevoces.data.local.dao.LanguageWordDataDAO
import com.example.herenciadevoces.data.local.model.LanguageWordDataEntity
import javax.inject.Inject

class LanguageWordDataRepository @Inject constructor(
    private val languageWordDataDAO: LanguageWordDataDAO
) {
    fun getLWDByIdSWDandLV(idSpanishWordData: Int, idsLanguagesVariants: List<Int>): List<LanguageWordDataEntity> {
        return languageWordDataDAO.getLWDByIdSWDandLV(idSpanishWordData,idsLanguagesVariants)
    }
}