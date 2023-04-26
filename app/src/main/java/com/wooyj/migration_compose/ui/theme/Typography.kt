package com.wooyj.migration_compose.ui.theme

import androidx.compose.material.withDefaultFontFamily
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


class GlowpickTypography internal constructor(
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
    val caption2: TextStyle,
) {
    constructor(
        defaultFontFamily: FontFamily = FontFamily(
            Font(R.font.pretendard),
        ),
        largeTitle: TextStyle = TextStyle(
            fontSize = 34.sp
        ),
        title1: TextStyle = TextStyle(
            fontSize = 28.sp
        )

    ) : this(
        largeTitle = largeTitle.withDefaultFontFamily(defaultFontFamily),
        title1 = title1.withDefaultFontFamily(defaultFontFamily),
        title2 = title2.withDefaultFontFamily(defaultFontFamily),
        title3 = title3.withDefaultFontFamily(defaultFontFamily),
        heading1 = heading1.withDefaultFontFamily(defaultFontFamily),
        heading2 = heading2.withDefaultFontFamily(defaultFontFamily),
        body1 = body1.withDefaultFontFamily(defaultFontFamily),
        body2 = body2.withDefaultFontFamily(defaultFontFamily),
        footnote = footnote.withDefaultFontFamily(defaultFontFamily),
        caption1 = caption1.withDefaultFontFamily(defaultFontFamily),
        caption2 = caption2.withDefaultFontFamily(defaultFontFamily),
    )
}


///**
// *
// * TextType별로 만든 enum class. type별 font size와 lineheight가 달라서 enum화 하였다.
// *
// * @author wooyj
// * @since 2023.04.26
// *
// * @param fontSize TextUnit, 폰트 사이즈
// *
// */
//enum class GlowpickTextType(val fontSize: TextUnit) {
//    LARGE_TITLE(34.sp),
//    TITLE_1(28.sp),
//    TITLE_2(24.sp),
//    TITLE_3(20.sp),
//    HEADING_1(18.sp),
//    HEADING_2(16.sp),
//    BODY_1(15.sp),
//    BODY_2(14.sp),
//    FOOTNOTE(13.sp),
//    CAPTION_1(12.sp),
//    CAPTION_2(11.sp);
//}

//sealed interface GlowpickTextStyle{
//    val fontSize : TextUnit
//}
//
//class LargeTitle() : GlowpickTextStyle{
//    override val fontSize: TextUnit = 34.sp
//}
//class Title1() : GlowpickTextStyle{
//    override val fontSize: TextUnit = 28.sp
//}
//class Title2() : GlowpickTextStyle{
//    override val fontSize: TextUnit = 24.sp
//}
//class Title3() : GlowpickTextStyle{
//    override val fontSize: TextUnit = 20.sp
//}
//class Heading1() : GlowpickTextStyle{
//    override val fontSize: TextUnit = 18.sp
//}
//class Heading2() : GlowpickTextStyle{
//    override val fontSize: TextUnit = 16.sp
//}
//class Body1() : GlowpickTextStyle{
//    override val fontSize: TextUnit = 15.sp
//}
//class Body2() : GlowpickTextStyle{
//    override val fontSize: TextUnit = 14.sp
//}
//class Footnote() : GlowpickTextStyle{
//    override val fontSize: TextUnit = 13.sp
//}
//class Caption1() : GlowpickTextStyle{
//    override val fontSize: TextUnit = 12.sp
//}
//class Caption2() : GlowpickTextStyle{
//    override val fontSize: TextUnit = 11.sp
//}


/**
 *
 *  Glowpick Text Type 이 무엇인지, multiline 인지 아닌지, bold인지 아닌지에 따라 달라지는 TextStyle을 build하는 function
 *  - ex) buildTextStyle(GlowpickTextType.LARGE_TITLE, false, false)
 *
 *  @author wooyj
 *  @since 2023.04.26
 *
 *  @param type GlowpickTextType
 *  @param isMulti Boolean, Multiline일 경우 true, 아닐 경우 false
 *  @param isBold Boolean, Bold일 경우 true, 아닐 경우 false
 *
 *  @return TextStyle
 *
 */
//fun buildTextStyle(isMulti: Boolean, isBold: Boolean, type: GlowpickTextType): TextStyle =
fun buildTextStyle(isMulti: Boolean, isBold: Boolean, type: GlowpickTextStyle): TextStyle =
    TextStyle(
        fontFamily = pretendardFontFamily,
        fontWeight = if (isBold) {
            FontWeight.Bold
        } else {
            FontWeight.Normal
        },
        fontSize = type.fontSize
    ).also {
        if (isMulti) {
            it.copy(
                lineHeightStyle = LineHeightStyle(
                    alignment = LineHeightStyle.Alignment.Center,
                    trim = LineHeightStyle.Trim.None
                ),
                lineHeight = when (type.name) {
//                    0 -> {
//                        10.sp
//                    }
//                    1 -> {
//                        9.sp
//                    }
//                    2 -> {
//                        7.sp
//                    }
//                    in 3..4 -> {
//                        6.sp
//                    }
//                    in 5..6 -> {
//                        5.sp
//                    }
//                    in 7..9 -> {
//                        4.sp
//                    }
//                    10 -> {
//                        3.sp
//                    }
//                    else -> {
//                        0.sp
//                    }
                    GlowpickTextType.LARGE_TITLE.name -> {
                        10.sp
                    }
                    GlowpickTextType.TITLE_1.name -> {
                        9.sp
                    }
                    GlowpickTextType.TITLE_2.name -> {
                        7.sp
                    }
                    GlowpickTextType.TITLE_3.name, GlowpickTextType.HEADING_1.name -> {
                        6.sp
                    }
                    GlowpickTextType.HEADING_2.name, GlowpickTextType.BODY_1.name -> {
                        5.sp
                    }
                    GlowpickTextType.BODY_2.name, GlowpickTextType.FOOTNOTE.name, GlowpickTextType.CAPTION_1.name -> {
                        4.sp
                    }
                    GlowpickTextType.CAPTION_2.name -> {
                        3.sp
                    }
                }
            )
        }
    }


