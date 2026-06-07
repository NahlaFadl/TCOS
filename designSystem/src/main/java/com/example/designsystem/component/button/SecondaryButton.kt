package com.example.designsystem.component.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designsystem.R
import com.example.designsystem.baseToken.them.TCOSThem
import com.example.designsystem.baseToken.them.Theme

@Composable
fun OutlineButton(
    caption: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    icon: Painter? = null,
    isLoading: Boolean = false,
    loading: (@Composable () -> Unit)? = null,
    isEnabled: Boolean = true

) {
    BaseButton(
        caption = caption,
        modifier = modifier,
        onClick = onClick,
        icon = icon,
        isLoading = isLoading,
        loading = loading,
        isEnabled = isEnabled,
        hasBorder = true,
        borderColor = Theme.colors.shadeQuaternary,
        containerColor = Theme.colors.background,
        disableContainerColor = Theme.colors.background,
        contentColor = Theme.colors.shadeSecondary,
        disableContentColor = Theme.colors.disable
    )
}

@Composable
fun OutlineIconButton(
    icon: Painter,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    isLoading: Boolean = false,
    loading: (@Composable () -> Unit)? = null,
    isEnabled: Boolean = true

) {
    BaseButton(
        modifier = modifier,
        onClick = onClick,
        icon = icon,
        isLoading = isLoading,
        loading = loading,
        isEnabled = isEnabled,
        hasBorder = true,
        borderColor = Theme.colors.shadeQuaternary,
        containerColor = Theme.colors.background,
        disableContainerColor = Theme.colors.background,
        contentColor = Theme.colors.shadeSecondary,
        disableContentColor = Theme.colors.disable
    )
}

@Preview
@Composable
fun PreviewOutlineButton() {
    TCOSThem {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlineIconButton(
                icon = painterResource(R.drawable.ic_cart),
                onClick = {}
            )
            OutlineButton(
                caption = "Add",
                onClick = {}
            )
            OutlineButton(
                caption = "Add",
                onClick = {},
                icon = painterResource(R.drawable.ic_cart),
            )
        }
    }
}

@Preview
@Composable
fun PreviewDisableOutlineButton() {
    TCOSThem {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlineIconButton(
                icon = painterResource(R.drawable.ic_cart),
                onClick = {},
                isEnabled = false
            )

            OutlineButton(
                caption = "Add",
                onClick = {},
                isEnabled = false
            )

            OutlineButton(
                caption = "Add",
                onClick = {},
                icon = painterResource(R.drawable.ic_cart),
                isEnabled = false
            )
        }
    }
}