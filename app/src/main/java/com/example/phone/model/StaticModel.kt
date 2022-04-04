package com.example.phone.model

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun Static(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().background(brush = Brush.verticalGradient(
        colors = listOf(
            Main2,
            Main1
        ))), horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            onClick = { navController.navigate("") },
            modifier = Modifier
                .width(147.dp)
                .padding(top = 10.dp)
            //.clip(shape =),
            , colors = ButtonDefaults.buttonColors(backgroundColor = Blue200)
        ) {
            Text(
                text = "Xiaomi 9x",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )

        }
        Text(
            text = "Вика",
            color = Color.White,
            fontSize = 12.sp, modifier = Modifier
                .padding(top = 15.dp)

        )
        Button(
            onClick = { navController.navigate("staticPro") },
            modifier = Modifier
                .width(147.dp)
                .padding(top = 10.dp)
            .clip(shape = AbsoluteRoundedCornerShape(100))
            , colors = ButtonDefaults.buttonColors(backgroundColor = Blue200)
        ) {
            Text(
                text = "ПОСМОТРЕТЬ СТАТИСТИКУ",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )

        }
    }
}