package com.example.savetogether.components.authcomponents

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun TextContent(
    modifier : Modifier = Modifier,
    text : String
){
    Text(text = text,
        modifier = modifier,
        fontSize = 15.sp
    )
}