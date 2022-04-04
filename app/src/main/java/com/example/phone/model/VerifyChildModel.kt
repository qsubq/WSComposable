package com.example.phone.model

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.phone.common.theme.Blue100
import com.example.phone.common.theme.Blue200
import com.example.phone.common.theme.Main1
import com.example.phone.common.theme.Main2

@Composable
fun VerChild(navController: NavController) {
    Column(
        Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Main2,
                        Main1
                    )
                )
            )
    ) {
        Text(
            text = "Список подключенных устройств",
            color = Color.White,
            fontSize = 14.sp, modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 3.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold

        )
        Button(
            onClick = { navController.navigate("main") },
            modifier = Modifier
                .width(79.dp)
                .align(Alignment.CenterHorizontally)
                .padding(top = 5.dp)
            //.clip(shape =),
            ,
            border = BorderStroke(1.dp, Blue200),
            colors = ButtonDefaults.buttonColors(backgroundColor = Blue100)

        ) {
            Text(
                text = "Samsung34",
                color = Color.White,
                fontSize = 10.sp,
            )

        }

        Button(
            onClick = { navController.navigate("pincode") },
            modifier = Modifier
                .width(148.dp)
                .align(Alignment.CenterHorizontally)
                .padding(top = 5.dp)
            //.clip(shape =),
            , colors = ButtonDefaults.buttonColors(backgroundColor = Blue200)
        ) {
            Text(
                text = "Сгенерировать \n" +
                        "Пин код",
                color = Color.White,
                fontSize = 14.sp,
            )

        }

    }
}