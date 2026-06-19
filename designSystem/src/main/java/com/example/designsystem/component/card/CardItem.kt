package com.example.designsystem.component.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designsystem.R
import com.example.designsystem.baseToken.ColorsPalette
import com.example.designsystem.baseToken.them.TCOSThem
import com.example.designsystem.baseToken.them.Theme
import com.example.designsystem.component.chips.Chip
import com.example.designsystem.component.text.CardTitleText

@Composable
fun CartItem(
    modifier: Modifier = Modifier,
    title: String? = null,
    image: Painter,
    mainLabel: String? = null,
    tag1Text: String? = null,
    tag2Text: String? = null,
    tag1Icon: Painter? = null,
    tag2Icon: Painter? = null
) {
    Column(
        modifier = modifier
    ) {
        LabeledImg(
            title = title,
            image = image,
            mainLabel = mainLabel
        )

        title?.let {
            CardTitleText(
                text = it,
                modifier = Modifier.padding(Theme.space.tiny)
            )
        }
        TagsRow(
            tag1Text = tag1Text,
            tag2Text = tag2Text,
            tag1Icon = tag1Icon,
            tag2Icon = tag2Icon
        )
    }
}

@Composable
private fun LabeledImg(
    title: String? = null,
    image: Painter,
    mainLabel: String? = null,
){
    Card(
        modifier = Modifier
            .padding(Theme.space.small)
            .fillMaxWidth()
            .height(122.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = image,
                contentDescription = "$title image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            mainLabel?.let {
                Chip(
                    caption = it,
                    containerColor = ColorsPalette.black.copy(alpha = 0.44f),
                    contentColor = Theme.colors.onPrimary,
                    modifier = Modifier.padding(Theme.space.small)
                )
            }
        }
    }
}
@Composable
private fun TagsRow(
    tag1Text: String? = null,
    tag2Text: String? = null,
    tag1Icon: Painter? = null,
    tag2Icon: Painter? = null
){
    Row (horizontalArrangement = Arrangement.spacedBy(Theme.space.tiny)){
        tag1Text?.let {
            Chip(
                caption = it,
                icon = tag1Icon
            )
        }

        tag2Text?.let {
            Chip(
                caption = it,
                icon = tag2Icon
            )
        }
    }
}

@Preview
@Composable
fun CardItemPreview() {
    TCOSThem {
        Column(
            Modifier
                .background(Theme.colors.background)
                .padding(80.dp)
                .width(180.dp)
        ) {
            CartItem(
                image = painterResource(R.drawable.dog),
                title = "Dog",
                mainLabel = "Label",
                tag1Text = "Tag1",
                tag1Icon = painterResource(R.drawable.ic_cart),
                tag2Text = "Tag2",
                tag2Icon = painterResource(R.drawable.ic_delete)
            )
        }
    }
}