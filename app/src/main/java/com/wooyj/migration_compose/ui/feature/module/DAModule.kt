package com.wooyj.migration_compose.ui.feature.module

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.wooyj.migration_compose.ui.feature.component.SeeMoreButton
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.glowRed
import com.wooyj.migration_compose.ui.theme.highLightGlowRed
import com.wooyj.migration_compose.ui.theme.multiLine


@Composable
fun DAModule(banner: common.Common.LineBanner) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(16.dp)
    ) {

        val context = LocalContext.current

        Text(banner.title, style = GlowpickTheme.typography.title2.multiLine().bold())
        Spacer(modifier = Modifier.padding(top = 16.dp))
        AsyncImage(
            model = banner.imageUrl,
            contentDescription = "DA Image",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(16 / 9f)
                .clip(RoundedCornerShape(12.dp))
        )
        Text(
            "Sponsored",
            modifier = Modifier.padding(vertical = 16.dp),
            style = GlowpickTheme.typography.footnote.copy(color = glowRed)
        )
        Text(
            banner.description,
            style = GlowpickTheme.typography.body1.multiLine()
        )
        Spacer(modifier = Modifier.padding(top = 16.dp))
        SeeMoreButton(
            highLightGlowRed,
            "해당 제품 보기",
            glowRed
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewDAModule() {
    GlowpickTheme {
        DAModule(
            common.Common.LineBanner.newBuilder()
                .setTitle("자연스러운 생기를 위한 파데프리")
                .setDescription("다가오는 여름, 높은 자외선 차단 지수와 베이스 메이크업의 무너짐이 고민이시라면 파데 프리를 도전해보세요. 선크림처럼 가볍게 발리지만 자연스러운 스킨 컬러로 모공과 결점을 자연스럽게 커버해주는 내추럴한 아이템들을 소개할게요.")
                .setImageUrl("https://dn5hzapyfrpio.cloudfront.net/init-popup/9d7/9d7df190-9709-11ed-b935-018d7c0b73fa.jpeg")
                .build()
        )
    }
}