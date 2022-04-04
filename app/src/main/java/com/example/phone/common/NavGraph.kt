package com.example.phone

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.phone.model.*


@Composable
fun NavigationWear(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "regist") {
        composable("regist") { Registr(navController) }
        composable("main") { Main(navController) }
        composable("verify") { Verify(navController) }
        composable("static") { Static(navController) }
        composable("staticPro") { StaticPro() }
        composable("verifyCh") { VerChild(navController) }
        composable("pincode") { PinCode(navController) }
    }
}
