package com.example.herenciadevoces.ui.main

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.herenciadevoces.ui.viewmodels.VariantSelectionViewModel
import com.example.herenciadevoces.ui.views.LanguageSelectionScreen
import com.example.herenciadevoces.ui.views.SemanticFieldSelectionScreen
import com.example.herenciadevoces.ui.views.VariantSelectionScreen
import com.example.herenciadevoces.ui.views.WordSoundsScreen
import kotlinx.serialization.Serializable

@Serializable
object VariantSelection

@Serializable
object SemanticFieldSelection

@Serializable
data class WordSounds(val idsVariants: List<Int>, val idSemanticField: Int)// Mas de un parametro

@Serializable
object LanguageSelection

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val variantSelectionViewModel: VariantSelectionViewModel = hiltViewModel()
    val listIdsLanguageVariants = remember { mutableStateListOf<Int>() }
    NavHost(
        navController = navController,
        //startDestination = VariantSelection
        startDestination = LanguageSelection
        //startDestination = VariantSelection
    ) {

        composable<LanguageSelection> {
            LanguageSelectionScreen() { idsLanguageVariants ->
                navController.navigate(SemanticFieldSelection)
                Log.d("LIST IDS LANGUAGE VARIANTS ", idsLanguageVariants.toList().toString())
            }

        }

        /*
                composable<LanguageSelection> {
            LanguageSelectionScreen(languageSelectionViewModel) { idsLanguages ->
                navController.navigate(SemanticFieldSelection)
                WordSounds(
                    idsLanguages = listIdsVariants.toList()
                )
            }
        }
        composable<VariantSelection> {
            VariantSelectionScreen(variantSelectionViewModel) { idsLanguagesVariants ->
                navController.navigate(SemanticFieldSelection)
                listIdsVariants.clear()
                listIdsVariants.addAll(idsLanguagesVariants)
                Log.d("LIST IDS VARIANTS ", listIdsVariants.toString())
            }
        }
        */



        composable<SemanticFieldSelection> {
            SemanticFieldSelectionScreen { idSemanticField ->
                navController.navigate(
                    WordSounds(
                        idsVariants = listIdsLanguageVariants.toList(),
                        idSemanticField = idSemanticField
                    )
                )
            }
        }

        composable<WordSounds> {
            WordSoundsScreen()
        }
    }

}