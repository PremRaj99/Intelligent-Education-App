package com.cuteboy.intelligenteducation.Pages

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Groups
import androidx.compose.material.icons.rounded.LibraryBooks
import androidx.compose.material.icons.rounded.NotificationsActive
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.PlaylistAddCheck
import androidx.compose.material.icons.rounded.School
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.cuteboy.intelligenteducation.Components.AppBar
import com.cuteboy.intelligenteducation.ui.theme.DarkBlue

@Composable
fun Dashboard(navController: NavHostController) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
    ){
        Row {
            Button(
                onClick = { navController.navigate("AddCollege")  },
                colors = ButtonDefaults
                    .run { buttonColors(DarkBlue) }
            ) {
                Column (
                    modifier = Modifier.width(130.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(imageVector = Icons.Rounded.School,
                        contentDescription = null,
                        modifier = Modifier
                            .size(65.dp)
                            .padding(horizontal = 6.dp),
                        tint = Color.Black
                    )
                    Text(text = "College")
                }
            }

            Spacer(modifier = Modifier.padding(5.dp))
            Button(
                onClick = { navController.navigate("AddCourse") },
                colors = ButtonDefaults
                    .run { buttonColors(DarkBlue) }
            ) {
                Column (
                    modifier = Modifier.width(130.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(imageVector = Icons.Rounded.LibraryBooks,
                        contentDescription = null,
                        modifier = Modifier
                            .size(65.dp)
                            .padding(horizontal = 6.dp),
                        tint = Color.Black
                    )
                    Text(text = "Courses")
                }
            }
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Row {
            Button(
                onClick = { navController.navigate("AddStudent") },
                colors = ButtonDefaults
                    .run { buttonColors(DarkBlue) }
            ) {
                Column (
                    modifier = Modifier.width(130.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(imageVector = Icons.Rounded.Groups,
                        contentDescription = null,
                        modifier = Modifier
                            .size(65.dp)
                            .padding(horizontal = 6.dp),
                        tint = Color.Black
                    )
                    Text(text = "Students")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Button(
                onClick = { navController.navigate("Status") },
                colors = ButtonDefaults
                    .run { buttonColors(DarkBlue) }
            ) {
                Column (
                    modifier = Modifier.width(130.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(imageVector = Icons.Rounded.PlaylistAddCheck,
                        contentDescription = null,
                        modifier = Modifier
                            .size(65.dp)
                            .padding(horizontal = 6.dp),
                        tint = Color.Black
                    )
                    Text(text = "Status")
                }
            }
        }
        Spacer(modifier = Modifier.padding(10.dp))

        Row {
            Button(
                onClick = { navController.navigate("Notification") },
                colors = ButtonDefaults
                    .run { buttonColors(DarkBlue) }
            ) {
                Column (
                    modifier = Modifier.width(130.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(imageVector = Icons.Rounded.NotificationsActive,
                        contentDescription = null,
                        modifier = Modifier
                            .size(65.dp)
                            .padding(horizontal = 6.dp),
                        tint = Color.Black
                    )
                    Text(text = "Notification")
                }
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Button(
                onClick = { navController.navigate("StudentDetail") },
                colors = ButtonDefaults
                    .run { buttonColors(DarkBlue) }
            ) {
                Column (
                    modifier = Modifier.width(130.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Icon(imageVector = Icons.Rounded.Person,
                        contentDescription = null,
                        modifier = Modifier
                            .size(65.dp)
                            .padding(horizontal = 6.dp),
                        tint = Color.Black
                    )
                    Text(text = "Student's Detail")
                }
            }
        }

    }
}

//@Preview(showBackground = true)
@Composable
fun DashboardPreview(navController : NavHostController) {
    Column {
        AppBar("Name", "User")
        Dashboard(navController)
    }
}