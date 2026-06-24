package com.example.designsystem.component.generic

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.designsystem.R
import com.example.designsystem.baseToken.them.Theme

@Composable
fun ScreenSkeleton(
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    toast: @Composable () -> Unit = {},
    content: @Composable () -> Unit
) {
    Box(
        Modifier
            .fillMaxSize()
            .background(Theme.colors.background)
    ) {
        Column(Modifier.fillMaxSize()) {
            topBar()
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            ) {
                content
            }
            bottomBar()
        }
        Box(
            modifier = Modifier
                .padding(horizontal = Theme.space.huge)
                .padding(top = Theme.space.large)
        ) {
            toast()
        }
    }
}

@Preview
@Composable
fun ScreenSkeletonPreview() {

    val tabs: List<BottomNavigationBarTab> by remember {
        mutableStateOf(
            listOf(
                BottomNavigationBarTab(
                    icon = Icons.Default.Home,
                    selectedIcon = Icons.Default.Home,
                    name = "Home"
                ),
                BottomNavigationBarTab(
                    icon = Icons.Default.Search,
                    selectedIcon = Icons.Default.Search,
                    name = "Search"
                ),
                BottomNavigationBarTab(
                    icon = Icons.Default.Favorite,
                    selectedIcon = Icons.Default.Favorite,
                    name = "Favourite"
                ),

                BottomNavigationBarTab(
                    icon = Icons.Default.AccountCircle,
                    selectedIcon = Icons.Default.AccountCircle,
                    name = "Account"
                )
            )
        )

    }

    ScreenSkeleton(
        topBar = {
            TopBar(
                title = "Home",
                subtitle = "Hi lkfld",
                logo = painterResource(R.drawable.dog),
                trailingButtonIcon = Icons.Default.Notifications,
                onClickTrailingButton = {}
            )
        },
        bottomBar = {
            BottomNavigationBar(
                tabs = tabs,
                onTabChange = {}
            )
        },
        content = {},
        toast = {
            ToastMessage(
                status = ToastStatus.SUCCESS,
                isVisible = false,
                title = "Success",
                description = "This is a success message",
                onClickClose = {}
            )
        }
    )
}