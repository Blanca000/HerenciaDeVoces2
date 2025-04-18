package com.example.herenciadevoces.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.herenciadevoces.data.local.model.LanguageWordDataEntity

@Dao
interface LanguageWordDataDAO {
    @Query("SELECT * FROM LanguageWordData WHERE idSpanishWordData = :idSpanishWordData AND idLanguageVariant IN (:idsLanguagesVariants)")
    fun getLWDByIdSWDandLV(idSpanishWordData: Int,idsLanguagesVariants: List<Int>): List<LanguageWordDataEntity>

}