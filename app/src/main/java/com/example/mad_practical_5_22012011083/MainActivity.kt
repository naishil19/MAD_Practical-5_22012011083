package com.example.mad_practical_5_22012011083


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.mad_practical_5_22012011083.ui.theme.AppNavigation
import com.example.mad_practical_5_22012011083.screen.RegisterPage
import com.example.mad_practical_5_22012011083.ui.theme.AppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigation()
        }
    }
}