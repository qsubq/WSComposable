package com.example.phone

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
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
fun Registr(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()
        .background(brush = Brush.verticalGradient(
            colors = listOf(
                Main2,
                Main1
            )))) {

    }
    Column(Modifier.fillMaxSize()) {
        Box(contentAlignment = Alignment.TopStart) {
            Text(
                text = "Логин",
                color = Color.White,
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(top = 3.dp, start = 21.dp)
            )
        }
        var text by remember { mutableStateOf("") }

        OutlinedTextField(
            value = text,
            modifier = Modifier
                .height(28.dp)
                .width(148.dp)
                .align(CenterHorizontally)
                .padding(top = 3.dp),
            onValueChange = { text = it },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                disabledBorderColor = Blue200,
                unfocusedBorderColor = Blue200
            )
        )
        Text(
            text = "Пароль",
            color = Color.White,
            fontSize = 12.sp, modifier = Modifier
                .padding(top = 3.dp, start = 21.dp)

        )


        var text2 by remember { mutableStateOf("") }

        OutlinedTextField(
            value = text2,
            modifier = Modifier
                .height(28.dp)
                .padding(top = 3.dp)
                .align(CenterHorizontally)
                .width(148.dp),
            onValueChange = { text2 = it },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                disabledBorderColor = Blue200,
                unfocusedBorderColor = Blue200
            )
        )

        Button(
            onClick = { navController.navigate("main") },
            modifier = Modifier
                .width(147.dp)
                .align(CenterHorizontally)
                .padding(top = 5.dp)
                .clip(
                    shape = RoundedCornerShape(10.dp)
                ), colors = ButtonDefaults.buttonColors(backgroundColor = Blue200)
        ) {
            Text(
                text = "ВХОД",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )

        }
    }


}
