package com.cuteboy.intelligenteducation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cuteboy.intelligenteducation.Components.AppBar
import com.cuteboy.intelligenteducation.Pages.AddCollege
import com.cuteboy.intelligenteducation.ui.theme.IntelligentEducationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntelligentEducationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    Column {
        AppBar()
        AddCollege()
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    IntelligentEducationTheme {
        MyApp()
    }
}