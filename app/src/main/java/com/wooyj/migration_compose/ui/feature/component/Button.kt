package com.wooyj.migration_compose.ui.feature.component

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.R
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.greyLight01
import com.wooyj.migration_compose.ui.theme.greyLight06
import com.wooyj.migration_compose.ui.theme.secondaryLight

@Preview
@Composable
fun PreviewSeeMoreButton() {
    GlowpickTheme {
        SeeMoreButton(modifier = Modifier, "해당 제품 보기") { Log.e("SeeMoreButton", "Click!") }
    }
}


@Composable
fun SeeMoreButton(modifier: Modifier, buttonText : String, clickEvent: () -> Unit) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(greyLight06)
            .clickable(onClick = clickEvent),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.padding(vertical = 16.5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(buttonText, style = GlowpickTheme.typography.body2.copy(color = secondaryLight))
            Image(
                painter = painterResource(R.drawable.chevrons),
                contentDescription = "icon chevrons",
                modifier = Modifier.padding(start = 4.dp),
                colorFilter = ColorFilter.tint(greyLight01)
            )
        }
    }
}