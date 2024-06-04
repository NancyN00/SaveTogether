package com.example.savetogether.components.choosedoctorcomponents.choosedoctorcard

import android.annotation.SuppressLint
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.savetogether.R
import com.example.savetogether.navigation.Screens

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChooseDoctorLazyColumnDetails(navController: NavController) {

    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),

        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text(
                        "Choose Doctor",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(Screens.ConcernScreen.name) }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Arrow Back description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.Filled.Notifications,
                            contentDescription = "Notifications description"
                        )
                    }
                },
                scrollBehavior = scrollBehavior,
            )
        },
    ) {


        Spacer(modifier = Modifier.height(50.dp))

        LazyColumn(modifier = Modifier.padding(16.dp)) {

            items(chooseDoctorItem.size) { doctorDetails ->
                ChooseDoctorCardSection(doctorDetails)

            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChooseDoctorCardSection(
    index: Int
) {
    val doctorCard = chooseDoctorItem[index]
    val image = painterResource(id = R.drawable.savetogether)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(40.dp))
                .width(200.dp)
                .height(160.dp)
                .clickable { }
                .padding(vertical = 5.dp, horizontal = 8.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Card(
                onClick = {},
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.errorContainer,
                ),
                modifier = Modifier.fillMaxWidth()

            ) {
                Row() {
                    Image(painter = image, contentDescription = "Doctor Profile Pic")

                }

                Column(modifier = Modifier.fillMaxSize()) {

                    Text(text = doctorCard.doctorName)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = doctorCard.hospitalName)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = doctorCard.rate)

                }

            }

        }
    }


}