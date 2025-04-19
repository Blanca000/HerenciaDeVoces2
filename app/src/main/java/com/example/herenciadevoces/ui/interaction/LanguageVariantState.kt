package com.example.herenciadevoces.ui.interaction

import com.example.herenciadevoces.data.local.model.LanguageANDLanguageVariant
import com.example.herenciadevoces.domain.LanguageVariant.model.LanguageVariant

data class LanguageVariantState (
    var languageVariants: List<LanguageANDLanguageVariant> = emptyList()
)