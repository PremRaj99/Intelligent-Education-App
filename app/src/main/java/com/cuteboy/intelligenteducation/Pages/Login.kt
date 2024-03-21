package com.cuteboy.intelligenteducation.Pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.cuteboy.intelligenteducation.R
import com.cuteboy.intelligenteducation.ui.theme.DarkBlue

@Composable
fun Login(navController : NavHostController) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
        
    ){
        Image(
            painter = painterResource(id = R.drawable.intelligent_education_logo),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .padding(horizontal = 10.dp),
        )
        Box(modifier = Modifier
//            .background(Color.Black)
            .clip(CircleShape)
            .border(3.dp, DarkBlue, CircleShape)
        ) {
            Icon(imageVector = Icons.Rounded.Person,
                contentDescription = null,
                modifier = Modifier
                    .size(125.dp)
                    .padding(horizontal = 10.dp),
                tint = DarkBlue
            )
        }
        Spacer(modifier = Modifier.padding(10.dp))
        var collageName by remember { mutableStateOf("") }
        TextField(
            value = collageName,
            onValueChange = { collageName = it },
            label = { Text("Email") }
        )
        Spacer(modifier = Modifier.padding(10.dp))
        TextField(
            value = collageName,
            onValueChange = { collageName = it },
            label = { Text("Password") }
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Button(onClick = { navController.navigate("Dashboard")
        },
            colors = ButtonDefaults
                .run { buttonColors(DarkBlue) }
        ) {
            Text(text = "Login",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                textAlign = TextAlign.Start
            )
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Text(text = "Don't Remember Password? Click")
        Spacer(modifier = Modifier.padding(20.dp))

    }
}

//@Preview(showBackground = true)
//@Composable
//fun LoginPreview() {
//    Login()
//}