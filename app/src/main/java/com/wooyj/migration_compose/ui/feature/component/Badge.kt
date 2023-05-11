package com.wooyj.migration_compose.ui.feature.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.tertiaryLight

@Preview(showBackground = true)
@Composable
fun PreviewBadges() {
    GlowpickTheme {
        Column {
            Badge(modifier = Modifier, tertiaryLight, "AD", Color.White)
        }
    }
}

@Composable
fun Badge(modifier: Modifier, backgroundColor: Color, badgeText : String, textColor:Color) {
    Box(
        modifier = modifier
            .wrapContentHeight()
            .wrapContentWidth()
            .clip(RoundedCornerShape(4.dp))
            .background(backgroundColor)
    ) {
        Text(
            badgeText,
            style = GlowpickTheme.typography.footnote.bold().copy(color = textColor),
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 5.dp)
        )
    }
}
