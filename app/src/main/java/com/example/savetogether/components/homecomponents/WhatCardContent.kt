package com.example.savetogether.components.homecomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.savetogether.R

@Composable
fun WhatCardContent(){

    Row (

    ){
        Card (modifier = Modifier.background(color = Color.White)){
            Column (
                modifier = Modifier.padding(4.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Image(painter = painterResource(id = R.drawable.doctorcard), contentDescription = "")
                Text(text = "Doctor",
                    textAlign = TextAlign.Center
                )
            }
        }

        Spacer(modifier = Modifier.padding(3.dp))

        Card (modifier = Modifier.background(color = Color.White)){
            Column (
                modifier = Modifier.padding(4.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Image(painter = painterResource(id = R.drawable.doctorcard), contentDescription = "")
                Text(text = "Lab Test",
                    textAlign = TextAlign.Center
                )
            }
        }

        Spacer(modifier = Modifier.padding(3.dp))


        Card (modifier = Modifier.background(color = Color.White)){
            Column (
                modifier = Modifier.padding(4.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Image(painter = painterResource(id = R.drawable.doctorcard), contentDescription = "")
                Text(text = "Medicine",
                    textAlign = TextAlign.Center
                )
            }
        }

    }
    

}

@Preview
@Composable
fun WhatCardContentPreview(){
    WhatCardContent()
}