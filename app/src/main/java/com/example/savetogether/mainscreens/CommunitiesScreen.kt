package com.example.savetogether.mainscreens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.savetogether.components.communitiescomponent.CommunitiesMain

@Composable
fun CommunitiesScreen() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    )
    {
        Text(
            text = "Our Communities",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            fontSize = 15.sp

        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Feel free to interact",
            fontWeight = FontWeight.Thin,
            textAlign = TextAlign.Center,
        )

        Spacer(modifier = Modifier.height(6.dp))

       CommunitiesMain()
    }
}

@Preview
@Composable
fun CommunitiesScreenPreview() {
    CommunitiesScreen()
}