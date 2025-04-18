package com.example.herenciadevoces.data.local.repository

import android.util.Log
import com.example.herenciadevoces.data.local.dao.SemanticFieldDAO
import com.example.herenciadevoces.data.local.model.SemanticFieldEntity
import javax.inject.Inject

class SemanticFieldRepository @Inject constructor(
    private val semanticFieldDAO: SemanticFieldDAO
) {
    fun getAllSemanticFields():List<SemanticFieldEntity>{
        return semanticFieldDAO.getAllSemanticFields()
        /*
        Log.d("semanticFieldDAO", semanticFieldDAO.getAllSemanticFields().toString())
        val result = semanticFieldDAO.getAllSemanticFields()
        Log.d("DB_DEB", "Número de registros obtenidos: ${result.size}")
        result.forEach {
            Log.d("DB_DEBUG", "Registro: $it")
        }
        return result
        */
}
}