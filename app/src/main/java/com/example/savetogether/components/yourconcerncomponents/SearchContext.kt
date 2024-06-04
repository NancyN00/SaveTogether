package com.example.savetogether.components.yourconcerncomponents

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchContext(
    modifier: Modifier = Modifier,
    value: String,
    placeholder: String,
    leadingIcon: @Composable (() -> Unit)? = null,
    onValueChange: (String) -> Unit

) {
    OutlinedTextField(value = value, 
        onValueChange = onValueChange, 
        placeholder = {
            Text(text = placeholder)
        },
        leadingIcon = leadingIcon,
        shape = RoundedCornerShape(8.dp),
        modifier = modifier.fillMaxWidth(),
        )

}