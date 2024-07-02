package com.partnercodes.calorytracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.partnercodes.calorytracker.navigation.navigate
import com.partnercodes.calorytracker.ui.theme.CaloryTrackerTheme
import com.partnercodes.core.navigation.Route
import com.partnercodes.onboarding_presentation.age.AgeScreen
import com.partnercodes.onboarding_presentation.gender.GenderScreen
import com.partnercodes.onboarding_presentation.height.HeightScreen
import com.partnercodes.onboarding_presentation.weight.WeightScreen
import com.partnercodes.onboarding_presentation.welcome.WelcomeScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaloryTrackerTheme {
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()
                Scaffold(modifier = Modifier.fillMaxSize(),
                    scaffoldState = scaffoldState,
                    content = { padding ->
                        NavHost(
                            navController = navController,
                            startDestination = Route.WELCOME,
                            modifier = Modifier.padding(padding)
                        ) {
                            composable(Route.WELCOME) {
                                WelcomeScreen(onNavigate = navController::navigate)
                            }
                            composable(Route.AGE) {
                                AgeScreen(scaffoldState = scaffoldState,onNavigate = navController::navigate)

                            }
                            composable(Route.GENDER) {
                                GenderScreen(onNavigate = navController::navigate)

                            }
                            composable(Route.HEIGHT) {
                                HeightScreen(scaffoldState = scaffoldState, onNavigate = navController::navigate)

                            }
                            composable(Route.WEIGHT) {
                                WeightScreen(scaffoldState = scaffoldState, onNavigate = navController::navigate)

                            }
                            composable(Route.NUTRIENT_GOAL) {

                            }
                            composable(Route.ACTIVITY) {

                            }
                            composable(Route.GOAL) {

                            }
                            composable(Route.TRACKER_OVERVIEW) {

                            }
                            composable(Route.SEARCH) {

                            }

                        }
                    }
                )

            }
        }
    }
}