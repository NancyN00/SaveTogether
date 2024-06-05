package com.example.savetogether.components.dctmedicalinfocomponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DctMedicalInfoComponent() {

    var text by remember { mutableStateOf("") }

    Column {

        Text(
            text = "Doctors' Info",
            modifier = Modifier,
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp

        )
        
        Spacer(modifier = Modifier.height(8.dp))
        
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(40.dp))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .clickable { }

                ) {

                    BasicTextField(value = text,
                        onValueChange = { text = it },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 8.dp, top = 10.dp),
                        textStyle = TextStyle(fontSize = 14.sp, color = Color.Black),
                        decorationBox = { innerTextField ->

                            if (text.isEmpty()) {
                                Text(text = "Tell us about you...",
                                    modifier = Modifier.padding(start = 8.dp, top = 10.dp)
                                    )
                            }
                            innerTextField()
                        }


                    )


                }


            }
        }


    }

@Composable
fun DctMedicalCertComponent(){


}



@Composable
@Preview
fun DctMedicalInfoComponentPreview() {
    DctMedicalInfoComponent()
}