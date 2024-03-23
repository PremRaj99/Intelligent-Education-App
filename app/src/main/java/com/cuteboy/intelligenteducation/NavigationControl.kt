package com.cuteboy.intelligenteducation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cuteboy.intelligenteducation.Pages.AddCollegePreview
import com.cuteboy.intelligenteducation.Pages.AddCoursePreview
import com.cuteboy.intelligenteducation.Pages.AddStudentPreview
import com.cuteboy.intelligenteducation.Pages.DashboardPreview
import com.cuteboy.intelligenteducation.Pages.Login
import com.cuteboy.intelligenteducation.Pages.NotificationComponentPreview
import com.cuteboy.intelligenteducation.Pages.StatusPreview
import com.cuteboy.intelligenteducation.Pages.StudentDetailPreview

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home") {
        composable("Home") {
            Login(navController)
        }
        composable("Dashboard") {
            DashboardPreview(navController)
        }
        composable("AddCollege") {
            AddCollegePreview()
        }
        composable("AddCourse") {
            AddCoursePreview()
        }
        composable("AddStudent") {
            AddStudentPreview()
        }
        composable("Notification") {
            NotificationComponentPreview()
        }
        composable("Status") {
            StatusPreview()
        }
        composable("StudentDetail") {
            StudentDetailPreview()
        }
    }
}