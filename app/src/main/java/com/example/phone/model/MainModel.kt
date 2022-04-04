package com.example.phone

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.phone.common.theme.Blue200
import com.example.phone.common.theme.Main1
import com.example.phone.common.theme.Main2

@Composable
fun Main(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().background(brush = Brush.verticalGradient(
        colors = listOf(
            Main2,
            Main1
        ))), horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            onClick = { navController.navigate("static") },
            modifier = Modifier
                .padding(top = 30.dp)
                .width(147.dp)
            //.clip(shape =),
            , colors = ButtonDefaults.buttonColors(backgroundColor = Blue200)
        ) {
            Text(
                text = "СТАТИСТИКА",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )

        }
        Button(
            onClick = { navController.navigate("verifyCh") },
            modifier = Modifier
                .width(147.dp)
                .padding(top = 10.dp)
            //.clip(shape =),
            , colors = ButtonDefaults.buttonColors(backgroundColor = Blue200)
        ) {
            Text(
                text = "ГЕНЕРАЦИЯ \n" +
                        "ПИН-КОДА",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )

        }
    }

}