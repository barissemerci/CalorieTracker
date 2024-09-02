package com.partnercodes.tracker_presentation.tracker_overview

import androidx.annotation.DrawableRes
import com.partnercodes.core.util.UiText
import com.partnercodes.tracker_domain.model.MealType
import com.partnercodes.core.R

// only use for showing on UI, it's just for single screen. so it is located in tracker_presentation
data class Meal(
    val name: UiText,
    @DrawableRes val drawableRes: Int,
    val mealType: MealType,
    val carbs: Int = 0,
    val protein: Int = 0,
    val fat: Int = 0,
    val calories: Int = 0,
    val isExpanded: Boolean = false

)

val defaultMeals = listOf(
    Meal(
        name = UiText.StringResource(R.string.breakfast),
        drawableRes = R.drawable.ic_breakfast,
        mealType = MealType.Breakfast,
    ),
    Meal(
        name = UiText.StringResource(R.string.lunch),
        drawableRes = R.drawable.ic_lunch,
        mealType = MealType.Lunch,
    ),
    Meal(
        name = UiText.StringResource(R.string.dinner),
        drawableRes = R.drawable.ic_dinner,
        mealType = MealType.Dinner,
    ),
    Meal(
        name = UiText.StringResource(R.string.snack),
        drawableRes = R.drawable.ic_snack,
        mealType = MealType.Snack,
    )
)