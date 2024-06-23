package com.partnercodes.calorytracker.navigation

import androidx.navigation.NavController
import com.partnercodes.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}