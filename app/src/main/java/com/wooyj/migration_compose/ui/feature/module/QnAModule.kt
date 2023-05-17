package com.wooyj.migration_compose.ui.feature.module

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.wooyj.migration_compose.R
import com.wooyj.migration_compose.ui.feature.component.SeeMoreButton
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.glowRed
import com.wooyj.migration_compose.ui.theme.greyLight06
import com.wooyj.migration_compose.ui.theme.multiLine
import com.wooyj.migration_compose.ui.theme.secondaryLight


@Composable
@Preview(showBackground = true)
fun PreviewQnAModule() {
    GlowpickTheme {
        QnAModule()
    }
}


@Composable
fun QnAModule() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(top = 16.dp, start = 16.dp, end = 16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Q. ", style = GlowpickTheme.typography.title2.bold().multiLine().copy(glowRed))
            Text("QnA 제목", style = GlowpickTheme.typography.title2.bold().multiLine())
        }

        Spacer(Modifier.padding(top = 16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            AsyncImage(
                model = "https://www.example.com/image.jpg",
                contentDescription = "프로필이미지",
                placeholder = painterResource(R.drawable.avatar),
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp)
                    .clip(CircleShape)
            )
            Spacer(Modifier.padding(start = 8.dp))
            Text("닉네임", style = GlowpickTheme.typography.footnote.bold())
        }

        Spacer(Modifier.padding(top = 16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            Text(
                "깊은 어둠 속 빛나는 별처럼 우린 어디서든 서로 알아볼 수 있어 눈부신 spotlight 너와 " +
                        "나 그 맘속에 영원히 피어날 찬란한 이 순간 like, like a panorama",
                style = GlowpickTheme.typography.body1.multiLine(),
                modifier = Modifier.fillMaxWidth(289f / 361f),
                maxLines = 3,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.padding(start = 16.dp))
            Box(modifier = Modifier.wrapContentSize()) {
                AsyncImage(
                    model = "https://www.example.com/image.jpg",
                    contentDescription = "프로필이미지",
                    placeholder = painterResource(R.drawable.avatar),
                    modifier = Modifier
                        .width(56.dp)
                        .height(56.dp)
                        .clip(RoundedCornerShape(12.dp))
                )
                Text(
                    "+6",
                    style = GlowpickTheme.typography.heading2.copy(Color.White),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }

        Spacer(Modifier.padding(top = 16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                "A. ",
                style = GlowpickTheme.typography.body1.bold().copy(glowRed),
                textAlign = TextAlign.Center
            )
            Text("6개", style = GlowpickTheme.typography.body1.bold())
            Text("의 추천제품", style = GlowpickTheme.typography.body1.copy(secondaryLight))
        }

        Spacer(Modifier.padding(top = 16.dp))

        SeeMoreButton(
            backgroundColor = greyLight06,
            buttonText = "자세히 보기",
            textColor = secondaryLight
        ) {
        }
        Spacer(Modifier.padding(top = 8.dp))

    }
}