package com.partnercodes.tracker_data.mapper

import com.partnercodes.tracker_data.local.entity.TrackedFoodEntity
import com.partnercodes.tracker_domain.model.MealType
import com.partnercodes.tracker_domain.model.TrackedFood
import java.time.LocalDate

fun TrackedFoodEntity.toTrackedFood(): TrackedFood {
    return TrackedFood(
        name = name,
        carbs = carbs,
        protein = protein,
        fat = fat,
        imageUrl = imageUrl,
        amount = amount,
        mealType = MealType.fromString(type),
        date = LocalDate.of(year, month, dayOfMonth),
        calories = calories,
        id = id
    )
}

fun TrackedFood.toTrackedFoodEntity(): TrackedFoodEntity {
    return TrackedFoodEntity(
        name = name,
        carbs = carbs,
        protein = protein,
        fat = fat,
        imageUrl = imageUrl,
        amount = amount,
        type = mealType.name,
        year = date.year,
        month = date.monthValue,
        dayOfMonth = date.dayOfMonth,
        calories = calories,
        id = id
        )
}