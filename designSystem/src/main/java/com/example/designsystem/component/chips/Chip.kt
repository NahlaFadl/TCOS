package com.example.designsystem.component.chips

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.designsystem.R
import com.example.designsystem.baseToken.them.TCOSThem
import com.example.designsystem.baseToken.them.Theme

@Composable
fun Chip(
    caption: String,
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    onClick: (() -> Unit)? = null,
    icon: Painter? = null,
    containerColor: Color = Theme.colors.container,
    selectedContainerColor: Color = Theme.colors.primary,
    contentColor: Color = Theme.colors.shadeSecondary,
    selectedContentColor: Color = Theme.colors.onPrimary
) {
    val backgroundColor: Color = if (isSelected) selectedContainerColor else containerColor
    val textAndIconColor: Color = if (isSelected) selectedContentColor else contentColor
    val horizontalSpacing: Dp = if (isSelected) Theme.space.medium else Theme.space.medium

    Row(
        modifier = modifier
            .clip(Theme.corners.fullRounded)
            .height(Theme.size.medium)
            .background(backgroundColor)
            .clickable(enabled = onClick != null) { onClick?.invoke() }
            .padding(horizontalSpacing),
        verticalAlignment = Alignment.CenterVertically
    ) {
        BasicText(
            text = caption,
            style = Theme.typography.label.copy(
                color = textAndIconColor
            )
        )

        icon?.let {
            Image(
                painter = icon,
                contentDescription = "button icon",
                colorFilter = ColorFilter.tint(textAndIconColor),
                modifier = Modifier
                    .padding(start = Theme.space.medium)
                    .size(Theme.size.tiny)
            )
        }
    }

}

@Preview
@Composable
fun ChipPreview(){
    TCOSThem {
        Column (verticalArrangement = Arrangement.spacedBy(8.dp)){
            Chip(
                caption = "Chip",
                icon = painterResource(R.drawable.ic_cart)
            )
            Chip(
                caption = "Chip",
                icon = painterResource(R.drawable.ic_cart),
                isSelected = true
            )
            Chip(
                caption = "No icon",
                isSelected = true
            )
        }
    }
}