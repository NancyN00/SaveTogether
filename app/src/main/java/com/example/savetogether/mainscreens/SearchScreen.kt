package com.example.savetogether.mainscreens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.savetogether.components.searchcomponents.SearchDoctorCard
import com.example.savetogether.components.searchcomponents.SearchDoctorItem
import com.example.savetogether.components.searchcomponents.SearchScreenDetails

@Composable
fun SearchScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    )
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Spacer(modifier = Modifier.height(10.dp))

            SearchScreenDetails()

            Spacer(modifier = Modifier.height(15.dp))

            LazyColumn {
                items(SearchDoctorItem.size) { searchItem ->
                    SearchDoctorCard(index = searchItem)

                }
            }


        }


    }
}

@Preview
@Composable
fun SearchScreenPreview() {
    SearchScreen()

}

