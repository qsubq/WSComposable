package com.example.phone.model

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.phone.common.theme.Blue200
import com.example.phone.common.theme.LightBlue100
import com.example.phone.common.theme.Main1
import com.example.phone.common.theme.Main2

@Composable
fun PinCode(navController: NavController) {
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
            ), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Введите этот пин-код на смартфоне",
            color = Color.White,
            fontSize = 14.sp, textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
        var text by remember { mutableStateOf("") }

        Row(Modifier.fillMaxWidth()) {
            TextField(
                modifier = Modifier.size(20.dp),
                value = text,
                onValueChange = { text = it },
                colors = TextFieldDefaults.outlinedTextFieldColors(backgroundColor = LightBlue100)
            )
            TextField(
                modifier = Modifier.size(20.dp),
                value = text,
                onValueChange = { text = it },
                colors = TextFieldDefaults.outlinedTextFieldColors(backgroundColor = LightBlue100)
            )
            TextField(
                modifier = Modifier.size(20.dp),
                value = text,
                onValueChange = { text = it },
                colors = TextFieldDefaults.outlinedTextFieldColors(backgroundColor = LightBlue100)
            )
            TextField(
                modifier = Modifier.size(20.dp),
                value = text,
                onValueChange = { text = it },
                colors = TextFieldDefaults.outlinedTextFieldColors(backgroundColor = LightBlue100)
            )
        }

        Button(
            onClick = { navController.navigate("verifyCh") },
            modifier = Modifier
                .padding(top = 30.dp)
                .width(147.dp)
            //.clip(shape =),
            , colors = ButtonDefaults.buttonColors(backgroundColor = Blue200)
        ) {
            Text(
                text = "OK",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )

        }
    }
}