package com.example.savetogether.components.homecomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.savetogether.R
import com.example.savetogether.components.sharedcardcomponent.CardItem

@Composable
fun WhatCardContent() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        CardItem(imageRes = R.drawable.doctorcard, text = "Doctor")
        Spacer(modifier = Modifier.width(8.dp))
        CardItem(imageRes = R.drawable.labtest, text = "Lab Test")
        Spacer(modifier = Modifier.width(8.dp))
        CardItem(imageRes = R.drawable.medicine, text = "Medicine")
    }
}

@Preview
@Composable
fun WhatCardContentPreview() {
    WhatCardContent()
}

