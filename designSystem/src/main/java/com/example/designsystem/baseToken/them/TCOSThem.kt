package com.example.designsystem.baseToken.them

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.example.designsystem.baseToken.semanticTokens.ColorScheme
import com.example.designsystem.baseToken.semanticTokens.Typography
import com.example.designsystem.baseToken.semanticTokens.defaultLightColors
import com.example.designsystem.baseToken.semanticTokens.defaultTypography

@Composable
fun TCOSThem(
    colorScheme : ColorScheme = defaultLightColors,
    typography : Typography = defaultTypography,
    content :@Composable ()-> Unit
){
    CompositionLocalProvider(
        LocalColor provides colorScheme,
        LocalTypography provides typography
    ) {
        content()
    }
}