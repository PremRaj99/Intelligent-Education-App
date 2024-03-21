package com.cuteboy.intelligenteducation.Pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cuteboy.intelligenteducation.Components.AppBar

@Composable
fun Status() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        var collageName by remember { mutableStateOf("") }
        TextField(
            value = collageName,
            onValueChange = { collageName = it },
            label = { Text("College") }
        )
        Spacer(modifier = Modifier.padding(10.dp))
        TextField(
            value = collageName,
            onValueChange = { collageName = it },
            label = { Text("Course") }
        )
        Spacer(modifier = Modifier.padding(10.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun StatusPreview() {
    Column {
        AppBar("Status", "Status")
        Status()
    }
}