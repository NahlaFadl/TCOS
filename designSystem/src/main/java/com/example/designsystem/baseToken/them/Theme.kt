package com.example.designsystem.baseToken.them

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.example.designsystem.baseToken.semanticTokens.ColorScheme

object Theme {
    val colors: ColorScheme
        @Composable @ReadOnlyComposable get() = LocalColor.current
}