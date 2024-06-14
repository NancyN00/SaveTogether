package com.example.savetogether.data.regstate

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.savetogether.navigation.Screens
import com.google.firebase.auth.FirebaseAuth

class RegistrationViewModel(private val navController: NavController) : ViewModel() {


    private val _regSucc = MutableLiveData<Boolean>()
    val registSucc : LiveData<Boolean> get() = _regSucc

    //  private val TAG = RegistrationViewModel::class.simpleName

    var registrationUIState = mutableStateOf(RegUIState())

    fun onEvent(event: RegUIEvents) {
        when (event) {
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

            else -> {}
        }
    }

    private fun signUp() {
        Log.d(TAG, "inside_signup")



        registrationUIState.value.email?.let {
            registrationUIState.value.password?.let { it1 ->
                createUserInFirebase(
                    email = it,
                    password = it1

                )
            }
        }
    }

    private val TAG = "Registration error"
    private fun createUserInFirebase(email: String?, password: String?) {

        if (email.isNullOrBlank() || password.isNullOrBlank()) {
            Log.d(TAG, "password empty or null")
            return
        }


        FirebaseAuth.getInstance()
            .createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (it.isSuccessful) {
                  _regSucc.value = true

                } else {
                    _regSucc.value = false
                    Log.d(TAG, "Registration error")

                }

            }
    }
}

