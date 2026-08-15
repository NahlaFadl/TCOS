package com.example.designsystem.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StoreFilter: ImageVector
    get() {
        if (_StoreFilter != null) {
            return _StoreFilter!!
        }
        _StoreFilter = ImageVector.Builder(
            name = "StoreFilter",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF1A729E)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 11.621f)
                verticalLineTo(18f)
                curveTo(20f, 19.105f, 19.105f, 20f, 18f, 20f)
                horizontalLineTo(6f)
                curveTo(4.895f, 20f, 4f, 19.105f, 4f, 18f)
                verticalLineTo(11.621f)
                moveTo(7.5f, 9.75f)
                curveTo(7.5f, 10.993f, 6.493f, 12f, 5.25f, 12f)
                curveTo(4.094f, 12f, 3.142f, 11.128f, 3.014f, 10.006f)
                curveTo(2.995f, 9.837f, 3.022f, 9.667f, 3.065f, 9.502f)
                lineTo(4.11f, 5.495f)
                curveTo(4.34f, 4.615f, 5.135f, 4f, 6.045f, 4f)
                horizontalLineTo(17.955f)
                curveTo(18.865f, 4f, 19.66f, 4.615f, 19.89f, 5.495f)
                lineTo(20.935f, 9.502f)
                curveTo(20.978f, 9.667f, 21.005f, 9.837f, 20.986f, 10.006f)
                curveTo(20.858f, 11.128f, 19.906f, 12f, 18.75f, 12f)
                curveTo(17.507f, 12f, 16.5f, 10.993f, 16.5f, 9.75f)
                moveTo(7.5f, 9.75f)
                curveTo(7.5f, 10.993f, 8.507f, 12f, 9.75f, 12f)
                curveTo(10.993f, 12f, 12f, 10.993f, 12f, 9.75f)
                moveTo(7.5f, 9.75f)
                lineTo(8f, 4f)
                moveTo(12f, 9.75f)
                curveTo(12f, 10.993f, 13.007f, 12f, 14.25f, 12f)
                curveTo(15.493f, 12f, 16.5f, 10.993f, 16.5f, 9.75f)
                moveTo(12f, 9.75f)
                verticalLineTo(4f)
                moveTo(16.5f, 9.75f)
                lineTo(16f, 4f)
            }
        }.build()

        return _StoreFilter!!
    }

@Suppress("ObjectPropertyName")
private var _StoreFilter: ImageVector? = null
