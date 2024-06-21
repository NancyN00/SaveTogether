package com.example.savetogether.components.communitiescomponent


import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.savetogether.R

@Composable
fun CommunitiesMainCards() {

    LazyRow(
        modifier = Modifier.fillMaxWidth().padding(16.dp)
    ) {
        item {
            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                item {
                    CommunitiesSectionCard(
                        sectionImg = painterResource(id = R.drawable.nineoneone),
                        sectionTitle = "Who to call"
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }

                item {
                    CommunitiesSectionCard(
                        sectionImg = painterResource(id = R.drawable.write_us),
                        sectionTitle = " Blogs"
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }

                item {
                    CommunitiesSectionCard(
                        sectionImg = painterResource(id = R.drawable.happypatient),
                        sectionTitle = "Testimony"
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }

                item {
                    CommunitiesSectionCard(
                        sectionImg = painterResource(id = R.drawable.yoga),
                        sectionTitle = " Exercice and Mindfulness"
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }

        }

    }
}

@Preview
@Composable
fun CommunitiesMainCardsPreview() {
    CommunitiesMainCards()
}