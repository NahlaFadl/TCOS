package com.example.designsystem.baseToken.semanticTokens

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

val defaultCorners = Corners(
    notRounded = RectangleShape,
    xSmall = RoundedCornerShape(2.dp),
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(8.dp),
    large = RoundedCornerShape(12.dp),
    xLarge = RoundedCornerShape(16.dp),
    xxLarge = RoundedCornerShape(24.dp),
    fullRounded = RoundedCornerShape(100)
)