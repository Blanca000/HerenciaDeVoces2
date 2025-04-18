package com.example.herenciadevoces.data.local.repository

import com.example.herenciadevoces.data.local.dao.LanguageVariantDAO
import com.example.herenciadevoces.data.local.model.LanguageVariantEntity
import javax.inject.Inject

class LanguageVariantRepository @Inject constructor(
    private val languageVariantDAO: LanguageVariantDAO
){
    fun getAllLanguageVariants() : List<LanguageVariantEntity>{
        return languageVariantDAO.getAllLanguageVariants()

    }
}