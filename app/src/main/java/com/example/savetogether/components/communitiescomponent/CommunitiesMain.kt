package com.example.savetogether.components.communitiescomponent

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.savetogether.R

@Composable
fun CommunitiesMain() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

        val context = LocalContext.current

        CommunityMainFeatureCard(
            imageRes = R.drawable.nineoneone,
            title = "Who to call",

            ) {

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                CommunityMiniFeatureCards(imageRes = R.drawable.depression, text = "Depression", onClick = {
                    Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
                })
                Spacer(modifier = Modifier.width(8.dp))
                CommunityMiniFeatureCards(imageRes = R.drawable.emergency, text = "Suicide", onClick = {})
                Spacer(modifier = Modifier.width(8.dp))
                CommunityMiniFeatureCards(imageRes = R.drawable.fire, text = "Fire", onClick = {})
            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        CommunityMainFeatureCard(
            imageRes = R.drawable.write_us,
            title = "Blogs",

            ) {

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                CommunityMiniFeatureCards(imageRes = R.drawable.write_us, text = "Write for us", onClick = {})
                Spacer(modifier = Modifier.width(8.dp))
                CommunityMiniFeatureCards(imageRes = R.drawable.write, text = "Write with others", onClick = {})
                Spacer(modifier = Modifier.width(8.dp))
                CommunityMiniFeatureCards(imageRes = R.drawable.read, text = "Read", onClick = {})
            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        CommunityMainFeatureCard(
            imageRes = R.drawable.yoga,
            title = "Exercise and practicing mindfulness",

            ) {

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                CommunityMiniFeatureCards(imageRes = R.drawable.jog, text = "Jogging", onClick = {})
                Spacer(modifier = Modifier.width(8.dp))
                CommunityMiniFeatureCards(imageRes = R.drawable.sunset, text = "Watch sunset", onClick = {})
                Spacer(modifier = Modifier.width(8.dp))
                CommunityMiniFeatureCards(imageRes = R.drawable.yoga, text = "Yoga", onClick = {})
            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        CommunityMainFeatureCard(
            imageRes = R.drawable.testimony,
            title = "Testimony",

            ) {

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                CommunityMiniFeatureCards(imageRes = R.drawable.happypatient, text = "Patient", onClick = {})
                Spacer(modifier = Modifier.width(8.dp))
                CommunityMiniFeatureCards(imageRes = R.drawable.happydoctor, text = "Doctor", onClick = {})
                Spacer(modifier = Modifier.width(8.dp))
                CommunityMiniFeatureCards(imageRes = R.drawable.anon, text = "Anonymous", onClick = {})
            }
        }
    }
}



