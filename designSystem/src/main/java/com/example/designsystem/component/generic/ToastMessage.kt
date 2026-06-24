package com.example.designsystem.component.generic

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designsystem.baseToken.them.TCOSThem
import com.example.designsystem.baseToken.them.Theme
import com.example.designsystem.component.text.SubTitle
import com.example.designsystem.component.text.TextSupportContent

enum class ToastStatus { SUCCESS, ERROR }

@Composable
fun ToastMessage(
    status: ToastStatus,
    isVisible: Boolean,
    title: String,
    description: String,
    onClickClose: () -> Unit,
    modifier: Modifier = Modifier
) {
    if (isVisible) {
        val shadowColor = if (status== ToastStatus.SUCCESS) Theme.colors.success else Theme.colors.error
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(Theme.size.giant)
                .shadow(
                    shape = Theme.corners.xLarge,
                    elevation = Theme.space.medium,
                    spotColor = shadowColor.copy(alpha = 0.50f)
                )
                .clip(Theme.corners.xLarge)
                .background(Theme.colors.container)
        ) {
            Image(
                imageVector = Icons.Default.Close,
                contentDescription = "Close Icon",
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(Theme.space.medium)
                    .size(Theme.size.tiny)
                    .clip(Theme.corners.fullRounded)
                    .clickable(onClick = onClickClose),
                colorFilter = ColorFilter.tint(Theme.colors.shadeSecondary)
            )
            Row(
                modifier = Modifier
                    .padding(
                        horizontal = Theme.space.large,
                        vertical = Theme.space.medium
                    )
                    .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                StatusBadge(status)
                Column {
                    SubTitle(
                        text = title,
                        color = Theme.colors.primary
                    )
                    TextSupportContent(
                        text = description
                    )
                }

            }
        }
    }
}

@Composable
private fun StatusBadge(status: ToastStatus) {
    Image(
        imageVector = if (status == ToastStatus.SUCCESS) {
            Icons.Default.CheckCircle
        } else {
            Icons.Default.Close
        },
        contentDescription = "${status.name} icon",
        modifier = Modifier
            .padding(end = Theme.space.large)
            .size(Theme.size.medium),
        colorFilter = ColorFilter.tint(
            if (status == ToastStatus.SUCCESS) {
                Theme.colors.success
            } else {
                Theme.colors.error
            }
        )
    )
}

@Preview
@Composable
private fun ToastMessagePreview() {
    TCOSThem {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Theme.colors.background)
                .padding(Theme.space.medium),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ToastMessage(
                status = ToastStatus.SUCCESS,
                isVisible = true,
                title = "Success",
                description = "This is a success message",
                onClickClose = {}
            )

            ToastMessage(
                status = ToastStatus.ERROR,
                isVisible = true,
                title = "Error",
                description = "This is an error message",
                onClickClose = {}
            )
        }
    }
}