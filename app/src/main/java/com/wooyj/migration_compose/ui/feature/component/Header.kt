package com.wooyj.migration_compose.ui.feature.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.R
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold
import com.wooyj.migration_compose.ui.theme.greyDark04


@Preview(showBackground = true)
@Composable
fun PreviewModuleHeader() {
    GlowpickTheme {
        Column() {

            ModuleHeader("요즘 가장 인기있는", "#보습크림 Top 10") {}
            ModuleHeader("요즘 가장 인기있는") {}
        }
    }
}


@Composable
fun ModuleHeader(headerText1: String, headerText2: String = "", clickEvent: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(horizontal = 16.dp)
            .clickable(onClick = clickEvent),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(headerText1, style = GlowpickTheme.typography.title2.bold())
            if (headerText2 != "") {
                Text(headerText2, style = GlowpickTheme.typography.title2.bold())
            }
        }
        Spacer(
            Modifier
                .weight(1f)
                .fillMaxWidth()
        )
        Image(
            painter = painterResource(R.drawable.chevrons),
            contentDescription = "icon chevrons",
            modifier = Modifier,
            colorFilter = ColorFilter.tint(greyDark04)
        )
    }
}