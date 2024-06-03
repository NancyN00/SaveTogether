package com.example.savetogether.components.homecomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.savetogether.R

@Composable
fun QuoteContent(
    modifier: Modifier,
    text1: String,
    text2: String
) {

    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(painter = painterResource(id = R.drawable.love),
            contentDescription = "love",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxWidth())

        Column(Modifier.fillMaxWidth()) {
            Text(
                text = text1,
                fontStyle = FontStyle.Normal,
                fontSize = 10.sp
            )

            Text(
                text = text2,
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
fun QuoteContentPreview() {
    QuoteContent(
        modifier = Modifier.fillMaxWidth(),
        text1 = stringResource(R.string.daily_report),
        text2 = "Rise and shine, Ancy! \n How do you feel today?  "
    )
}