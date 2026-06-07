package com.example.designsystem.component.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designsystem.R
import com.example.designsystem.baseToken.them.TCOSThem
import com.example.designsystem.baseToken.them.Theme

@Composable
fun TextButton(
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
        containerColor = Color.Transparent,
        disableContainerColor = Color.Transparent,
        contentColor = Theme.colors.primary,
        disableContentColor = Theme.colors.disable
    )
}

@Composable
fun TextIconButton(
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
        containerColor = Color.Transparent,
        disableContainerColor = Color.Transparent,
        contentColor = Theme.colors.primary,
        disableContentColor = Theme.colors.disable
    )
}

@Preview
@Composable
fun PreviewTextButton() {
    TCOSThem {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            TextIconButton(
                icon = painterResource(R.drawable.ic_cart),
                onClick = {}
            )
            TextButton(
                caption = "Add",
                onClick = {}
            )
            TextButton(
                caption = "Add",
                onClick = {},
                icon = painterResource(R.drawable.ic_cart),
            )
        }
    }
}

@Preview
@Composable
fun PreviewDisableTextButton() {
    TCOSThem {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            TextIconButton(
                icon = painterResource(R.drawable.ic_cart),
                onClick = {},
                isEnabled = false
            )

            TextButton(
                caption = "Add",
                onClick = {},
                isEnabled = false
            )

            TextButton(
                caption = "Add",
                onClick = {},
                icon = painterResource(R.drawable.ic_cart),
                isEnabled = false
            )
        }
    }
}
