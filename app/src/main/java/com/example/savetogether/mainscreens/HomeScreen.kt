package com.example.savetogether.mainscreens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.savetogether.R
import com.example.savetogether.components.homecomponents.LocationContent
import com.example.savetogether.components.homecomponents.ProfileLayout
import com.example.savetogether.components.homecomponents.QuoteContent
import com.example.savetogether.components.homecomponents.RowBtnQuickConsult
import com.example.savetogether.components.homecomponents.WhatCardContent
import com.example.savetogether.components.homecomponents.homeupcomingcard.AppointmentLazyRowSection
import com.example.savetogether.navigation.Screens


@Composable
fun HomeScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),

) {

    Column(
       modifier = modifier
    ) {
            Spacer(modifier = Modifier.height(16.dp))

            LocationContent(
                modifier = Modifier,
                text1 = "Location",
                text2 = "33 Mar Street, Bulgaria"
            )

            Spacer(modifier = Modifier.height(8.dp))

            ProfileLayout(title1 = "Welcome", title2 = "Dr. Web")

            Spacer(modifier = Modifier.height(8.dp))

            QuoteContent(
                modifier = Modifier.fillMaxWidth(),
                text1 = stringResource(R.string.daily_report),
                text2 = "Rise and shine, Ancy! \n How do you feel today?  "
            )

            Spacer(modifier = Modifier.height(8.dp))

            RowBtnQuickConsult(
                text = "We will assign \n" +
                        " you quick doctor.",
                onClick = {navController.navigate(Screens.ConcernScreen.name)}
            )


        Spacer(modifier = Modifier.height(12.dp))

        WhatCardContent()

        Spacer(modifier = Modifier.height(10.dp))
        
       AppointmentLazyRowSection()
        
        
    }
}
//
//@Preview
//@Composable
//fun HomeScreenPreview(){
//    HomeScreen()
//}