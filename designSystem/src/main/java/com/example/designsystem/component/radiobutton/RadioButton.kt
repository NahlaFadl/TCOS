package com.example.designsystem.component.radiobutton

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.designsystem.baseToken.them.TCOSThem
import com.example.designsystem.baseToken.them.Theme

@Composable
fun RadioButton(
    isChecked: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    checkedColor: Color = Theme.colors.primary,
    notCheckedColor: Color = Theme.colors.shadeQuaternary,
    disabledColor: Color = Theme.colors.disable,
    contentColor: Color = Theme.colors.background
) {
    val borderColor: Color = if (!isEnabled) {
        disabledColor
    } else if (isChecked) {
        checkedColor
    } else {
        notCheckedColor
    }

    val borderSize: Dp = if (isChecked) 6.dp else 1.dp

    Box(
        modifier = modifier
            .size(Theme.size.tiny)
            .clip(Theme.corners.fullRounded)
            .border(
                width = borderSize,
                color = borderColor,
                shape = Theme.corners.fullRounded
            )
            .background(contentColor)
            .clickable(enabled = isEnabled) { onClick() }
    )
}

@Preview
@Composable
fun RadioButtonPreview() {
    TCOSThem {
        var isChecked: Boolean by remember { mutableStateOf(true) }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Theme.colors.background)
                .padding(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                isChecked = isChecked,
                onClick = { isChecked = !isChecked },
                isEnabled = false
            )

            BasicText(
                text = "Enable me"
            )
        }
    }
}