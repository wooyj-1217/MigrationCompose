package com.wooyj.migration_compose.ui.feature.module

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.ui.feature.component.Badge
import com.wooyj.migration_compose.ui.feature.component.ImageWithRatio
import com.wooyj.migration_compose.ui.feature.component.ProductListItem
import com.wooyj.migration_compose.ui.feature.component.SeeMoreButton
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.glowGreen
import com.wooyj.migration_compose.ui.theme.glowRed
import com.wooyj.migration_compose.ui.theme.multiLine


@Preview(showBackground = true)
@Composable
fun PreviewCastModule() {
    GlowpickTheme {
        CastModule()
    }
}

@Composable
fun CastModule() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .wrapContentHeight()
    ) {

        val context = LocalContext.current

        Text("'럭셔리 브랜드 엠버서더' 뉴진스", style = GlowpickTheme.typography.title2.multiLine().bold())
        ImageWithRatio(
            modifier = Modifier.padding(top = 16.dp),
            shape = RoundedCornerShape(12.dp),
            ratio = 16f / 9f,
            background = glowGreen
        ) {
            Badge(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(start = 16.dp, top = 16.dp),
                backgroundColor = glowRed,
                badgeText = "New",
                textColor = Color.White
            )
        }
        Text(
            "뉴진스 멤버 '하니'가 K-POP 최초로 조르지오 아르마니 뷰티 글로벌 앰버서더로 발탁됐다. 유니크한 음색과 매력적인 마스크로 글로벌 팬들의 시선을 사로잡고 있는 뉴진스 하니는 아르마니 뷰티의 대표 제품인 파워 패브릭 플러스 파운데이션의",
            style = GlowpickTheme.typography.body1.multiLine(),
            modifier = Modifier.padding(vertical = 16.dp)
        )

        ProductListItem(
            brandName = "시울",
            productName = "무드 플러쉬 매트 틴트",
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        ProductListItem(
            brandName = "시울",
            productName = "무드 플러쉬 매트 틴트",
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        SeeMoreButton(modifier = Modifier.padding(top = 16.dp), buttonText = "추천제품 더보기") {
            Toast.makeText(context, "추천제품 더보기", Toast.LENGTH_LONG).show()
        }
    }
}