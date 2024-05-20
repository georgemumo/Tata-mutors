package com.apk.george.ui.theme.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.ui.graphics.vector.ImageVector
//import com.apk.georgesproject.R

open class NavigationItem(var route:String, var icon: ImageVector, var tittle:String){
    object Home: NavigationItem("home", Icons.Filled.Home,"Home")
    object AddCircle:NavigationItem("AddCircle",Icons.Filled.AddCircle,"Add Testimonial")
    object Info:NavigationItem("Info",Icons.Filled.Info,"About Us")
}