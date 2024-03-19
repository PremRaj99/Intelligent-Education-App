package com.cuteboy.intelligenteducation.Pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cuteboy.intelligenteducation.Components.AppBar
import com.cuteboy.intelligenteducation.IconsPreview
import com.cuteboy.intelligenteducation.ui.theme.DarkBlue

@Composable
fun AddCollage() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .background(Color.LightGray)
            .padding(5.dp),
            Alignment.Center

        )
        {
            Row (
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)

            ){
                Text(text = "Add Collage +",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Start
                )
            }
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(top = 40.dp)
            ){

                var collageName by remember { mutableStateOf("") }
                TextField(
                    value = collageName,
                    onValueChange = { collageName = it },
                    label = { Text("Collage Name") }
                )
                Spacer(modifier = Modifier.padding(10.dp))
                var collageAddress by remember { mutableStateOf("") }
                TextField(
                    value = collageAddress,
                    onValueChange = { collageAddress = it },
                    label = { Text("Address") }
                )
                Spacer(modifier = Modifier.padding(10.dp))
                Row (
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp)
                ){

                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults
                            .run { buttonColors(DarkBlue) }
                    ) {
                        Text(text = "Add",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            textAlign = TextAlign.Start
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(5.dp),
            Alignment.Center

        )
        {
            Row (
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)

            ){
                Text(text = "Edit / Remove",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Start
                )
            }

            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 60.dp)
            ){
                var collageSearch by remember { mutableStateOf("") }
                TextField(
                    value = collageSearch,
                    onValueChange = { collageSearch = it },
                    label = { Text("Search...") }
                )
                Spacer(modifier = Modifier.padding(5.dp))
                LazyColumn {
                    items(5) {
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

                Row (
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp)
                ){

                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults
                            .run { buttonColors(DarkBlue) }
                    ) {
                        IconsPreview("Edit")
                    }
                    Spacer(modifier = Modifier.padding(start = 5.dp))
                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults
                            .run { buttonColors(DarkBlue) }
                    ) {
                        IconsPreview("Delete")
                    }
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddCollagePreview() {
    Column {
        AppBar()
        AddCollage()
    }

}