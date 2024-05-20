package com.apk.george.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.apk.george.models.ViewUploadsScreen
import com.apk.george.ui.theme.screens.aboutUs.AboutUsScreen

import com.apk.george.ui.theme.screens.gallery.GalleryScreen
import com.apk.george.ui.theme.screens.home.HomeScreen
import com.apk.george.ui.theme.screens.login.LoginScreen
import com.apk.george.ui.theme.screens.reasons.ReasonsScreen
import com.apk.george.ui.theme.screens.registration.RegistrationScreen
import com.apk.george.ui.theme.screens.testimonials.TestimonialsScreen
import com.apk.george.ui.theme.screens.testimonials.UpdateTestimonyScreen
import com.apk.george.ui.theme.screens.testimonials.ViewProductsScreen
import com.apk.george.ui.theme.screens.testimonials.ViewProductsScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_REGISTER) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN){ LoginScreen(navController)}
        composable(ROUTE_REGISTER){ RegistrationScreen(navController )}
        composable(ROUTE_HOME){ HomeScreen(navController)}
        composable(ROUTE_GALLERY){ GalleryScreen(navController)}

        composable(ROUTE_ABOUTUS){ AboutUsScreen(navController)}
        composable(ROUTE_TESTIMONIALS){ TestimonialsScreen(navController)}
        composable(ROUTE_VIEW_TESTIMONIALS){ ViewProductsScreen(navController) }
        composable(ROUTE_UPDATE_TESTIMONIALS+"/{id}"){
                passedData-> UpdateTestimonyScreen(
            navController,passedData.arguments?.getString("id")!!
        )}
        composable(ROUTE_VIEW_UPLOAD){ ViewUploadsScreen(navController )}
        composable(ROUTE_REASONS){ ReasonsScreen(navController)}

    }
}