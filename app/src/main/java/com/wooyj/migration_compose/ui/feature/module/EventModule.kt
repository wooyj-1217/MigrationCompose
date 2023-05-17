package com.wooyj.migration_compose.ui.feature.module

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wooyj.migration_compose.ui.feature.component.ModuleHeader
import com.wooyj.migration_compose.ui.feature.component.ProductItem
import com.wooyj.migration_compose.ui.feature.component.SeeMoreButton
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.greyLight06
import com.wooyj.migration_compose.ui.theme.secondaryLight


@Preview(showBackground = true)
@Composable
fun PreviewEventModule() {
    GlowpickTheme {
        EventModule()
    }
}


@Composable
fun EventModule() {
    Column {
        ModuleHeader(headerText1 = "무료로 체험해 보세요") {
        }
        Spacer(modifier = Modifier.padding(top = 16.dp))
        ProductItem(
            "시울", "무드 플러쉬 매트 틴트",
            modifier = Modifier.clickable {  }
        )
        ProductItem(
            "시울", "무드 플러쉬 매트 틴트",
            modifier = Modifier.clickable {  }
        )
        ProductItem(
            "시울", "무드 플러쉬 매트 틴트",
            modifier = Modifier.clickable {  }
        )
        Spacer(modifier = Modifier.padding(top = 16.dp))
        SeeMoreButton(
            modifier = Modifier.padding(horizontal = 16.dp),
            backgroundColor = greyLight06,
            buttonText = "무료체험 이벤트 모두 보기",
            textColor = secondaryLight
        ) {
        }
    }

}