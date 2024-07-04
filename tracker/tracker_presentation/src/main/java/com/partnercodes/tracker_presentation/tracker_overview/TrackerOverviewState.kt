package com.partnercodes.tracker_presentation.tracker_overview

import com.partnercodes.tracker_domain.model.TrackedFood
import java.time.LocalDate

data class TrackerOverviewState(
    val totalCarbs: Int = 0,
    val totalProtein: Int = 0,
    val totalFat: Int = 0,
    val totalCalories: Int = 0,
    val carbsGoal : Int =0,
    val proteinGoal : Int =0,
    val fatGoal : Int =0,
    val caloriesGoal : Int =0,
    val meals: List<Meal> = defaultMeals,
    val date: LocalDate = LocalDate.now(),
    val trackedFoods: List<TrackedFood> = emptyList(),

)