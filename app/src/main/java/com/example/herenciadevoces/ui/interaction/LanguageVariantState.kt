package com.example.herenciadevoces.ui.interaction

import com.example.herenciadevoces.domain.LanguageVariant.model.LanguageVariant

data class LanguageVariantState (
    var languageVariants: List<LanguageVariant> = emptyList()
)