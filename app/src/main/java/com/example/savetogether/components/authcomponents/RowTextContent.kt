package com.example.savetogether.components.authcomponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RowTextContent(
    modifier: Modifier = Modifier,
    text1 : String,
    text2 : String,
    onClickText2 : () -> Unit

){
    Row (
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(text = text1)
        
        Spacer(modifier = modifier.width(4.dp))

        Text(text = text2,
            modifier = modifier.clickable { onClickText2() },
            color = MaterialTheme.colorScheme.onPrimaryContainer
            )
    }

}