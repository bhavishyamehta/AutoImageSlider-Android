package com.david.autoimageslider

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(modifier: Modifier) {
    Column(modifier = modifier) {
        AutoImageSlider(imageList)
    }
}

val imageList = listOf(
    BannerDataModels(
        name = "Banner 1",
        image = R.drawable.test_banner1
    ),
    BannerDataModels(
        name = "Banner 1",
        image = R.drawable.test_banner2
    ),
    BannerDataModels(
        name = "Banner 1",
        image = R.drawable.test_banner3
    ),
    BannerDataModels(
        name = "Banner 1",
        image = R.drawable.test_banner4
    ),
    BannerDataModels(
        name = "Banner 1",
        image = R.drawable.test_banner5
    ),
)