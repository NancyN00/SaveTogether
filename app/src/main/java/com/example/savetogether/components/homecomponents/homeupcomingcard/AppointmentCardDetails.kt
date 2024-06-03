package com.example.savetogether.components.homecomponents.homeupcomingcard

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Videocam
import com.example.savetogether.R

val appointmentcards: List<AppointmentCard> = listOf(

    AppointmentCard(
        pic = R.drawable.love,
        name = "Dr.Ancy",
        career = "Pediatrician",
        means = "Video" ,
        time = "Today, 09:00 am",
        icon = Icons.Default.Videocam
    ),

    AppointmentCard(
        pic = R.drawable.savetogether,
        name = "Dr. Dam",
        career = "Dematologist",
        means = "Hospital",
        time = "Tuesday, 01:00PM",
        icon = Icons.Default.Videocam
    ),

    AppointmentCard(
        pic = R.drawable.love,
        name = "Miss Kunis",
        career = "Psychiatry",
        means = "Video" ,
        time = "16:00 PM",
        icon = Icons.Default.Videocam
    ),
    AppointmentCard(
        pic = R.drawable.savetogether,
        name = "Dr. Perry",
        career = "Oncologist",
        means = "Hospital",
        time = "3rd May, 2022",
        icon = Icons.Default.Videocam
    ),
    AppointmentCard(
        pic = R.drawable.love,
        name = "Dr. Kerry",
        career = "Dentist",
        means = "Video" ,
        time = "Tuesday, 21:00 PM",
        icon = Icons.Default.Videocam
    ),

)

//@Preview
//@Composable
//fun CardPreview(){
//    appointmentcards
//}
