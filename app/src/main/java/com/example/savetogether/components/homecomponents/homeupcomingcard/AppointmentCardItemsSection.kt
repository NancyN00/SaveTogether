package com.example.savetogether.components.homecomponents.homeupcomingcard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.savetogether.R

@Composable
fun AppointmentCardItemsSection() {

    val cards = listOf(appointmentcards)

    val image = painterResource(id = R.drawable.love)
    val iconss = painterResource(id = R.drawable.savetogether)

    Box(modifier = Modifier.padding(8.dp) ) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .width(250.dp)
                .height(160.dp)
                .clickable { }
                .padding(vertical = 10.dp, horizontal = 14.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

             Image(painter = image, contentDescription = "profpic")

            Text(text = cards.name)

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = cards.career)

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = cards.means)

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = cards.time)

            Spacer(modifier = Modifier.height(10.dp))

            Image(painter = iconss, contentDescription = "imgicon")


        }
    }
}