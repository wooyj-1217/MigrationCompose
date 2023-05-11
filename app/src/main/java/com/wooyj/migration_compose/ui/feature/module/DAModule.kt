package com.wooyj.migration_compose.ui.feature.module

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
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
import com.wooyj.migration_compose.ui.feature.component.SeeMoreButton
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.glowRed
import com.wooyj.migration_compose.ui.theme.glowViolet
import com.wooyj.migration_compose.ui.theme.multiLine
import com.wooyj.migration_compose.ui.theme.tertiaryLight


@Composable
fun DAModule() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(16.dp)
    ) {

        val context = LocalContext.current

        Text("자연스러운 생기를 위한 파데프리", style = GlowpickTheme.typography.title2.multiLine().bold())
        ImageWithRatio(
            modifier = Modifier.padding(top = 16.dp),
            shape = RoundedCornerShape(12.dp),
            ratio = 16f / 9f,
            background = glowViolet
        ) {
            Badge(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(end = 16.dp, top = 16.dp),
                tertiaryLight,
                "AD",
                Color.White
            )
        }
        Text(
            "Sponsored",
            modifier = Modifier.padding(vertical = 16.dp),
            style = GlowpickTheme.typography.footnote.copy(color = glowRed)
        )
        Text(
            "다가오는 여름, 높은 자외선 차단 지수와 베이스 메이크업의 무너짐이 고민이시라면 파데 프리를 도전해보세요. 선크림처럼 가볍게 발리지만 자연스러운 스킨 컬러로 모공과 결점을 자연스럽게 커버해주는 내추럴한 아이템들을 소개할게요.",
            style = GlowpickTheme.typography.body1.multiLine()
        )
        SeeMoreButton(
            modifier = Modifier.padding(top = 16.dp),
            "해당 제품 보기"
        ) { Toast.makeText(context, "해당 제품 보기", Toast.LENGTH_LONG).show() }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewDAModule() {
    GlowpickTheme {
        DAModule()
    }
}