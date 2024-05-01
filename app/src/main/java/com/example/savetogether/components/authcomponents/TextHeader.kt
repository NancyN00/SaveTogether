package com.example.savetogether.components.authcomponents

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TextHeader(
    modifier: Modifier = Modifier,
    title : String
){
    
    Text(text = title,
        modifier = modifier,
        fontWeight = FontWeight.Thin,
        fontSize = 25.sp

    )
}