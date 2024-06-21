package com.example.savetogether.components.communitiescomponent

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CommunitiesMiniFeaturesCard (

    communitiesMiniFeatureCardImg : Painter,
    communitiesMiniFeatureCardTitle: String
) {

    Card(onClick = { /*TODO*/ },
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.error),
            shape =  RoundedCornerShape(10.dp)
        ) {
        Column {
            Image(painter = communitiesMiniFeatureCardImg, contentDescription = null,
                modifier = Modifier.clip(CircleShape)
                    .size(20.dp)

                )

            Spacer(modifier = Modifier.height(5.dp))

            Text(text = communitiesMiniFeatureCardTitle,
                fontWeight = FontWeight.SemiBold

                )

        }

    }
}