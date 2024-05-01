package com.example.savetogether.components.homecomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.savetogether.R

@Composable
fun ProfileLayout(
    title1: String,
    title2: String
) {
    Row(
        modifier = Modifier.padding(vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        
        Image(
            painter = painterResource(id = R.drawable.love),
            contentDescription = "loveme",
            modifier = Modifier
                .clip(CircleShape)
                .size(40.dp)
        )

        Column(
            modifier = Modifier
                .padding(horizontal = 5.dp)
                .weight(1f)
        ) {
            
            Text(
                text = title1,
                fontWeight = FontWeight.Bold
                )
            
            Text(text = title2)

        }
        
    }
}

@Preview
@Composable
fun ProfileLayoutPreview(){
    ProfileLayout(title1 = "Welcome", title2 = "Dr. Web")
}