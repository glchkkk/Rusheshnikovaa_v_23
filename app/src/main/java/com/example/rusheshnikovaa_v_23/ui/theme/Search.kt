package com.example.rusheshnikovaa_v_23.ui.theme

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
fun Search() {
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text("Поиск") },
            navigationIcon = {
                IconButton(onClick = { /* Handle back */ }) {
                    Icon(painterResource(id = R.drawable.back2), contentDescription = null)
                }
            }
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Оформить кредит") },
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            shape = RoundedCornerShape(8.dp)
        )

        // Last Query Section
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Последний запрос", color = Color.Gray)
            Text(text = "Дебетовая карта", color = Color.DarkGray)
        }

        // Notification Settings Section (Example with CheckBoxes)
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Настройки уведомлений")

            // Repeat this for each setting you need.
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = false, onCheckedChange = {})
                Spacer(modifier = Modifier.width(8.dp))
                Text("Показывать прогресс обучения")
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = false, onCheckedChange = {})
                Spacer(modifier = Modifier.width(8.dp))
                Text("Напоминать об обучении")
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = false, onCheckedChange = {})
                Spacer(modifier = Modifier.width(8.dp))
                Text("Уведомлять об акциях и предложениях")
            }
        }
    }
}