package com.example.rusheshnikovaa_v_23.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.rusheshnikovaa_v_23.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersonalArea(onSearchClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopAppBar(title = { Text("Личный кабинет") },
            navigationIcon = {
                IconButton(onClick = { /* Handle back */ }) {
                    Icon(painterResource(id = R.drawable.back), contentDescription = null)
                }
            },
            actions = {
                IconButton(onClick = onSearchClick) {
                    Icon(painterResource(id = R.drawable.search), contentDescription = null)
                }
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Привет, User!", modifier = Modifier.padding(16.dp))

        Card(
            modifier = Modifier.padding(16.dp),
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(containerColor = Color.LightGray)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Баланс на картах", style = MaterialTheme.typography.bodyLarge)
                Text(text = "193 516,45 руб.", style = MaterialTheme.typography.titleLarge)
                Text(text = "Обновлено 22 декабря, в 11:20", style = MaterialTheme.typography.bodySmall)
            }
        }

        Button(
            onClick = { /* Handle call */ },
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text("Позвонить в отделение банка")
        }

        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Button(onClick = { /* chat */ }) {
                Text("Онлайн чат")
            }

            Button(onClick = { /*  settings */ }) {
                Text("Настройки")
            }
        }
    }
}