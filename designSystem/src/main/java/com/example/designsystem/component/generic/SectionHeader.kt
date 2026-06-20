package com.example.designsystem.component.generic

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designsystem.baseToken.them.TCOSThem
import com.example.designsystem.baseToken.them.Theme
import com.example.designsystem.component.button.TextButton
import com.example.designsystem.component.text.SectionTitle

@Composable
fun SectionHeader(
    sectionTitle: String,
    buttonCaption: String,
    onButtonClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(38.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        SectionTitle(sectionTitle,
            color = Theme.colors.shadePrimary)

        TextButton(
            caption = buttonCaption,
            onClick = onButtonClick
        )
    }
}

@Preview
@Composable
fun SectionHeaderPreview() {
    TCOSThem {
        SectionHeader(
            sectionTitle = "Section title",
            buttonCaption = "Button caption",
            onButtonClick = {},
            modifier = Modifier.background(Theme.colors.background)
        )
    }
}