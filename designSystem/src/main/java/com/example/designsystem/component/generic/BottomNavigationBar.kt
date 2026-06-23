package com.example.designsystem.component.generic

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import com.example.designsystem.baseToken.them.TCOSThem
import com.example.designsystem.baseToken.them.Theme
import com.example.designsystem.component.text.Hint

@Composable
fun BottomNavigationBar(
    tabs: List<BottomNavigationBarTab>,
    modifier: Modifier = Modifier,
    onTabChange: (BottomNavigationBarTab) -> Unit
) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(Theme.size.massive)
            .background(Theme.colors.container)
            .padding(
                vertical = Theme.space.large,
                horizontal = Theme.space.huge
            )
    ) {
        tabs.forEachIndexed { index, tab ->
            TabItem(
                tab = tab,
                onClick = {
                    selectedTabIndex = index
                    onTabChange(tab)
                },
                isSelected = selectedTabIndex == index
            )
        }
    }
}

@Composable
private fun RowScope.TabItem(
    tab: BottomNavigationBarTab,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val contentColor = if (isSelected) Theme.colors.primary else Theme.colors.shadeSecondary
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .weight(1f)
            .clip(Theme.corners.medium)
            .clickable(onClick = onClick),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            imageVector = if (isSelected) tab.selectedIcon else tab.icon,
            contentDescription = "${tab.name} tab icon",
            modifier = Modifier.size(Theme.size.small),
            colorFilter = ColorFilter.tint(contentColor)
        )
        if (isSelected) {
            Hint(
                tab.name,
                color = contentColor
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BottomNavigationBarPreview() {
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

    TCOSThem {
        BottomNavigationBar(
            tabs = tabs,
            onTabChange = {}
        )
    }
}