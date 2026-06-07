package com.example.designsystem.component.button

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.unit.dp
import com.example.designsystem.R
import com.example.designsystem.baseToken.them.TCOSThem
import com.example.designsystem.baseToken.them.Theme

@Composable
fun BaseButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    icon: Painter? = null,
    loading: (@Composable () -> Unit)? = null,
    caption: String? = null,
    isLoading: Boolean = false,
    isEnabled: Boolean = true,
    hasBorder: Boolean = false,
    borderColor: Color = Theme.colors.shadeQuaternary,
    containerColor: Color = Theme.colors.primary,
    disableContainerColor: Color = Theme.colors.disable,
    contentColor: Color = Theme.colors.onPrimary,
    disableContentColor: Color = Theme.colors.onDisable
) {
    val backgroundColor = if (isEnabled) containerColor else disableContainerColor
    val textAndIconColor = if (isEnabled) contentColor else disableContentColor
    val hasContentSpacing = icon != null && caption != null
    val outLineColor = if (!hasBorder) Color.Transparent else if (isEnabled) borderColor else Theme.colors.disable
    val hasClick = isEnabled && !isLoading

    Row(
        modifier = modifier
            .height(Theme.size.large)
            .clip(Theme.corners.xLarge)
            .background(backgroundColor)
            .border(width = 1.dp, color = outLineColor, shape = Theme.corners.xLarge)
            .clickable(hasClick){
                onClick()
            }
            .padding(
                vertical = Theme.space.medium,
                horizontal = Theme.space.huge
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        caption?.let {
            BasicText(
                text = it,
                style = Theme.typography.label.copy(
                    color = textAndIconColor,
                )
            )
        }

        if (hasContentSpacing) {
            Spacer(Modifier.width(Theme.space.medium))
        }

        if (isLoading){
            loading?.invoke()
        }else{
            icon?.let {
                Image(
                    painter = it,
                    contentDescription = "button icon",
                    colorFilter = ColorFilter.tint(textAndIconColor)
                )
            }
        }
    }
}

@Preview
@Composable
fun EnablePreview() {
    TCOSThem {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            BaseButton(
                onClick = {},
                caption = "Add"
            )

            BaseButton(
                onClick = {},
                caption = "Add",
                icon = painterResource(R.drawable.ic_cart)
            )

            BaseButton(
                onClick = {},
                icon = painterResource(R.drawable.ic_cart)
            )
        }
    }
}

@Preview
@Composable
fun DisablePreview() {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        BaseButton(
            onClick = {},
            caption = "Add",
            isEnabled = false
        )
        BaseButton(
            onClick = {},
            caption = "Add",
            isEnabled = false,
            icon = painterResource(R.drawable.ic_cart)
        )
        BaseButton(
            onClick = {},
            isEnabled = false,
            icon = painterResource(R.drawable.ic_cart)
        )
    }
}