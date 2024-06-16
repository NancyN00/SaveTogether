package com.example.savetogether.screens

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.savetogether.R
import com.example.savetogether.components.authcomponents.ButtonContent
import com.example.savetogether.components.dctmedicalinfocomponents.DctCertUploadComponents
import com.example.savetogether.components.dctmedicalinfocomponents.DctMedicalInfoComponent
import com.example.savetogether.navigation.Screens

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DctMedicalInfoScreen(navController: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(R.string.doctor_s_info))
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(Screens.RegistrationScreen.name) }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Default.ArrowBack,
                            contentDescription = "Arrow back icon"
                        )
                    }
                }
            )

        }

    ) {

        Column(modifier = Modifier.padding(16.dp)) {

            val context = LocalContext.current

            Spacer(modifier = Modifier.height(50.dp))

            DctMedicalInfoComponent()

            Spacer(modifier = Modifier.height(30.dp))

            DctCertUploadComponents {}

            Spacer(modifier = Modifier.height(50.dp))

            ButtonContent(modifier = Modifier, onClick = {
                Toast.makeText(context, "uploaded", Toast.LENGTH_SHORT).show()


            }, btnText = stringResource(R.string.upload))

            Spacer(modifier = Modifier.height(10.dp))

            ButtonContent(
                modifier = Modifier,
                onClick = { Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show() },
                btnText = stringResource(R.string.home),
            )


        }

    }
}

@Composable
@Preview
fun DctMedicalInfoScreen() {
    val navController = rememberNavController()

    DctMedicalInfoScreen(navController = navController)
}