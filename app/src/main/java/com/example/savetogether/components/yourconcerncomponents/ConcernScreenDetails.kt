package com.example.savetogether.components.yourconcerncomponents

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.savetogether.R
import com.example.savetogether.components.authcomponents.ButtonContent
import com.example.savetogether.navigation.Screens

@Composable
fun ConcernScreenDetails(navController: NavHostController) {

    var search by remember {
        mutableStateOf("")
    }

    SearchContext(
        value = search,
        placeholder = "Search for symptoms eg. Fever",
        onValueChange = { search = it },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search icon"
            )
        }
    )

    Spacer(modifier = Modifier.height(8.dp))


    SymptomsButtons(
        text1 = stringResource(R.string.throat_pain),
        text2 = stringResource(R.string.symptoms2)
    ) {}


    Spacer(modifier = Modifier.height(8.dp))

    Text(text = stringResource(R.string.add_upto_2_symptoms_to_help_us_n_pick_a_best_specialist_for_you))

    Spacer(modifier = Modifier.height(8.dp))

    IssuesButtons(
        modifier = Modifier,
        issueText = "Top Selected Issues",
        text1 = "Cough",
        text2 = "Throat Pain",
        text3 = "Fever",
        text4 = "Headache"
    ) {}

    Spacer(modifier = Modifier.height(8.dp))

    IssuesButtons(
        modifier = Modifier,
        issueText = "Chest Issues",
        text1 = "Cough",
        text2 = "Throat Pain",
        text3 = "Fever",
        text4 = "Headache"
    ) {}

    Spacer(modifier = Modifier.height(8.dp))


    IssuesButtons(
        modifier = Modifier,
        issueText = "Women's Health",
        text1 = "Cough",
        text2 = "Throat Pain",
        text3 = "Fever",
        text4 = "Headache"
    ) {}

    Spacer(modifier = Modifier.height(8.dp))

    ButtonContent(
        modifier = Modifier,
        onClick = { navController.navigate(Screens.ChooseDoctorScreen.name) },
        btnText ="Choose Doctor",
        enabled = false
    )



}

@Preview
@Composable
fun ConcernScreenPreview() {

}

