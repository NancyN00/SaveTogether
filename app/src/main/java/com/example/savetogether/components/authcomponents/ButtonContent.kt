package com.example.savetogether.components.authcomponents

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonContent(
    modifier: Modifier,
    onClick: () -> Unit,
    btnText: String
){
    
    Button(
        onClick =  onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(40.dp),
        shape = RoundedCornerShape(5.dp),

          //  .background(MaterialTheme.colorScheme.onPrimaryContainer),

    ) {
        Text(text = btnText)
        
    }

}

@Preview
@Composable
fun BtnContentPreview(){
    ButtonContent(modifier = Modifier, onClick = { /*TODO*/ }, btnText = "Save")
}