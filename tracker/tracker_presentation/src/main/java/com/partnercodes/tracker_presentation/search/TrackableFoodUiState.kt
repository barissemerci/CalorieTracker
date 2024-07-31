package com.partnercodes.tracker_presentation.search

import com.partnercodes.tracker_domain.model.TrackableFood

data class TrackableFoodUiState (
    val food: TrackableFood,
    val isExpanded: Boolean = false,
    val amount: String = ""

)