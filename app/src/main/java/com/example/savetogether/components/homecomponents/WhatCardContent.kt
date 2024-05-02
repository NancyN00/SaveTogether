package com.example.savetogether.components.homecomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.savetogether.R

@Composable
fun WhatCardContent(){
    
       Card (){
           Column (
               modifier = Modifier.padding(4.dp),
               horizontalAlignment = Alignment.CenterHorizontally
           ){
               Image(painter = painterResource(id = R.drawable.love), contentDescription = "")
               Text(text = "Doctor",
                     textAlign = TextAlign.Center
                   )
               
           }
       }
}

@Preview
@Composable
fun WhatCardContentPreview(){
    WhatCardContent()
}