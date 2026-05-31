package com.example.designsystem.baseToken.them

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.example.designsystem.baseToken.semanticTokens.ColorScheme
import com.example.designsystem.baseToken.semanticTokens.defaultLightColors

@Composable
fun TCOSThem(
    colorScheme : ColorScheme = defaultLightColors,
    content :@Composable ()-> Unit
){
    CompositionLocalProvider(
        LocalColor provides colorScheme
    ) {
        content()
    }
}