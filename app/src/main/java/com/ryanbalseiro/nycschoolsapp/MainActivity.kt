package com.ryanbalseiro.nycschoolsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.ryanbalseiro.nycschoolsapp.ui.theme.NYCSchoolsAppTheme
import com.ryanbalseiro.nycschoolsapp.View.SchoolApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NYCSchoolsAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
//                    Text("Hello World", modifier = Modifier.padding(vertical = 20.dp, horizontal = 10.dp))
                    SchoolApp(navController = navController)
                }
            }
        }
    }
}

