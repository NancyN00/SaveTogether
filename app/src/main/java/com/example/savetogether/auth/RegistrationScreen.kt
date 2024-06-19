package com.example.savetogether.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.savetogether.R
import com.example.savetogether.components.authcomponents.ButtonContent
import com.example.savetogether.components.authcomponents.InputContent
import com.example.savetogether.components.authcomponents.RowTextContent
import com.example.savetogether.components.authcomponents.TextHeader
import com.example.savetogether.navigation.Screens

@Composable
fun RegistrationScreen(
    navController : NavHostController,
    navigateToSignIn: () -> Unit
) {

    var fullname by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Spacer(modifier = Modifier.padding(15.dp))

        TextHeader(title = stringResource(R.string.create_an_account))

        Spacer(modifier = Modifier.padding(10.dp))

        RowTextContent(
            text1 = stringResource(R.string.to_get_started),
            text2 = stringResource(R.string.register),
            onClickText2 = navigateToSignIn
        )

        Spacer(modifier = Modifier.padding(18.dp))

        InputContent(
            value = fullname,
            placeholder = stringResource(R.string.your_fullname),
            onValueChange = { fullname = it },
            leadingIcon = {
                Icon(
                    Icons.Default.Person,
                    contentDescription = stringResource(R.string.fullname_icon)
                )
            }
        )

        Spacer(modifier = Modifier.height(10.dp))

        InputContent(
            value = email,
            placeholder = stringResource(R.string.your_email),
            onValueChange = { email = it },
            leadingIcon = {
                Icon(
                    Icons.Default.Email, contentDescription = stringResource(R.string.email_icon)
                )
            })

        Spacer(modifier = Modifier.height(10.dp))

        InputContent(
            value = username,
            placeholder = stringResource(R.string.your_username),
            onValueChange = { username = it },
           leadingIcon = {
                Icon(
                    Icons.Default.Person,
                    contentDescription = stringResource(R.string.username_icon)
                )
            })

        Spacer(modifier = Modifier.height(10.dp))

        InputContent(
            value = password,
            placeholder = stringResource(R.string.your_password),
            onValueChange = { password = it },
           leadingIcon = {
                Icon(
                    Icons.Default.Password, contentDescription = stringResource(R.string.password_icon)
                )
            })

        Spacer(modifier = Modifier.height(100.dp))

        ButtonContent(modifier =Modifier, onClick = { navController.navigate(Screens.DctMedicalInfoScreen.name) }, btnText = "Register")

        Spacer(modifier = Modifier.height(8.dp))

        RowTextContent(
            text1 = "I already have an account",
            text2 = stringResource(R.string.login),
            onClickText2 = navigateToSignIn,
            modifier = Modifier.align(Alignment.CenterHorizontally))
    }
}

//@Preview
//@Composable
//fun RegistrationScreenPreview(){
//    RegistrationScreen {}
//}