package com.example.designsystem.component.text

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorProducer
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import com.example.designsystem.baseToken.them.Theme

@Composable
fun Text(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = Theme.typography.contentPrimary,
    onTextLayout: ((TextLayoutResult) -> Unit)? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    color: Color = Theme.colors.shadeQuaternary
) {
    BasicText(
        text = text,
        modifier = modifier,
        style = style.copy(
            color = color
        ),
        onTextLayout = onTextLayout,
        softWrap = softWrap,
        overflow = overflow,
        maxLines = maxLines,
        minLines = minLines
    )
}

@Composable
fun SectionTitle(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Theme.colors.shadePrimary
) {
    Text(
        text = text,
        modifier = modifier,
        style = Theme.typography.sectionTitle,
        color=color
    )
}

@Composable
fun CardTitleText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Theme.colors.shadePrimary
) {
    Text(
        text = text,
        modifier = modifier,
        style = Theme.typography.cardTitle,
        color = color
    )
}

@Composable
fun SubTitle(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Theme.colors.shadeSecondary
) {
    Text(
        text = text,
        modifier = modifier,
        style = Theme.typography.sectionTitle,
        color = color
    )
}

@Composable
fun TextContentPrimary(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Theme.colors.shadeSecondary
) {
    Text(
        text = text,
        modifier = modifier,
        style = Theme.typography.contentPrimary.copy(
            color = color
        )
    )
}

@Composable
fun TextContentSecondary(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Theme.colors.shadeSecondary
) {
    Text(
        text = text,
        modifier = modifier,
        style = Theme.typography.contentSecondary.copy(
            color = color
        )
    )
}

@Composable
fun TextSupportContent(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Theme.colors.shadeSecondary
) {
    Text(
        text = text,
        modifier = modifier,
        style = Theme.typography.supportingContent.copy(
            color = color
        )
    )
}

@Composable
fun Caption(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Theme.colors.shadePrimary
) {
    Text(
        text = text,
        modifier = modifier,
        style = Theme.typography.capital.copy(
            color = color
        )
    )
}

@Composable
fun Label(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Theme.colors.shadePrimary
) {
    Text(
        text = text,
        modifier = modifier,
        style = Theme.typography.label.copy(
            color = color
        )
    )
}

@Composable
fun Hint(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Theme.colors.shadeTertiary
) {
    Text(
        text = text,
        modifier = modifier,
        style = Theme.typography.hint.copy(
            color = color
        )
    )
}
