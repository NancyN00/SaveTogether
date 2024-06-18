package com.example.savetogether.components.searchcomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.savetogether.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchDoctorCard(
    index: Int
) {
    val searchCard = SearchDoctorItem[index]
    val searchimage = painterResource(id = R.drawable.savetogether)

    Card(
        onClick = {},
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .clickable { }
                .padding(vertical = 5.dp, horizontal = 8.dp),
        ) {

            Row() {
                Image(painter = searchimage, contentDescription = "Search Image")
            }

            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column() {
                    Text(text = searchCard.searchdoctorName)

                    Spacer(modifier = Modifier.height(15.dp))

                    Text(text = searchCard.searchhospitalName)

                    Spacer(modifier = Modifier.height(15.dp))

                    Text(text = searchCard.searchrate)

                }
            }
        }
    }

}