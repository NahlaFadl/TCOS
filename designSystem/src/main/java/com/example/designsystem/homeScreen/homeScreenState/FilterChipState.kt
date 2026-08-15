package com.example.designsystem.homeScreen.homeScreenState

import androidx.compose.ui.graphics.vector.ImageVector

data class FilterChipState(
    val firstName: String,
    val filterIcon: ImageVector? = null,
    val isSelected: Boolean = false
)
