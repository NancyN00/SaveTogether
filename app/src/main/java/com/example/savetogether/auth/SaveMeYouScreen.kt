package com.example.savetogether.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.savetogether.R
import com.example.savetogether.components.authcomponents.ButtonContent
import com.example.savetogether.components.authcomponents.TextContent
import com.example.savetogether.components.authcomponents.TextHeader

@Composable
fun SaveMeYouScreen(
    navigateToReg : () -> Unit
) {

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(28.dp)
        .clip(
            CutCornerShape(topStart = 10.dp, topEnd = 18.dp, bottomStart = 18.dp, bottomEnd = 10.dp )
        )


    ) {

        Column() {

            Spacer(modifier = Modifier.padding(5.dp))

            TextHeader(title = stringResource(R.string.save_together))

            Spacer(modifier = Modifier.height(10.dp))

            TextContent(text = stringResource(R.string.be_happy_lets_find_solace_in_one_another_lets_love_and_be_loved))

            Spacer(modifier = Modifier.height(30.dp))

            Image(
                painter = painterResource(id = R.drawable.love),
                contentDescription = stringResource(R.string.love_hands_together)
            )

            Spacer(modifier = Modifier.height(30.dp))

            ButtonContent(
                modifier =Modifier,
                onClick = navigateToReg,
                btnText = stringResource(R.string.save_me),

            )

            Spacer(modifier = Modifier.padding(5.dp))

            ButtonContent(
                modifier =Modifier,
                onClick = navigateToReg,
                btnText = stringResource(R.string.save_you),

            )

        }
    }

}

//@Preview
//@Composable
//fun SaveMeYouScreenPreview() {
//    SaveMeYouScreen()
//}