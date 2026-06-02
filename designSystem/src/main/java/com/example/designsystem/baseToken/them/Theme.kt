package com.example.designsystem.baseToken.them

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.example.designsystem.baseToken.semanticTokens.ColorScheme
import com.example.designsystem.baseToken.semanticTokens.Corners
import com.example.designsystem.baseToken.semanticTokens.Size
import com.example.designsystem.baseToken.semanticTokens.Space
import com.example.designsystem.baseToken.semanticTokens.Typography

object Theme {
    val colors: ColorScheme
        @Composable @ReadOnlyComposable get() = LocalColor.current

    val typography: Typography
        @Composable @ReadOnlyComposable get() = LocalTypography.current

    val corners: Corners
        @Composable @ReadOnlyComposable get() = LocaleCorners.current
    val space: Space
        @Composable @ReadOnlyComposable get() = LocaleSpace.current
    val size: Size
        @Composable @ReadOnlyComposable get() = LocaleSize.current
}