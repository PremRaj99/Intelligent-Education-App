package com.cuteboy.intelligenteducation.Pages

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cuteboy.intelligenteducation.Components.AppBar

@Composable
fun StudentDetail() {
    Column (
        modifier = Modifier
            .padding(30.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        var collageName by remember { mutableStateOf("") }
        TextField(
            value = collageName,
            onValueChange = { collageName = it },
            label = { Text("Student's Id") },
            modifier = Modifier
                .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(26.dp)),
        )
        Spacer(modifier = Modifier.padding(20.dp))
        LazyColumn {
            items(4) {
                val checkedState = remember { mutableStateOf(false) }
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 6.dp)
                ){
                    Checkbox(
                        checked = checkedState.value,
                        onCheckedChange = { checkedState.value = it },
                    )
                    Text(text = "Checkbox Example ${it + 1}")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StudentDetailPreview() {
    Column {
        AppBar("Student's Detail", "User")
        StudentDetail()
    }
}