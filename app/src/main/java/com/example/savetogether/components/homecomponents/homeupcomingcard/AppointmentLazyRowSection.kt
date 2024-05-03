package com.example.savetogether.components.homecomponents.homeupcomingcard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AppointmentLazyRowSection() {
    
    Column (modifier = Modifier.fillMaxWidth()) {
        
        Text(text = "Appointments")
        
        LazyColumn(){
            items(appointmentcards.size){ cardd ->
                AppointmentCardItemsSection()
            }
        }
        
    }

}

@Preview
@Composable
fun AppintPreview(){
    AppointmentLazyRowSection()
}