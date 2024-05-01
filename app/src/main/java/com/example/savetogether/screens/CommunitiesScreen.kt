package com.example.savetogether.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CommunitiesScreen(){

    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center)
    {
        Text(text = "Testing Communities Screen")
    }
}