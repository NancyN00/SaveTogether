package com.example.savetogether.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.savetogether.R
import com.example.savetogether.components.authcomponents.ButtonContent
import com.example.savetogether.components.authcomponents.InputContent
import com.example.savetogether.components.authcomponents.RowTextContent
import com.example.savetogether.components.authcomponents.TextHeader

@Composable
fun LoginScreen(
    navigateToHome: () -> Unit,
    navigateToSignUp: () -> Unit,
) {

    var emailorusername by remember { mutableStateOf("") }
    var pass by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Spacer(modifier = Modifier.padding(15.dp))

        TextHeader(title = stringResource(R.string.login_to_app))

        RowTextContent(
            text1 = stringResource(R.string.if_you_already_have_an_account), text2 = "Login"){}

        Spacer(modifier = Modifier.padding(18.dp))

        InputContent(
            value = emailorusername,
            placeholder = stringResource(R.string.your_email_or_username),
            onValueChange = { emailorusername = it },
            leadingIcon = {
                Icon (
                    Icons.Default.Person, contentDescription = "Your email or username Icon")
            }
        )

        Spacer(modifier = Modifier.height(10.dp))

        InputContent(value = pass,
            placeholder = "Your Password",
            onValueChange = { pass = it },
            leadingIcon = {
                Icon(
                    Icons.Default.Password, contentDescription = "Password Icon"
                )
            }


            )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Forgot Password?",
            textAlign = TextAlign.End,
            color = Color.Green
        )

        Spacer(modifier = Modifier.height(100.dp))

        ButtonContent(onClick = navigateToHome, btnText = "Login")

        Spacer(modifier = Modifier.height(8.dp))

        RowTextContent(
            text1 = "I don't have an account", text2 = "Register",
            onClickText2 = navigateToSignUp
        )

    }
}



