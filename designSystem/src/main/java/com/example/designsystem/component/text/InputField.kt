package com.example.designsystem.component.text

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.designsystem.R
import com.example.designsystem.baseToken.them.TCOSThem
import com.example.designsystem.baseToken.them.Theme

@Composable
fun TextField(
    text: String,
    modifier: Modifier = Modifier,
    onTextChange: (String) -> Unit,
    textStyle: TextStyle = Theme.typography.contentSecondary,
    textColor: Color = Theme.colors.shadePrimary,
    focusBorderColor: Color = Theme.colors.primary,
    title: String? = null,
    titleColor: Color = Theme.colors.shadePrimary,
    titleTextStyle: TextStyle = Theme.typography.subTitle,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    leadingIconColor: Color = Theme.colors.primary,
    trailingIconColor: Color = Theme.colors.shadeSecondary,
    onClickLeadingIcon: (() -> Unit)? = null,
    onClickTrailingIcon: (() -> Unit)? = null,
    hint: String? = null,
    hintColor: Color = Theme.colors.shadeSecondary,
    hintTextStyle: TextStyle = Theme.typography.supportingContent,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    interactionSource: MutableInteractionSource? = null,
) {
    var isFocused: Boolean by remember { mutableStateOf(false) }
    val borderColor = if (isFocused) focusBorderColor else Color.Transparent

    Column(
        modifier = modifier.onFocusChanged {
            isFocused = it.isFocused
        }
    ) {
        title?.let {
            BasicText(
                text = it,
                style = titleTextStyle.copy(
                    color = titleColor
                ),
                modifier = Modifier.padding(bottom = Theme.space.medium)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .height(Theme.size.large)
                .clip(Theme.corners.large)
                .background(Theme.colors.container)
                .border(
                    width = 1.dp,
                    color = borderColor,
                    shape = Theme.corners.large
                )
                .padding(Theme.space.large)
        ) {
            leadingIcon?.let {
                Image(
                    painter = it,
                    contentDescription = "button icon",
                    colorFilter = ColorFilter.tint(leadingIconColor),
                    modifier = Modifier
                        .padding(end = Theme.space.medium)
                        .size(Theme.size.tiny)
                        .clickable(enabled = onClickLeadingIcon != null) {
                            onClickLeadingIcon?.invoke()
                        }
                )
            }

            Box(modifier = Modifier.weight(1f)) {

                if (text.isBlank()) {
                    hint?.let {
                        BasicText(
                            text = it,
                            style = hintTextStyle.copy(
                                color = hintColor
                            )
                        )
                    }
                }

                BasicTextField(
                    value = text,
                    onValueChange = onTextChange,
                    textStyle = textStyle.copy(
                        color = textColor
                    ),
                    cursorBrush = SolidColor(Theme.colors.primary),
                    enabled = enabled,
                    readOnly = readOnly,
                    keyboardOptions = keyboardOptions,
                    keyboardActions = keyboardActions,
                    singleLine = singleLine,
                    maxLines = maxLines,
                    minLines = minLines,
                    visualTransformation = visualTransformation,
                    onTextLayout = onTextLayout,
                    interactionSource = interactionSource
                )
            }

            trailingIcon?.let {
                Image(
                    painter = it,
                    contentDescription = "button icon",
                    colorFilter = ColorFilter.tint(trailingIconColor),
                    modifier = Modifier
                        .padding(start = Theme.space.medium)
                        .size(Theme.size.tiny)
                        .clickable(enabled = onClickTrailingIcon != null) {
                            onClickTrailingIcon?.invoke()
                        }
                )
            }
        }
    }
}

@Preview
@Composable
fun InputFieldPreview() {

    var txt by remember { mutableStateOf("test") }

    TCOSThem {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Theme.colors.background)
                .padding(Theme.space.medium)
        ) {
            TextField(
                text = txt,
                onTextChange = { txt = it },
                hint = "Enter name",
                leadingIcon = painterResource(R.drawable.ic_cart),
                title = "User name"
            )
        }
    }
}