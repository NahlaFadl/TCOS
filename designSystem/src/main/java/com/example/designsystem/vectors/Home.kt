package com.example.designsystem.vectors

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Home: ImageVector
    get() {
        if (_Home != null) {
            return _Home!!
        }
        _Home = ImageVector.Builder(
            name = "Home",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.5f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 0.5f,
                strokeLineWidth = 1.5f
            ) {
                moveTo(2.364f, 12.958f)
                curveTo(1.985f, 10.321f, 1.795f, 9.002f, 2.335f, 7.875f)
                curveTo(2.876f, 6.748f, 4.026f, 6.062f, 6.327f, 4.692f)
                lineTo(7.712f, 3.867f)
                curveTo(9.801f, 2.622f, 10.846f, 2f, 12f, 2f)
                curveTo(13.154f, 2f, 14.199f, 2.622f, 16.288f, 3.867f)
                lineTo(17.673f, 4.692f)
                curveTo(19.974f, 6.062f, 21.124f, 6.748f, 21.665f, 7.875f)
                curveTo(22.205f, 9.002f, 22.015f, 10.321f, 21.636f, 12.958f)
                lineTo(21.357f, 14.895f)
                curveTo(20.87f, 18.283f, 20.626f, 19.976f, 19.451f, 20.988f)
                curveTo(18.276f, 22f, 16.553f, 22f, 13.106f, 22f)
                horizontalLineTo(10.894f)
                curveTo(7.447f, 22f, 5.724f, 22f, 4.549f, 20.988f)
                curveTo(3.374f, 19.976f, 3.13f, 18.283f, 2.643f, 14.895f)
                lineTo(2.364f, 12.958f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(9f, 16f)
                curveTo(9.85f, 16.63f, 10.885f, 17f, 12f, 17f)
                curveTo(13.115f, 17f, 14.15f, 16.63f, 15f, 16f)
            }
        }.build()

        return _Home!!
    }

@Suppress("ObjectPropertyName")
private var _Home: ImageVector? = null

@Preview
@Composable
private fun IconPreview(){
    Image(
        imageVector = Home,
        contentDescription = "All Plants"
    )
}