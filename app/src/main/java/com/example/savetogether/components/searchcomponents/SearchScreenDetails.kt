package com.example.savetogether.components.searchcomponents

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.savetogether.R
import com.example.savetogether.components.authcomponents.InputContent
import kotlinx.coroutines.flow.MutableStateFlow

//the search component in the middle and then input the SearchDoctorLazyColumn in here.
@Composable
fun SearchScreenDetails(){

    var search by remember { mutableStateOf("") }
    val context = LocalContext.current


    Box(modifier = Modifier.fillMaxWidth()){

        InputContent(
            value = search,
            placeholder = "Search...",
            onValueChange = {search = it},
            leadingIcon = {
                IconButton(onClick = { Toast.makeText(context, "Search clicked", Toast.LENGTH_SHORT).show() }) {
                    Icon(Icons.Default.Search, contentDescription = "Search Icon")
                }

            }
        )


    }
}

@Composable
@Preview
fun SearchScreenDetailsPreview(){
    SearchScreenDetails()
}
