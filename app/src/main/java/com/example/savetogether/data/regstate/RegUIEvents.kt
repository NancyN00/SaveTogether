package com.example.savetogether.data.regstate

sealed class RegUIEvents{
    data class FullNameChanged(val fullName: String) : RegUIEvents()
    data class EmailChanged(val email: String) : RegUIEvents()
    data class UserNameChanged(val username: String) : RegUIEvents()
    data class PasswordChanged(val password: String) : RegUIEvents()

    object RegistrationBtnClicked: RegUIEvents()

}
