package com.example.designsystem.baseToken.them

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.example.designsystem.baseToken.semanticTokens.ColorScheme
import com.example.designsystem.baseToken.semanticTokens.Corners
import com.example.designsystem.baseToken.semanticTokens.Size
import com.example.designsystem.baseToken.semanticTokens.Space
import com.example.designsystem.baseToken.semanticTokens.Typography
import com.example.designsystem.baseToken.semanticTokens.defaultCorners
import com.example.designsystem.baseToken.semanticTokens.defaultLightColors
import com.example.designsystem.baseToken.semanticTokens.defaultSizing
import com.example.designsystem.baseToken.semanticTokens.defaultSpacing
import com.example.designsystem.baseToken.semanticTokens.defaultTypography

@Composable
fun TCOSThem(
    colorScheme: ColorScheme = defaultLightColors,
    typography: Typography = defaultTypography,
    spacing: Space = defaultSpacing,
    corners: Corners = defaultCorners,
    sizing: Size = defaultSizing,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalColor provides colorScheme,
        LocalTypography provides typography,
        LocaleSpace provides spacing,
        LocaleCorners provides corners,
        LocaleSize provides sizing,
    ) {
        content()
    }
}