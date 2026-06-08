package com.example.designsystem.component.text

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.designsystem.R
import com.example.designsystem.baseToken.semanticTokens.defaultDarkColors
import com.example.designsystem.baseToken.them.TCOSThem
import com.example.designsystem.baseToken.them.Theme

@Composable
fun InputField(
    text: String,
    modifier: Modifier = Modifier,
    onTextChange: (String) -> Unit,
    textStyle: TextStyle= Theme.typography.contentSecondary,
    textColor: Color = Theme.colors.shadePrimary,
    title: String? = null,
    titleColor: Color = Theme.colors.shadePrimary,
    titleTextStyle: TextStyle = Theme.typography.subTitle,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    leadingIconColor: Color = Theme.colors.primary,
    trailingIconColor: Color = Theme.colors.shadeSecondary,
    hint: String? = null,
    hintColor: Color = Theme.colors.shadeSecondary,
    hintTextStyle: TextStyle = Theme.typography.supportingContent
) {
    Column(
        modifier = modifier
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
                .clip(Theme.corners.large)
                .background(Theme.colors.container)
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
                    )
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
                )
            }
        }
    }
}

@Preview
@Composable
fun InputFieldPreview(){

    var txt by remember { mutableStateOf("") }

    TCOSThem (defaultDarkColors){
        Column(modifier = Modifier.fillMaxSize().background(Theme.colors.background).padding(Theme.space.medium)) {
            InputField(
                text = txt,
                onTextChange = { txt = it },
                hint = "Enter name",
                leadingIcon = painterResource(R.drawable.ic_cart),
                title = "User name"
            )
        }
    }
}