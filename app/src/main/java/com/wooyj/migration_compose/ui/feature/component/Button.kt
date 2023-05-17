package com.wooyj.migration_compose.ui.feature.component

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.R
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.glowRed
import com.wooyj.migration_compose.ui.theme.greyLight01
import com.wooyj.migration_compose.ui.theme.greyLight06
import com.wooyj.migration_compose.ui.theme.highLightGlowRed
import com.wooyj.migration_compose.ui.theme.secondaryLight

@Preview
@Composable
fun PreviewSeeMoreButton() {
    GlowpickTheme {
        Column {
            SeeMoreButton(
                greyLight06,
                "해당 제품 보기",
                secondaryLight
            ) { Log.e("SeeMoreButton", "Click!") }
            Spacer(modifier = Modifier.padding(top = 8.dp))
            SeeMoreButton(
                highLightGlowRed,
                "더 알아보기",
                glowRed
            ) { Log.e("SeeMoreButton", "Click!") }
        }
    }
}


@Composable
fun SeeMoreButton(
    backgroundColor : Color,
    buttonText: String,
    textColor: Color,
    modifier : Modifier = Modifier,
    clickEvent: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(backgroundColor)
            .clickable(onClick = clickEvent),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.padding(vertical = 16.5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(buttonText, style = GlowpickTheme.typography.body2.copy(color = textColor))
            Image(
                painter = painterResource(R.drawable.chevrons),
                contentDescription = "icon chevrons",
                modifier = Modifier.padding(start = 4.dp),
                colorFilter = ColorFilter.tint(textColor)
            )
        }
    }
}