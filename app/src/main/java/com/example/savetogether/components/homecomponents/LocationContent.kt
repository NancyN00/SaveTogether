package com.example.savetogether.components.homecomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LocationContent(
    modifier : Modifier,
    text1 : String,
    text2 : String,
){

    Row (

        horizontalArrangement = Arrangement.SpaceBetween


    ){
        Icon (
            Icons.Default.LocationOn, contentDescription = "Location"
        )

        Column(
            modifier = Modifier.weight(200f),
           // verticalArrangement = Arrangement.Center

        ) {

            Text(text = text1)
            Text(text = text2)
        }

        Icon (
            Icons.Default.Notifications, contentDescription = "Notification",

        )

    }


}

@Preview
@Composable
fun LocationContentPreview(){
    LocationContent(modifier = Modifier, text1 = "Location", text2 = "33 Mar Street, Bulgaria ")

}