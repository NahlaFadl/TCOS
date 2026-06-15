package com.example.designsystem.vectors

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val CheckMark: ImageVector
    get() {
        if (_DoneRoundSvgrepoCom != null) {
            return _DoneRoundSvgrepoCom!!
        }
        _DoneRoundSvgrepoCom = ImageVector.Builder(
            name = "DoneRoundSvgrepoCom",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.White),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(5f, 14f)
                lineTo(8.233f, 16.425f)
                curveTo(8.662f, 16.746f, 9.268f, 16.673f, 9.607f, 16.258f)
                lineTo(18f, 6f)
            }
        }.build()

        return _DoneRoundSvgrepoCom!!
    }

@Suppress("ObjectPropertyName")
private var _DoneRoundSvgrepoCom: ImageVector? = null

@Preview
@Composable
private fun IconPreview(){
    Image(
        imageVector = CheckMark,
        contentDescription = "Checked"
    )
}