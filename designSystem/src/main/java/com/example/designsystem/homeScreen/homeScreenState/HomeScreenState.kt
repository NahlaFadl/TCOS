package com.example.designsystem.homeScreen.homeScreenState

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.core.R
import com.example.designsystem.component.generic.BottomNavigationBarTab
import com.example.designsystem.vectors.AllPlants
import com.example.designsystem.vectors.Home
import com.example.designsystem.vectors.HomeFilter
import com.example.designsystem.vectors.Plant
import com.example.designsystem.vectors.PlantFilter
import com.example.designsystem.vectors.Search
import com.example.designsystem.vectors.SearchFilter
import com.example.designsystem.vectors.Store
import com.example.designsystem.vectors.StoreFilter

data class HomeScreenState(
    val searchQuery: String = "",
    val filters: List<FilterChipState> = listOf(
        FilterChipState("All", AllPlants,true),
        FilterChipState("Indoor"),
        FilterChipState("Outdoor"),
        FilterChipState("Balcony")
    ),

    val plants: List<Plant> = listOf(
        Plant(name="n1",imageResource= com.example.designsystem.R.drawable.dog, placeType="pt1", requiredTemperature="rt1", requiredWaterAmount="rw1"),
        Plant(name="n2",imageResource= com.example.designsystem.R.drawable.ic_cart, placeType="pt2", requiredTemperature="rt2", requiredWaterAmount="rw2"),
        Plant(name="n3",imageResource= com.example.designsystem.R.drawable.ic_delete, placeType="pt3", requiredTemperature="rt3", requiredWaterAmount="rw3")
    ),

    val tabs: List<BottomNavigationBarTab> = listOf(
        BottomNavigationBarTab(
            name = "Home",
            icon = Home,
            selectedIcon = HomeFilter
        ),
        BottomNavigationBarTab(
            name = "Plants",
            icon = Plant,
            selectedIcon = PlantFilter
        ),
        BottomNavigationBarTab(
            name = "Search",
            icon = Search,
            selectedIcon = SearchFilter
        ),
        BottomNavigationBarTab(
            name = "Store",
            icon = Store,
            selectedIcon = StoreFilter
        )
    )
){
    data class FilterChipState(
        val firstName: String,
        val filterIcon: ImageVector? = null,
        val isSelected: Boolean = false
    )

    data class Plant(
        val name: String,
        @DrawableRes val imageResource: Int,
        val placeType:String,
        val requiredTemperature: String,
        val requiredWaterAmount: String,
    )

}