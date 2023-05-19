package com.wooyj.migration_compose.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
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
    LARGE_TITLE(34.sp, (37.4).sp, 51.sp),
    TITLE_1(28.sp, (30.8).sp, 42.sp),
    TITLE_2(24.sp, (26.4).sp, 36.sp),
    TITLE_3(20.sp, (22).sp, 30.sp),
    HEADING_1(18.sp, (19.8).sp, 27.sp),
    HEADING_2(16.sp, (17.6).sp, 24.sp),
    BODY_1(15.sp, (16.5).sp, 22.5.sp),
    BODY_2(14.sp, (15.4).sp, 21.sp),
    FOOTNOTE(13.sp, (14.3).sp, 19.5.sp),
    CAPTION_1(12.sp, (13.2).sp, 18.sp),
    CAPTION_2(11.sp, (12.1).sp, 16.5.sp);
}

fun TextStyle.bold(): TextStyle = this.copy(fontWeight = FontWeight.Bold)
fun TextStyle.multiLine(): TextStyle = this.copy(
    lineHeight = when (this.fontSize) {
        GlowpickTextType.LARGE_TITLE.fontSize -> {
            GlowpickTextType.LARGE_TITLE.multiLineHeight
        }

        GlowpickTextType.TITLE_1.fontSize -> {
            GlowpickTextType.TITLE_1.multiLineHeight
        }

        GlowpickTextType.TITLE_2.fontSize -> {
            GlowpickTextType.TITLE_2.multiLineHeight
        }

        GlowpickTextType.TITLE_3.fontSize -> {
            GlowpickTextType.TITLE_3.multiLineHeight
        }

        GlowpickTextType.HEADING_1.fontSize -> {
            GlowpickTextType.HEADING_1.multiLineHeight
        }

        GlowpickTextType.HEADING_2.fontSize -> {
            GlowpickTextType.HEADING_2.multiLineHeight
        }

        GlowpickTextType.BODY_1.fontSize -> {
            GlowpickTextType.BODY_1.multiLineHeight
        }

        GlowpickTextType.BODY_2.fontSize -> {
            GlowpickTextType.BODY_2.multiLineHeight
        }

        GlowpickTextType.FOOTNOTE.fontSize -> {
            GlowpickTextType.FOOTNOTE.multiLineHeight
        }

        GlowpickTextType.CAPTION_1.fontSize -> {
            GlowpickTextType.CAPTION_1.multiLineHeight
        }

        GlowpickTextType.CAPTION_2.fontSize -> {
            GlowpickTextType.CAPTION_2.multiLineHeight
        }

        else -> {
            TextStyle.Default.lineHeight
        }
    }
)


fun buildTextStyle(type: GlowpickTextType): TextStyle =
    TextStyle(
        fontFamily = pretendardFontFamily,
        fontSize = type.fontSize,
        lineHeight = type.lineHeight,
        platformStyle = PlatformTextStyle(
            includeFontPadding = false
        ),
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.None
        ), color = primaryLight
    )


@Composable
@Preview(showBackground = true)
fun typographyPreview() {
    GlowpickTheme {
        Row {
            Column {
                Text(
                    text = "LargeText",
                    style = GlowpickTheme.typography.largeTitle,
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "Title 1",
                    style = GlowpickTheme.typography.title1,
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "Title 2",
                    style = GlowpickTheme.typography.title2,
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "Title 3",
                    style = GlowpickTheme.typography.title3,
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "Heading 1",
                    style = GlowpickTheme.typography.heading1,
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "Heading 2",
                    style = GlowpickTheme.typography.heading2,
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "Body 1",
                    style = GlowpickTheme.typography.body1,
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "Body 2",
                    style = GlowpickTheme.typography.body2,
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "Footnote",
                    style = GlowpickTheme.typography.footnote,
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "caption 1",
                    style = GlowpickTheme.typography.caption1,
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "caption 2",
                    style = GlowpickTheme.typography.caption2,
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
            }
            Column(modifier = Modifier.padding(start = 74.dp)) {
                Text(
                    text = "LargeText",
                    style = GlowpickTheme.typography.largeTitle.bold(),
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "Title 1",
                    style = GlowpickTheme.typography.title1.bold(),
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "Title 2",
                    style = GlowpickTheme.typography.title2.bold(),
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "Title 3",
                    style = GlowpickTheme.typography.title3.bold(),
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "Heading 1",
                    style = GlowpickTheme.typography.heading1.bold(),
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "Heading 2",
                    style = GlowpickTheme.typography.heading2.bold(),
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "Body 1",
                    style = GlowpickTheme.typography.body1.bold(),
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "Body 2",
                    style = GlowpickTheme.typography.body2.bold(),
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "Footnote",
                    style = GlowpickTheme.typography.footnote.bold(),
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "caption 1",
                    style = GlowpickTheme.typography.caption1.bold(),
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
                Text(
                    text = "caption 2",
                    style = GlowpickTheme.typography.caption2.bold(),
                    modifier = Modifier.padding(vertical = 14.5.dp)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun multiTypographyPreview() {
    GlowpickTheme {
        Row {
            Column {
                Text(
                    text = "LargeText",
                    style = GlowpickTheme.typography.largeTitle.multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "Title 1",
                    style = GlowpickTheme.typography.title1.multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "Title 2",
                    style = GlowpickTheme.typography.title2.multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "Title 3",
                    style = GlowpickTheme.typography.title3.multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "Heading 1",
                    style = GlowpickTheme.typography.heading1.multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "Heading 2",
                    style = GlowpickTheme.typography.heading2.multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "Body 1",
                    style = GlowpickTheme.typography.body1.multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "Body 2",
                    style = GlowpickTheme.typography.body2.multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "Footnote",
                    style = GlowpickTheme.typography.footnote.multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "caption 1",
                    style = GlowpickTheme.typography.caption1.multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "caption 2",
                    style = GlowpickTheme.typography.caption2.multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
            }
            Column(modifier = Modifier.padding(start = 74.dp)) {
                Text(
                    text = "LargeText",
                    style = GlowpickTheme.typography.largeTitle.bold().multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "Title 1",
                    style = GlowpickTheme.typography.title1.bold().multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "Title 2",
                    style = GlowpickTheme.typography.title2.bold().multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "Title 3",
                    style = GlowpickTheme.typography.title3.bold().multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "Heading 1",
                    style = GlowpickTheme.typography.heading1.bold().multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "Heading 2",
                    style = GlowpickTheme.typography.heading2.bold().multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "Body 1",
                    style = GlowpickTheme.typography.body1.bold().multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "Body 2",
                    style = GlowpickTheme.typography.body2.bold().multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "Footnote",
                    style = GlowpickTheme.typography.footnote.bold().multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "caption 1",
                    style = GlowpickTheme.typography.caption1.bold().multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
                Text(
                    text = "caption 2",
                    style = GlowpickTheme.typography.caption2.bold().multiLine(),
                    modifier = Modifier.padding(vertical = 12.dp)
                )
            }
        }
    }
}
