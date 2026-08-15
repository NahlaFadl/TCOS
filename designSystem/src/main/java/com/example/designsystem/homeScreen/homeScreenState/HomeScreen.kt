package com.example.designsystem.homeScreen.homeScreenState

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.designsystem.R
import com.example.designsystem.baseToken.them.TCOSThem
import com.example.designsystem.baseToken.them.Theme
import com.example.designsystem.component.card.CartItem
import com.example.designsystem.component.chips.Chip
import com.example.designsystem.component.generic.BottomNavigationBar
import com.example.designsystem.component.generic.ScreenSkeleton
import com.example.designsystem.component.generic.SectionHeader
import com.example.designsystem.component.generic.TopBar
import com.example.designsystem.component.text.TextField
import com.example.designsystem.vectors.Plant
import com.example.designsystem.vectors.Search
import com.example.designsystem.vectors.Store


//@Composable
//fun HomeScreen(
//    viewModel: HomeViewModel = hiltViewModel()
//){
//    val state: HomeScreenState by viewModel.state
//}

@Composable
private fun HomeContent(
    state: HomeScreenState,
//    listener:HSI
) {
    ScreenSkeleton(
        topBar = {
            TopBar(
                title = "Plantina",
                subtitle = "Life in greener live",
                logo = painterResource(R.drawable.dog),
                trailingButtonIcon = Search,
            )
        },
        bottomBar = {
            BottomNavigationBar(
                tabs = state.tabs,
                onTabChange = {}
            )
        }
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(Theme.space.huge),
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(Theme.space.huge),
            horizontalArrangement = Arrangement.spacedBy(Theme.space.medium)
        ) {
            item(span = { GridItemSpan(maxLineSpan) }) {
                TextField(
                    text = state.searchQuery,
                    onTextChange = {},
                    hint = "search plants...",
                    leadingIcon = rememberVectorPainter(Search)
                )
            }

            item(span = { GridItemSpan(maxLineSpan) }) {
                SectionHeader(
                    sectionTitle = "My plants",
                    buttonCaption = "All",
                    onButtonClick = {}
                )
            }

            item(span = { GridItemSpan(maxLineSpan) }) {
                LazyRow(
                    modifier = Modifier.fillMaxHeight(),
                    horizontalArrangement = Arrangement.spacedBy(Theme.space.medium),
                ) {
                    items(state.filters) { filter ->
                        Chip(
                            caption = filter.firstName,
                            icon = filter.filterIcon?.let { rememberVectorPainter(it) },
                            isSelected = filter.isSelected,
                            onClick = {}
                        )
                    }
                }
            }

            items(state.plants){ plant->
                CartItem(
                    image = painterResource(plant.imageResource),
                    title = plant.name,
                    mainLabel = plant.placeType,
                    tag1Text = plant.requiredTemperature,
                    tag1Icon = rememberVectorPainter(Plant),
                    tag2Text = plant.requiredWaterAmount,
                    tag2Icon = rememberVectorPainter(Store)
                )
            }
        }
    }

}

@Preview
@Composable
private fun HomeScreenPreView() {
    TCOSThem {
        HomeContent(
            state = HomeScreenState()
        )
    }
}