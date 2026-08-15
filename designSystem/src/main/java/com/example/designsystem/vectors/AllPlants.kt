package com.example.designsystem.vectors

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val AllPlants: ImageVector
    get() {
        if (_AllPlants != null) {
            return _AllPlants!!
        }
        _AllPlants = ImageVector.Builder(
            name = "AllPlants",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 100f,
            viewportHeight = 100f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(57f, 44.5f)
                curveToRelative(-1.5f, 0f, -2.7f, -1.2f, -2.7f, -2.7f)
                verticalLineTo(24.5f)
                curveToRelative(0f, -1.5f, 1.2f, -2.7f, 2.7f, -2.7f)
                horizontalLineToRelative(17.6f)
                curveToRelative(1.5f, 0f, 2.7f, 1.2f, 2.7f, 2.7f)
                verticalLineToRelative(17.3f)
                curveToRelative(0f, 1.5f, -1.2f, 2.7f, -2.7f, 2.7f)
                horizontalLineTo(57f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(64.6f, 54.7f)
                lineTo(54.3f, 65.8f)
                curveToRelative(-0.6f, 0.6f, -0.6f, 1.7f, 0f, 2.3f)
                lineToRelative(10.3f, 11.1f)
                curveToRelative(0.7f, 0.7f, 1.8f, 0.7f, 2.5f, 0f)
                lineToRelative(10.3f, -11.1f)
                curveToRelative(0.6f, -0.6f, 0.6f, -1.7f, 0f, -2.3f)
                lineTo(67.1f, 54.7f)
                curveTo(66.4f, 54f, 65.2f, 54f, 64.6f, 54.7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(33.8f, 66.6f)
                moveToRelative(-11.6f, 0f)
                arcToRelative(11.6f, 11.6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 23.2f, 0f)
                arcToRelative(11.6f, 11.6f, 0f, isMoreThanHalf = true, isPositiveArc = true, -23.2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.6f, 25.7f)
                lineToRelative(8.9f, -5.1f)
                curveToRelative(0.8f, -0.5f, 1.8f, -0.5f, 2.7f, 0f)
                lineToRelative(8.9f, 5.1f)
                curveToRelative(0.8f, 0.5f, 1.3f, 1.4f, 1.3f, 2.3f)
                verticalLineToRelative(10.2f)
                curveToRelative(0f, 0.9f, -0.5f, 1.8f, -1.3f, 2.3f)
                lineToRelative(-8.9f, 5.1f)
                curveToRelative(-0.8f, 0.5f, -1.8f, 0.5f, -2.7f, 0f)
                lineToRelative(-8.9f, -5.1f)
                curveToRelative(-0.8f, -0.5f, -1.4f, -1.4f, -1.4f, -2.3f)
                verticalLineTo(28f)
                curveTo(22.2f, 27f, 22.8f, 26.1f, 23.6f, 25.7f)
                close()
            }
        }.build()

        return _AllPlants!!
    }

@Suppress("ObjectPropertyName")
private var _AllPlants: ImageVector? = null

@Preview
@Composable
private fun IconPreview(){
    Image(
        imageVector = AllPlants,
        contentDescription = "All Plants"
    )
}