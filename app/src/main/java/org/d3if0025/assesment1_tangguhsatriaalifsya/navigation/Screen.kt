package org.d3if0025.assesment1_tangguhsatriaalifsya.navigation

sealed class Screen (val route: String) {
    data object Home: Screen("mainScreen")
    data object About: Screen("aboutScreen")
}