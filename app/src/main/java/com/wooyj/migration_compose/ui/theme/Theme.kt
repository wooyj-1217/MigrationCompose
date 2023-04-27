package com.wooyj.migration_compose.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 *
 * @see <a href=https://developer.android.com/jetpack/compose/designsystems/custom?hl=ko#replacing-systems>Material 시스템 대체</a>
 *
 */
@Composable
fun GlowpickTheme(
    content: @Composable () -> Unit
) {
    val glowpickTypography = GlowpickTypography(
        largeTitle = buildTextStyle(GlowpickTextType.LARGE_TITLE),
        title1 = buildTextStyle(GlowpickTextType.TITLE_1),
        title2 = buildTextStyle(GlowpickTextType.TITLE_2),
        title3 = buildTextStyle(GlowpickTextType.TITLE_3),
        heading1 = buildTextStyle(GlowpickTextType.HEADING_1),
        heading2 = buildTextStyle(GlowpickTextType.HEADING_2),
        body1 = buildTextStyle(GlowpickTextType.BODY_1),
        body2 = buildTextStyle(GlowpickTextType.BODY_2),
        footnote = buildTextStyle(GlowpickTextType.FOOTNOTE),
        caption1 = buildTextStyle(GlowpickTextType.CAPTION_1),
        caption2 = buildTextStyle(GlowpickTextType.CAPTION_2)
    )


    CompositionLocalProvider(
        LocalGlowpickTypography provides glowpickTypography
    ) {
        MaterialTheme(content = content)
    }
}

// GlowpickTheme.typography.largeTitle 과 같은 방식으로 쓰기위한 object
object GlowpickTheme {
    val typography: GlowpickTypography
        @Composable
        get() = LocalGlowpickTypography.current
}