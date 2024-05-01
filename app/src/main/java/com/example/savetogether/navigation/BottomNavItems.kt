package com.example.savetogether.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItems(
    val label : String,
    val icon : ImageVector,
    val route : String,
)

val listOfItems: List<BottomNavItems> = listOf(
    BottomNavItems(
        label = "Home",
        icon = Icons.Default.Home,
        route = Screens.HomeScreen.name
    ),

    BottomNavItems(
        label = "Search",
        icon = Icons.Default.Search,
        route = Screens.SearchScreen.name
    ),

    BottomNavItems(
        label = "Communities",
        icon = Icons.Default.Groups,
        route = Screens.CommunitiesScreen.name
    ),
)