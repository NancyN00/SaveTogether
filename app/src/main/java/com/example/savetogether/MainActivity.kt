package com.example.savetogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.savetogether.auth.LoginScreen
import com.example.savetogether.auth.RegistrationScreen
import com.example.savetogether.navigation.AppBottomNavigation
import com.example.savetogether.ui.theme.SaveTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            SaveTogetherTheme {

                installSplashScreen()

                Surface(modifier = Modifier
                    .fillMaxSize()){

                    val navController = rememberNavController()

                    Navigation(navController = navController)

                }
            }

        }
    }
}

@Composable
fun Navigation(navController : NavHostController){

    NavHost(navController = navController, startDestination = "signin"){
        composable(route = "signin") {
            LoginScreen(
                navigateToHome = {
                    navController.navigate("home") {
                        launchSingleTop = true
                        popUpTo("signin") {
                            inclusive = true
                        }
                    }
                },
                navigateToSignUp = {
                    navController.navigate("signup") {
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
        composable(route = "signup"){
                RegistrationScreen(
                    navController) {
                    navController.navigate("signin") {
                        launchSingleTop = true
                        restoreState = true
                    }
                }
        }

            composable(route = "home"){
                AppBottomNavigation()
            }
        }
    }




