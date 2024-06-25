package com.example.savetogether.components.homecomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.savetogether.R

@Composable
fun WhatCardContent() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        CardItem(imageRes = R.drawable.doctorcard, text = "Doctor")
        Spacer(modifier = Modifier.width(8.dp)) // Use fixed width for consistent spacing
        CardItem(imageRes = R.drawable.labtest, text = "Lab Test")
        Spacer(modifier = Modifier.width(8.dp)) // Use fixed width for consistent spacing
        CardItem(imageRes = R.drawable.medicine, text = "Medicine")
    }
}

@Composable
fun CardItem(imageRes: Int, text: String) {
    Card(
        modifier = Modifier
          //  .weight()
            .padding(4.dp)
            .background(color = Color.White),

        shape = RoundedCornerShape(8.dp),
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier.padding(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier.size(64.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = text,
                textAlign = TextAlign.Center
            )
        }
    }
}
@Preview
@Composable
fun WhatCardContentPreview() {
    WhatCardContent()
}

//@Composable
//fun WhatCardContent(){
//
//    Row (){
//        Card (modifier = Modifier.background(color = Color.White)){
//            Column (
//                modifier = Modifier.padding(4.dp),
//                horizontalAlignment = Alignment.CenterHorizontally
//            ){
//                Image(painter = painterResource(id = R.drawable.doctorcard), contentDescription = "")
//                Text(text = "Doctor",
//                    textAlign = TextAlign.Center
//                )
//            }
//        }
