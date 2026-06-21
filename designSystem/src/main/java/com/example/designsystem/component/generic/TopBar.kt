package com.example.designsystem.component.generic

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designsystem.R
import com.example.designsystem.baseToken.them.TCOSThem
import com.example.designsystem.baseToken.them.Theme
import com.example.designsystem.component.text.CardTitleText
import com.example.designsystem.component.text.SubTitle

@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    title: String? = null,
    subtitle: String? = null,
    leadingButtonIcon: ImageVector? = null,
    onClickLeadingButton: (() -> Unit)? = null,
    trailingButtonIcon: ImageVector? = null,
    onClickTrailingButton: (() -> Unit)? = null,
    logo: Painter? = null
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(Theme.space.massive)
            .background(Theme.colors.background)
            .padding(
                horizontal = Theme.space.huge,
                vertical = Theme.space.large
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(Theme.space.medium)
    ) {
        leadingButtonIcon?.let {
            ClickableIcon(
                icon = it,
                onClick = { onClickLeadingButton?.invoke() },
                enabled = onClickLeadingButton != null
            )
        } ?: logo?.let {
            Image(
                painter = it,
                contentDescription = "Logo",
                modifier = Modifier.size(Theme.size.large)
            )
        }

        Column(
            modifier = Modifier.weight(1f)
        ) {
            title?.let { CardTitleText(it) }
            subtitle?.let { SubTitle(it) }
        }
        trailingButtonIcon?.let {
            ClickableIcon(
                icon = it,
                onClick = { onClickTrailingButton?.invoke() },
                enabled = onClickTrailingButton != null
            )
        }

    }
}

@Composable
private fun ClickableIcon(
    icon: ImageVector,
    onClick: () -> Unit,
    enabled: Boolean = true
) {
    Box(
        Modifier
            .size(Theme.size.large)
            .clip(Theme.corners.large)
            .background(Theme.colors.background)
            .clickable(enabled = enabled, onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Image(
            imageVector = icon,
            contentDescription = "App bar icon",
            colorFilter = ColorFilter.tint(Theme.colors.shadeSecondary),
            modifier = Modifier.size(Theme.size.tiny)
        )
    }
}

@Preview
@Composable
private fun TapBarPreview() {
    TCOSThem {
        Column(verticalArrangement = Arrangement.spacedBy(24.dp)) {
            TopBar(
                title = "Home",
                subtitle = "Hi Gerges, wassup"
            )

            TopBar(
                title = "Home",
                subtitle = "Hi Gerges, wassup",
                logo = painterResource(R.drawable.dog)
            )
            TopBar(
                title = "Home",
                subtitle = "Hi Gerges, wassup",
                leadingButtonIcon = Icons.AutoMirrored.Filled.ArrowBack,
                onClickLeadingButton = {}
            )
            TopBar(
                title = "Home",
                trailingButtonIcon = Icons.Default.Notifications,
                onClickTrailingButton = {}
            )
            TopBar(
                title = "Home",
                subtitle = "Hi Gerges, wassup",
                logo = painterResource(R.drawable.dog),
                trailingButtonIcon = Icons.Default.Notifications,
                onClickTrailingButton = {}
            )
        }
    }
}