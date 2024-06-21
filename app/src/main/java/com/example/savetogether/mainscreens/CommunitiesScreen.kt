package com.example.savetogether.mainscreens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.savetogether.components.communitiescomponent.CommunitiesMainCards

@Composable
fun CommunitiesScreen(){

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp))
    {
        Text(text = "Our Communities",
           fontWeight = FontWeight.Bold

            )

        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "Feel free to interact",
            fontWeight = FontWeight.Thin)

        Spacer(modifier = Modifier.height(6.dp))

        CommunitiesMainCards()
    }
}

@Preview
@Composable
fun CommunitiesScreenPreview(){
    CommunitiesScreen()
}