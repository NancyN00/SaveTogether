package com.example.savetogether.components.yourconcerncomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun IssuesButtons(
    modifier: Modifier,
    issueText: String,
    text1: String,
    text2: String,
    text3: String,
    text4: String,
    onClick : () -> Unit
){
    Column(modifier = Modifier.fillMaxWidth()) {

        Text(text = issueText,
            modifier = Modifier.fillMaxWidth(),
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp
        )

        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,

            ){
            Button(onClick = onClick) {

                Text(text = text1)
            }

            Button(onClick = onClick) {

                Text(text = text2)
            }

        }

        Spacer(modifier = Modifier.height(3.dp))

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween){

            Button(onClick = onClick) {

                Text(text = text3)
            }

            Button(onClick = onClick) {

                Text(text = text4)
            }
        }

    }
}