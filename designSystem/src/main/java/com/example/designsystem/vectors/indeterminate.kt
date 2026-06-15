package com.example.designsystem.vectors

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Indeterminate: ImageVector
    get() {
        if (_IndeterminateSvgrepoCom != null) {
            return _IndeterminateSvgrepoCom!!
        }
        _IndeterminateSvgrepoCom = ImageVector.Builder(
            name = "IndeterminateSvgrepoCom",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.White),
                strokeLineWidth = 3f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 12f)
                horizontalLineToRelative(14f)
            }
        }.build()

        return _IndeterminateSvgrepoCom!!
    }

@Suppress("ObjectPropertyName")
private var _IndeterminateSvgrepoCom: ImageVector? = null

@Preview
@Composable
private fun IconPreview(){
    Image(
        imageVector = Indeterminate,
        contentDescription = "Indeterminate"
    )
}