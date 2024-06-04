package com.example.savetogether.components.yourconcerncomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun SymptomsButtons(
    text1: String,
    text2 : String,
    onClick :() -> Unit
){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Button(onClick = onClick) {
            Text(text = text1)
            Icon(imageVector = Icons.Default.Cancel, contentDescription = "Cancel icon" )
        }
        Button(onClick = onClick) {
            Text(text = text2)
            
        }


    }
}

//@Composable
//fun DottedButton(
//    text : String,
//    onClick: () -> Unit,
//    modifier: Modifier = Modifier,
//    contentPadding : PaddingValues = PaddingValues(8.dp)
//){
//    Button(onClick = onClick,
//        modifier = Modifier
//            .defaultMinSize(minWidth = 100.dp, minHeight = 50.dp)
//            .padding(8.dp)
//
//
//
//        ) {
//        Text(text = text)
//
//    }





//@Composable
//fun DottedOutlineModifier(color: Color = Color.Black, width: Dp = 2.dp) = Modifier.then(
//    Modifier.drawWithContent {
//        val canvas = drawContext.canvas
//        val size = size
//        val path = Path().apply {
//            moveTo(0f, 0f)
//            lineTo(size.width, 0f)
//            lineTo(size.width, size.height)
//            lineTo(0f, size.height)
//            close()
//        }
//        drawPath(
//            path = path,
//            color = color,
//         //   style = Stroke(width = width, cap = StrokeCap.Round, dashPathEffect = PathEffect.dashPathEffect(floatArrayOf(5f, 5f), 0f))
//        )
//    }
//)


