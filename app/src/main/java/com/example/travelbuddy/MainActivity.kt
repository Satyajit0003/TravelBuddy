package com.example.travelbuddy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.travelbuddy.screen.ProfileScreen
import com.example.travelbuddy.ui.theme.TravelBuddyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState = savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TravelBuddyTheme {
                //WelcomeScreen()
                //ProfileSetupScreen()
                //TravelPreferenceScreen()
                //InterestScreen()
                ProfileScreen()
            }
        }
    }
}

