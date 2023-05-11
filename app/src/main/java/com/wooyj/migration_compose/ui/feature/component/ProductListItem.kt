package com.wooyj.migration_compose.ui.feature.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.glowBlue
import com.wooyj.migration_compose.ui.theme.greyLight06


@Preview(showBackground = true)
@Composable
fun PreviewProductListItem() {
    GlowpickTheme {
        Column {
            ProductListItem("시울", "무드 플러쉬 매트 틴트", modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp))
            ProductListItem(
                brandName = "시울",
                productName = "무드 플러쉬 매트 틴트",
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .background(color = greyLight06)
                    .padding(8.dp)
            )
        }
    }
}


@Composable
fun ProductListItem(brandName: String, productName: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .wrapContentHeight()
    ) {
        ImageWithRatio(
            modifier = Modifier.width(64.dp),
            shape = RoundedCornerShape(8.dp),
            ratio = 1f / 1f,
            background = Color.White
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp)
                .align(Alignment.CenterVertically)
        ) {
            Column {
                Text(brandName, style = GlowpickTheme.typography.body2.bold())
                Text(
                    productName,
                    style = GlowpickTheme.typography.body2,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}