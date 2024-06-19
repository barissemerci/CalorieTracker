package com.partnercodes.calorytracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.partnercodes.calorytracker.ui.theme.CaloryTrackerTheme
import com.partnercodes.onboarding_presentation.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaloryTrackerTheme {
                WelcomeScreen()
            }
        }
    }
}