package com.example.savetogether.components.homecomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RowBtnQuickConsult(
  //  modifier: Modifier,
    text : String,
    onClick : () ->  Unit
){
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(5.dp)
       // verticalAlignment = Alignment.CenterVertically
    ){
        Text(text = text)

        Spacer(modifier = Modifier.padding(3.dp))

        Button(onClick = onClick) {
            Text(text = "Quick Consult")
        }

    }
}

@Preview
@Composable
fun RowBtnQuickConsultPreview(){
    RowBtnQuickConsult(text = "We will assign \n" +
            " you quick doctor.") {}

}