package com.wooyj.migration_compose.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.wooyj.migration_compose.R


/**

1.2.0-alpha05 이후부터 includeFontPadding은 기본적으로 꺼져 있습니다.
- https://developer.android.com/jetpack/androidx/releases/compose-ui?hl=ko#1.2.0-alpha05
- https://medium.com/androiddevelopers/fixing-font-padding-in-compose-text-768cd232425b
 */

val pretendardFontFamily = FontFamily(
    Font(R.font.pretendard)
)

@Immutable
data class GlowpickTypography(
    val largeTitle: TextStyle,
    val title1: TextStyle,
    val title2: TextStyle,
    val title3: TextStyle,
    val heading1: TextStyle,
    val heading2: TextStyle,
    val body1: TextStyle,
    val body2: TextStyle,
    val footnote: TextStyle,
    val caption1: TextStyle,
    val caption2: TextStyle
)

val LocalGlowpickTypography = staticCompositionLocalOf {
    GlowpickTypography(
        largeTitle = TextStyle.Default,
        title1 = TextStyle.Default,
        title2 = TextStyle.Default,
        title3 = TextStyle.Default,
        heading1 = TextStyle.Default,
        heading2 = TextStyle.Default,
        body1 = TextStyle.Default,
        body2 = TextStyle.Default,
        footnote = TextStyle.Default,
        caption1 = TextStyle.Default,
        caption2 = TextStyle.Default
    )
}

enum class GlowpickTextType(
    val fontSize: TextUnit,
    val lineHeight: TextUnit,
    val multiLineHeight: TextUnit
) {
    LARGE_TITLE(34.sp, (-3).sp, 10.sp),
    TITLE_1(28.sp, (-3).sp, 9.sp),
    TITLE_2(24.sp, (-2).sp, 7.sp),
    TITLE_3(20.sp, (-2).sp, 6.sp),
    HEADING_1(18.sp, (-2).sp, 6.sp),
    HEADING_2(16.sp, (-1).sp, 5.sp),
    BODY_1(15.sp, (-1).sp, 5.sp),
    BODY_2(14.sp, (-1).sp, 4.sp),
    FOOTNOTE(13.sp, (-1).sp, 4.sp),
    CAPTION_1(12.sp, (-1).sp, 4.sp),
    CAPTION_2(11.sp, (-1).sp, 3.sp);
}

fun TextStyle.bold(): TextStyle = this.copy(fontWeight = FontWeight.Bold)
fun TextStyle.multiLine(): TextStyle = this.copy(
    lineHeightStyle = LineHeightStyle(
        alignment = LineHeightStyle.Alignment.Center,
        trim = LineHeightStyle.Trim.None
    ),
    //TODO("값마다 달라짐 lineheight, how to solve this problem.")
    lineHeight = 3.sp
)



fun buildTextStyle(type: GlowpickTextType): TextStyle =
    TextStyle(
        fontSize = type.fontSize,
        lineHeight = type.lineHeight
    )


