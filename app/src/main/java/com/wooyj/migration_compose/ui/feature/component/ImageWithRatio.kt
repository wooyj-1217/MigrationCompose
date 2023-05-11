package com.wooyj.migration_compose.ui.feature.component

import androidx.appcompat.widget.ActivityChooserView.InnerLayout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.glowBlue
import com.wooyj.migration_compose.ui.theme.glowRed
import com.wooyj.migration_compose.ui.theme.glowViolet
import com.wooyj.migration_compose.ui.theme.tertiaryLight

@Composable
@Preview(showBackground = true)
fun PreviewImageWithRatio() {
    GlowpickTheme {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("16:9")
            ImageWithRatio(Modifier, RoundedCornerShape(12.dp), 16f / 9f, glowViolet) {
                Badge(
                    modifier = Modifier.align(Alignment.TopEnd),
                    backgroundColor = tertiaryLight,
                    badgeText = "AD",
                    textColor = Color.White
                )
            }
            Text("4:3")
            ImageWithRatio(Modifier, RoundedCornerShape(12.dp), 4f / 3f, glowRed) {}
            Text("메인 배너")
            ImageWithRatio(Modifier, RectangleShape, 393f / 295f, glowBlue) {}
        }
    }
}


@Composable
fun ImageWithRatio(
    modifier: Modifier,
    shape: Shape,
    ratio: Float,
    background: Color,
    content: @Composable (BoxScope.() -> Unit) = {}
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(ratio)
            .clip(shape)
            .background(color = background),
        content = content
    )
}
