package com.example.savetogether.data.regstate

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.firebase.auth.FirebaseAuth

class RegistrationViewModel (navController : NavController): ViewModel() {

    private val TAG = RegistrationViewModel::class.simpleName

    var registrationUIState = mutableStateOf(RegUIState())

    fun onEvent(event : RegUIEvents){
        when(event){
            is RegUIEvents.FullNameChanged -> {

                registrationUIState.value = registrationUIState.value.copy(
                    fullName = event.fullName
                )

            }

            is RegUIEvents.EmailChanged -> {
                registrationUIState.value = registrationUIState.value.copy(
                    email = event.email
                )
            }
            is RegUIEvents.UserNameChanged -> {
                registrationUIState.value = registrationUIState.value.copy(
                    userName = event.username
                )
            }
            is RegUIEvents.PasswordChanged -> {
                registrationUIState.value = registrationUIState.value.copy(
                    password = event.password
                )
            }

            RegUIEvents.RegistrationBtnClicked -> {
                signUp()
            }

        }

    }

    private fun signUp(navController: NavController) {
        Log.d(TAG, "inside_signup")

        createUserInFirebase(
            email = registrationUIState.value.email,
            password = registrationUIState.value.password,
           navController = navController

        )
    }

    private fun createUserInFirebase(email : String, password : String, navController : NavController) {



        FirebaseAuth.getInstance()
            .createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (it.isSuccessful){


                }

            }
    }

}