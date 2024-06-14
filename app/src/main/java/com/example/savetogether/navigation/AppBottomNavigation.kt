package com.example.savetogether.navigation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.savetogether.mainscreens.CommunitiesScreen
import com.example.savetogether.mainscreens.HomeScreen
import com.example.savetogether.mainscreens.SearchScreen
import com.example.savetogether.screens.ChooseDoctorScreen
import com.example.savetogether.screens.ConcernScreen
import com.example.savetogether.screens.DctMedicalInfoScreen

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun AppBottomNavigation(){
    val navController : NavHostController = rememberNavController()


    Scaffold (
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination= navBackStackEntry?.destination

                listOfItems.forEach { bottomNavItems ->

                NavigationBarItem(
                    selected = currentDestination?.hierarchy?.any { it.route == bottomNavItems.route } == true ,
                    onClick = {
                              navController.navigate(bottomNavItems.route){
                                popUpTo(navController.graph.findStartDestination().id)
                                  launchSingleTop = true
                              }
                    },
                    icon = {
                        Icon(imageVector = bottomNavItems.icon, contentDescription = null)
                    },

                    label = {
                        Text(text = bottomNavItems.label)
                    }

                    )

                }
            }
        }
    ){ paddingValues ->
        NavHost(

            navController = navController,

            startDestination = Screens.HomeScreen.name){

            composable(route = Screens.HomeScreen.name){
                HomeScreen(navController)
            }

            composable(route = Screens.SearchScreen.name){
               SearchScreen()
            }

            composable(route = Screens.CommunitiesScreen.name){
                CommunitiesScreen()
            }

            composable(route = Screens.ConcernScreen.name){
                ConcernScreen(navController)
            }

            composable(route = Screens.ChooseDoctorScreen.name){
                ChooseDoctorScreen(navController)
            }

            composable(route = Screens.DctMedicalInfoScreen.name){
                DctMedicalInfoScreen(navController)
            }

        }
    }
}
