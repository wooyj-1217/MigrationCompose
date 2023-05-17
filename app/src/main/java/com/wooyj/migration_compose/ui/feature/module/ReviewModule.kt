package com.wooyj.migration_compose.ui.feature.module

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.wooyj.migration_compose.R
import com.wooyj.migration_compose.ui.feature.component.ImageWithRatio
import com.wooyj.migration_compose.ui.feature.component.ModuleHeader
import com.wooyj.migration_compose.ui.feature.component.RankingProductItem
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.multiLine
import com.wooyj.migration_compose.ui.theme.secondaryLight
import com.wooyj.migration_compose.ui.theme.tertiaryLight


@Composable
@Preview(showBackground = true)
fun PreviewReviewModule() {
    GlowpickTheme {
        ReviewModule()
    }
}


@Composable
fun ReviewModule() {
    Column {
        ModuleHeader(headerText1 = "리뷰로 찾는", headerText2 = "#립틴트/라커 인생템") {}
        Spacer(modifier = Modifier.padding(top = 16.dp))
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(3) {
                ReviewItem()
            }
        }

    }
}


@Composable
fun ReviewItem() {
    Column(
        modifier = Modifier
            .width(340.dp)
            .wrapContentHeight()
    ) {
        RankingProductItem("시울", "무드 플러쉬 매트 틴트", "4.16", "2,345", "300ml / 45,000원")
        Review()
    }
}


@Composable
fun Review() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Image(
            painter = painterResource(id = R.drawable.quatationmark),
            contentDescription = "쌍따옴표"
        )
        Text(
            "제목제목제목",
            style = GlowpickTheme.typography.heading1.bold(),
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            "고장 나 버린 Navigation 길을 잃어 I wanna know how you fe" +
                    "el 가쁘게 숨을 몰아쉬어 수면 위로 간신히 뻐끔대 You know that 그런 모습" +
                    "도 좋아 난 뜨거운 불씨 잊지 마 기억해 You're not bad But rather good 네 " +
                    "안의 모습들은 It's not fault 그대로 보여줘 That you're so good 어설픈 모습까" +
                    "지 It's your world 이 말을 기억해 Ah na na Na na na na Ah n" +
                    "a na Na na na na Ah na na Na na na na You're so Loveable",
            style = GlowpickTheme.typography.body2.multiLine().copy(secondaryLight),
            modifier = Modifier.padding(top = 16.dp),
            maxLines = 5
        )
        Spacer(modifier = Modifier.padding(top = 16.dp))
        profile()
        Spacer(modifier = Modifier.padding(top = 16.dp))
    }
}


@Composable
fun profile() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            model = "https://www.example.com/image.jpg",
            contentDescription = "프로필이미지",
            placeholder = painterResource(R.drawable.avatar),
            modifier = Modifier
                .width(32.dp)
                .height(32.dp)
                .clip(CircleShape)
        )
        Spacer(Modifier.padding(start = 8.dp))
        Column() {
            Text("닉네임", style = GlowpickTheme.typography.footnote.bold())
            Text("23세 | 지성 | 여", style = GlowpickTheme.typography.footnote.copy(secondaryLight))
        }
    }
}


