package com.example.phone.model

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.phone.common.theme.Green100
import com.example.phone.common.theme.Main1
import com.example.phone.common.theme.Main2

@Composable
fun StaticPro() {
    Column(Modifier.fillMaxSize().background(brush = Brush.verticalGradient(
        colors = listOf(
            Main2,
            Main1
        )))) {


        Text(
            text = "Статистика ребенка",
            color = Color.White,
            fontSize = 14.sp, modifier = Modifier
                .align(CenterHorizontally)
                .padding(top = 3.dp),
            fontWeight = FontWeight.Bold

        )
        Text(
            text = "Изучение цифр",
            color = Color.White,
            fontSize = 12.sp, modifier = Modifier
                .padding(top = 3.dp, start = 21.dp)

        )
        Box(
            modifier = Modifier
                .width(148.dp)
                .align(CenterHorizontally)

        ) {
            Row(Modifier.fillMaxWidth()) {
                Box(
                    modifier = Modifier
                        .width(127.dp)
                        .background(Green100)
                )

                Text(text = "80%", fontWeight = FontWeight.Bold, color = Color.White)
            }

        }
        Text(
            text = "Изучение звуков",
            color = Color.White,
            fontSize = 12.sp, modifier = Modifier
                .padding(top = 3.dp, start = 21.dp)

        )
        Text(
            text = "Изучение фигур",
            color = Color.White,
            fontSize = 12.sp, modifier = Modifier
                .padding(top = 3.dp, start = 21.dp)

        )
        Text(
            text = "Соответсвие цветов",
            color = Color.White,
            fontSize = 12.sp, modifier = Modifier
                .padding(top = 3.dp, start = 21.dp)

        )
        Text(
            text = "Счет",
            color = Color.White,
            fontSize = 12.sp, modifier = Modifier
                .padding(top = 3.dp, start = 21.dp)

        )
    }
}