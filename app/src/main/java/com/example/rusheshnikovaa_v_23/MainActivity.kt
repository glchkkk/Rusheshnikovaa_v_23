package com.example.rusheshnikovaa_v_23

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rusheshnikovaa_v_23.ui.theme.Rusheshnikovaa_v_23Theme
import com.example.rusheshnikovaa_v_23.ui.theme.Login
import com.example.rusheshnikovaa_v_23.ui.theme.Search
import com.example.rusheshnikovaa_v_23.ui.theme.PersonalArea


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val navController: NavHostController = rememberNavController()

            NavHost(navController, startDestination = "login") {
                composable("login") {
                    Login(onLoginClick = { navController.navigate("personal_area") })
                }
                composable("personal_area") {
                    PersonalArea(onSearchClick = { navController.navigate("search") })
                }
                composable("search") {
                    Search()
                }
            }
        }
    }
}