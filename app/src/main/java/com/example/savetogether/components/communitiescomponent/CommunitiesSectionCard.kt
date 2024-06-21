package com.example.savetogether.components.communitiescomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@Composable
fun CommunitiesSectionCard(
    sectionImg: Painter,
    sectionTitle: String
) {
  Card(onClick = { },
      backgroundColor = MaterialTheme.colorScheme.onError,
      modifier = Modifier
          .fillMaxWidth()
          .padding(8.dp)

    ) {

//    Card(
//      Modifier.width(300.dp),
//        shape = RoundedCornerShape(10.dp),
//        backgroundColor = MaterialTheme.colorScheme.onPrimaryContainer,
//        elevation = 0.dp
//
//    ) {
        Row (modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .clickable { }
            .padding(vertical = 5.dp, horizontal = 8.dp)){

            Image(
                painter = sectionImg, contentDescription = "",
            modifier = Modifier
                .clip(CircleShape)
                .size(40.dp)
            )

                Text(
                    text = sectionTitle,
                    fontSize = 14.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )

            }
        }
    }

