package com.example.savetogether.components.communitiescomponent

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.savetogether.R

@Composable
fun CommunitiesMiniRowCards(){

    Column(modifier = Modifier.fillMaxWidth() ) {

        //lazyrow cards who to call
        LazyRow(modifier = Modifier.fillMaxWidth()) {
            item {
                CommunitiesMiniFeaturesCard(
                    communitiesMiniFeatureCardImg = painterResource(id = R.drawable.depression),
                    communitiesMiniFeatureCardTitle = "Depression"
                )

                Spacer(modifier = Modifier.height(5.dp))

                CommunitiesMiniFeaturesCard(
                    communitiesMiniFeatureCardImg = painterResource(id = R.drawable.nineoneone),
                    communitiesMiniFeatureCardTitle = "Suicide"
                )

                Spacer(modifier = Modifier.height(5.dp))

                CommunitiesMiniFeaturesCard(
                    communitiesMiniFeatureCardImg = painterResource(id = R.drawable.fire),
                    communitiesMiniFeatureCardTitle = "Fire"
                )

            }
        }

        Spacer(modifier = Modifier.height(10.dp))


        //lazyrow cards blogs
        LazyRow(modifier = Modifier.fillMaxWidth()) {
            item {
                CommunitiesMiniFeaturesCard(
                    communitiesMiniFeatureCardImg = painterResource(id = R.drawable.write_us),
                    communitiesMiniFeatureCardTitle = "Write for us"
                )

                Spacer(modifier = Modifier.height(5.dp))

                CommunitiesMiniFeaturesCard(
                    communitiesMiniFeatureCardImg = painterResource(id = R.drawable.write),
                    communitiesMiniFeatureCardTitle = "Write with us"
                )

                Spacer(modifier = Modifier.height(5.dp))

                CommunitiesMiniFeaturesCard(
                    communitiesMiniFeatureCardImg = painterResource(id = R.drawable.read),
                    communitiesMiniFeatureCardTitle = "Read"
                )

            }
        }

        Spacer(modifier = Modifier.height(10.dp))


        //lazyrow cards testimony
        LazyRow(modifier = Modifier.fillMaxWidth()) {
            item {
                CommunitiesMiniFeaturesCard(
                    communitiesMiniFeatureCardImg = painterResource(id = R.drawable.happypatient),
                    communitiesMiniFeatureCardTitle = "Patient"
                )

                Spacer(modifier = Modifier.height(5.dp))

                CommunitiesMiniFeaturesCard(
                    communitiesMiniFeatureCardImg = painterResource(id = R.drawable.happydoctor),
                    communitiesMiniFeatureCardTitle = "Doctor"
                )

                Spacer(modifier = Modifier.height(5.dp))

                CommunitiesMiniFeaturesCard(
                    communitiesMiniFeatureCardImg = painterResource(id = R.drawable.anon),
                    communitiesMiniFeatureCardTitle = "Anonymous"
                )

            }
        }

        Spacer(modifier = Modifier.height(10.dp))


        //lazyrow cards exercise and practicing mindfulness
        LazyRow(modifier = Modifier.fillMaxWidth()) {
            item {
                CommunitiesMiniFeaturesCard(
                    communitiesMiniFeatureCardImg = painterResource(id = R.drawable.jog),
                    communitiesMiniFeatureCardTitle = "Jogging"
                )

                Spacer(modifier = Modifier.height(5.dp))

                CommunitiesMiniFeaturesCard(
                    communitiesMiniFeatureCardImg = painterResource(id = R.drawable.sunset),
                    communitiesMiniFeatureCardTitle = "Watch sunset"
                )

                Spacer(modifier = Modifier.height(5.dp))

                CommunitiesMiniFeaturesCard(
                    communitiesMiniFeatureCardImg = painterResource(id = R.drawable.yoga),
                    communitiesMiniFeatureCardTitle = "Practice mindfulness"
                )

            }
        }

        Spacer(modifier = Modifier.height(10.dp))


        //lazyrow cards who to call
        LazyRow(modifier = Modifier.fillMaxWidth()) {
            item {
                CommunitiesMiniFeaturesCard(
                    communitiesMiniFeatureCardImg = painterResource(id = R.drawable.depression),
                    communitiesMiniFeatureCardTitle = "Depression"
                )

                Spacer(modifier = Modifier.height(5.dp))

                CommunitiesMiniFeaturesCard(
                    communitiesMiniFeatureCardImg = painterResource(id = R.drawable.nineoneone),
                    communitiesMiniFeatureCardTitle = "Suicide"
                )

                Spacer(modifier = Modifier.height(5.dp))

                CommunitiesMiniFeaturesCard(
                    communitiesMiniFeatureCardImg = painterResource(id = R.drawable.fire),
                    communitiesMiniFeatureCardTitle = "Fire"
                )

            }
        }

        Spacer(modifier = Modifier.height(10.dp))
    }

}

@Preview
@Composable
fun CommunitiesMiniRowCardsPreview(){
    CommunitiesMainLazyRow()
}