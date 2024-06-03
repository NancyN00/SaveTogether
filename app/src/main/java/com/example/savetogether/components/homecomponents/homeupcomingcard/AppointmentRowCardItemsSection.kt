package com.example.savetogether.components.homecomponents.homeupcomingcard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.savetogether.R

@Composable
fun AppointmentLazyRowSection() {

    Column(modifier = Modifier.fillMaxSize()) {

        Text(text = "Appointments",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold


            )

        LazyRow() {
            items(appointmentcards.size) { cardd ->
                AppointmentCardItemsSection(cardd)
            }

        }
    }
}


@Composable
fun AppointmentCardItemsSection(
    index: Int
) {

    val cardss = appointmentcards[index]

    val image = painterResource(id = R.drawable.love)
    val iconss = painterResource(id = R.drawable.savetogether)

    Box(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()
    ) {
        Card {
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(40.dp))
                    .width(200.dp)
                    .height(160.dp)
                    .clickable { }
                    .padding(vertical = 5.dp, horizontal = 8.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {

                Row() {

                    Image(
                        painter = image, contentDescription = "profpic",
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(50.dp)
                    )

                    Column {


                        Text(text = cardss.name)

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(text = cardss.career)

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(text = cardss.means)

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(text = cardss.time)

                 //       Spacer(modifier = Modifier.height(10.dp))

                    }


                    Row(){
                        Image(painter = iconss, contentDescription = "imgicon")
                    }

                }
            }
        }
    }
}

@Composable
@Preview
fun AppointmentRowCardItemsSectionPreview(){
    AppointmentLazyRowSection()
}
