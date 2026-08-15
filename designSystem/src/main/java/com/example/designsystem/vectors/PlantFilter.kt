package com.example.designsystem.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PlantFilter: ImageVector
    get() {
        if (_PlantFilter != null) {
            return _PlantFilter!!
        }
        _PlantFilter = ImageVector.Builder(
            name = "PlantFilter",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1A729E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 4.5f)
                curveTo(7f, 2.015f, 9.015f, 0f, 11.5f, 0f)
                horizontalLineTo(15f)
                verticalLineTo(3.5f)
                curveTo(15f, 5.985f, 12.985f, 8f, 10.5f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(4.5f)
                curveTo(2.015f, 11f, 0f, 8.985f, 0f, 6.5f)
                verticalLineTo(3f)
                horizontalLineTo(3.5f)
                curveTo(4.914f, 3f, 6.175f, 3.652f, 7f, 4.671f)
                verticalLineTo(4.5f)
                close()
                moveTo(8.146f, 6.146f)
                lineTo(11.146f, 3.146f)
                lineTo(11.854f, 3.854f)
                lineTo(8.854f, 6.854f)
                lineTo(8.146f, 6.146f)
                close()
                moveTo(6.146f, 9.854f)
                lineTo(3.146f, 6.854f)
                lineTo(3.854f, 6.146f)
                lineTo(6.854f, 9.146f)
                lineTo(6.146f, 9.854f)
                close()
            }
        }.build()

        return _PlantFilter!!
    }

@Suppress("ObjectPropertyName")
private var _PlantFilter: ImageVector? = null
