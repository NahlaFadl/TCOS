package com.example.designsystem.component.selectable

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.example.designsystem.baseToken.them.Theme

@Immutable
data class CheckBoxColors(
    val borderChecked: Color,
    val borderColorUnchecked: Color,
    val borderDisabled: Color,
    val containerChecked: Color,
    val containerUnchecked: Color,
    val containerDisabled: Color,
    val iconChecked: Color,
    val iconUnchecked: Color,
    val iconDisabled: Color
)

@Composable
internal fun defaultCheckBoxColors() = CheckBoxColors(
    borderChecked = Theme.colors.primary,
    borderColorUnchecked = Theme.colors.shadeTertiary,
    borderDisabled = Theme.colors.disable,
    containerChecked = Theme.colors.primary,
    containerUnchecked = Theme.colors.background,
    containerDisabled = Theme.colors.disable,
    iconChecked = Theme.colors.onPrimary,
    iconUnchecked = Color.Transparent,
    iconDisabled = Theme.colors.onDisable
)