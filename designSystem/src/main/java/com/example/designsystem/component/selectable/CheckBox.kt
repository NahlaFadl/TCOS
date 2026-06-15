package com.example.designsystem.component.selectable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.designsystem.baseToken.them.TCOSThem
import com.example.designsystem.baseToken.them.Theme
import com.example.designsystem.vectors.CheckMark
import com.example.designsystem.vectors.Indeterminate

@Composable
fun CheckBox(
    status: CheckBoxState,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    colors: CheckBoxColors=defaultCheckBoxColors()
) {
    val borderColor = if (!isEnabled) {
        colors.borderDisabled
    } else if (status != CheckBoxState.UN_CHECKED) {
        colors.borderChecked
    } else {
        colors.borderColorUnchecked
    }

    val containerColor = if (!isEnabled) {
        colors.containerDisabled
    } else if (status != CheckBoxState.UN_CHECKED) {
        colors.containerChecked
    } else {
        colors.containerUnchecked
    }

    val iconColor = if (!isEnabled) {
        colors.iconDisabled
    } else if (status != CheckBoxState.UN_CHECKED) {
        colors.iconChecked
    } else {
        colors.iconUnchecked
    }

    val icon: ImageVector? = when(status){
        CheckBoxState.CHECKED -> CheckMark
        CheckBoxState.UN_CHECKED -> null
        CheckBoxState.INDETERMINATE -> Indeterminate
    }
    
    Box(
        modifier = modifier
            .size(Theme.size.tiny)
            .clip(Theme.corners.small)
            .background(containerColor)
            .border(
                width = Theme.space.tiny,
                color = borderColor,
                shape = Theme.corners.small
            )
            .clickable(enabled = isEnabled, onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        icon?.let {
            Image(
                imageVector = it,
                contentDescription = "${status.name} icon",
                colorFilter = ColorFilter.tint(iconColor),
                modifier = Modifier.size(Theme.size.mini)
            )
        }
    }
}

@Preview
@Composable
private fun CheckBoxPreview() {
    TCOSThem {
        var checkBoxState: CheckBoxState by remember { mutableStateOf(CheckBoxState.INDETERMINATE) }

        CheckBox(
            status = checkBoxState,
            onClick = {
                checkBoxState = if (checkBoxState == CheckBoxState.CHECKED) {
                    CheckBoxState.UN_CHECKED
                } else {
                    CheckBoxState.CHECKED
                }
            }
        )
    }
}