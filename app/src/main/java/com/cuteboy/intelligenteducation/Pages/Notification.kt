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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cuteboy.intelligenteducation.Components.AppBar
import com.cuteboy.intelligenteducation.ui.theme.DarkBlue

@Composable
fun NotificationComponent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var collageName by remember { mutableStateOf("") }
        TextField(
            value = collageName,
            onValueChange = { collageName = it },
            label = { Text("Category") }
        )
        Spacer(modifier = Modifier.padding(10.dp))
        TextField(
            value = collageName,
            onValueChange = { collageName = it },
            label = { Text("Date") }
        )
        Spacer(modifier = Modifier.padding(10.dp))
        val text = rememberSaveable { mutableStateOf("") }
        TextField(
            value = text.value,
            onValueChange = { text.value = it },
            modifier = Modifier
//                .fillMaxWidth()
                .height(100.dp)
                .padding(10.dp)
                .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp)),
            label = { Text(text = "Message") }
        )
        Spacer(modifier = Modifier.padding(10.dp))

        Row(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults
                    .run { buttonColors(DarkBlue) }
            ) {
                Text(
                    text = "Send",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Start
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NotificationComponentPreview() {
    Column {
        AppBar("Notification", "Notification")
        NotificationComponent()
    }
}