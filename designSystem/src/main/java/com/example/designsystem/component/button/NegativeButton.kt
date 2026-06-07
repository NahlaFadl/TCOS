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
fun NegativeButton(
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
        hasBorder = false,
        containerColor = Theme.colors.errorVariant,
        disableContainerColor = Theme.colors.disable,
        contentColor = Theme.colors.error,
        disableContentColor = Theme.colors.onDisable
    )
}

@Composable
fun NegativeIconButton(
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
        hasBorder = false,
        containerColor = Theme.colors.errorVariant,
        disableContainerColor = Theme.colors.disable,
        contentColor = Theme.colors.error,
        disableContentColor = Theme.colors.onDisable
    )
}

@Preview
@Composable
fun PreviewNativeButton() {
    TCOSThem {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            NegativeIconButton(
                icon = painterResource(R.drawable.ic_delete),
                onClick = {}
            )
            NegativeButton(
                caption = "Add",
                onClick = {}
            )
            NegativeButton(
                caption = "Add",
                onClick = {},
                icon = painterResource(R.drawable.ic_delete),
            )
        }
    }
}

@Preview
@Composable
fun PreviewDisableNativeButton() {
    TCOSThem {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            NegativeIconButton(
                icon = painterResource(R.drawable.ic_delete),
                onClick = {},
                isEnabled = false
            )

            NegativeButton(
                caption = "Add",
                onClick = {},
                isEnabled = false
            )

            NegativeButton(
                caption = "Add",
                onClick = {},
                icon = painterResource(R.drawable.ic_delete),
                isEnabled = false
            )
        }
    }
}