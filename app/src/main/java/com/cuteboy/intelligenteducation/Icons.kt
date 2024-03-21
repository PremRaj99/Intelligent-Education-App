package com.cuteboy.intelligenteducation

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Chat
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.EditNote
import androidx.compose.material.icons.rounded.Groups
import androidx.compose.material.icons.rounded.LibraryBooks
import androidx.compose.material.icons.rounded.NotificationsActive
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.PlaylistAddCheck
import androidx.compose.material.icons.rounded.School
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun IconsPreview(name: String = "School", isBlack : String = "Color.White") {
    when(name) {
        "School" -> {
            Icon(imageVector = Icons.Rounded.School,
                contentDescription = null,
                modifier = Modifier
                    .size(65.dp)
                    .padding(horizontal = 10.dp),
                tint = Color.White

            )
        }
        "Courses" -> {
            Icon(imageVector = Icons.Rounded.LibraryBooks,
                contentDescription = null,
                modifier = Modifier
                    .size(65.dp)
                    .padding(horizontal = 10.dp),
                tint = Color.White
            )
        }
        "Students" -> {
            Icon(imageVector = Icons.Rounded.Groups,
                contentDescription = null,
                modifier = Modifier
                    .size(65.dp)
                    .padding(horizontal = 10.dp),
                tint = Color.White
            )
        }
        "User" -> {
            Icon(imageVector = Icons.Rounded.Person,
                contentDescription = null,
                modifier = Modifier
                    .size(65.dp)
                    .padding(horizontal = 10.dp),
                tint = Color.White
            )
        }
        "Chat" -> {
            Icon(imageVector = Icons.Rounded.Chat,
                contentDescription = null,
                modifier = Modifier
                    .size(65.dp)
                    .padding(horizontal = 10.dp),
                tint = Color.White
            )
        }
        "Notification" -> {
            Icon(imageVector = Icons.Rounded.NotificationsActive,
                contentDescription = null,
                modifier = Modifier
                    .size(65.dp)
                    .padding(horizontal = 10.dp),
                tint = Color.White
            )
        }
        "Status" -> {
            Icon(imageVector = Icons.Rounded.PlaylistAddCheck,
                contentDescription = null,
                modifier = Modifier
                    .size(65.dp)
                    .padding(horizontal = 10.dp),
                tint = Color.White
            )
        }
        "Edit" -> {
            Icon(imageVector = Icons.Rounded.EditNote,
                contentDescription = null,
                modifier = Modifier
                    .size(65.dp)
                    .padding(horizontal = 10.dp),
                tint = Color.White
            )
        }
        "Delete" -> {
            Icon(imageVector = Icons.Rounded.Delete,
                contentDescription = null,
                modifier = Modifier
                    .size(65.dp)
                    .padding(horizontal = 10.dp),
                tint = Color.White
            )
        }
        else -> {}
    }
}