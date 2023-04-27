package com.wooyj.migration_compose.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

//Brand Colors
val glowRed = "#EB3D48".color
val glowViolet = "#7761E6".color

//System Colors
val glowYellow = "#FFE141".color
val glowBlue = "#5297FF".color
val glowGreen = "#18BE82".color
val starRed = "#F3616A".color
val disable = "#EBEBEB".color

//Highlight Colors
val highLightGlowRed = "#FDECED".color
val highLightGlowViolet = "#F1EFFC".color
val highLightGlowViolet02 = "#E1DBFF".color

//Text Colors-Light
val primaryLight = "#333333".color
val secondaryLight = "#444444".color
val tertiaryLight = "#66444444".color
val quaternaryLight = "#33444444".color

//Text Colors-Dark
val primaryDark = "#FFFFFF".color
val secondaryDark = "#99FFFFFF".color
val tertiaryDark = "#66FFFFFF".color
val quaternaryDark = "#33FFFFFF".color

//Greyscale-Light
val greyLight01 = "#8E8E93".color
val greyLight02 = "#AEAEB2".color
val greyLight03 = "#C7C7CC".color
val greyLight04 = "#D1D1D6".color
val greyLight05 = "#E5E5EA".color
val greyLight06 = "#F2F2F7".color

//Greyscale-Dark
val greyDark01 = "#8E8E93".color
val greyDark02 = "#636366".color
val greyDark03 = "#48484A".color
val greyDark04 = "#3A3A3C".color
val greyDark05 = "#2C2C2E".color
val greyDark06 = "#1C1C1E".color

//Membership Levels
val master = glowRed
val expert = "#F3616A".color
val collector = "#F98383".color
val explorer = "#F1B1B0".color
val beginner = "#CABABB".color


val String.color
    get() = Color(android.graphics.Color.parseColor(this))

//@Immutable
//data class GlowpickColors(
//    val glowRed : Color,
//    val glowViolet : Color,
//    val glowYellow : Color,
//    val glowBlue : Color,
//    val glowGreen : Color,
//    val starRed : Color,
//    val disable : Color,
//
//    val highLightGlowRed : Color,
//    val highLightGlowViolet : Color,
//    val highLightGlowViolet02 : Color,
//
//    val primaryLight : Color,
//    val secondaryLight : Color,
//    val tertiaryLight : Color,
//    val quaternaryLight : Color,
//
//    val primaryDark : Color,
//    val secondaryDark : Color,
//    val tertiaryDark : Color,
//    val quaternaryDark : Color,
//
//    val greyLight01 : Color,
//    val greyLight02 : Color,
//    val greyLight03 : Color,
//    val greyLight04 : Color,
//    val greyLight05 : Color,
//    val greyLight06 : Color,
//
//    val greyDark01 : Color,
//    val greyDark02 : Color,
//    val greyDark03 : Color,
//    val greyDark04 : Color,
//    val greyDark05 : Color,
//    val greyDark06 : Color,
//
//    val master : Color,
//    val expert : Color,
//    val collector : Color,
//    val explorer : Color,
//    val beginner : Color,
//
//)
//
//val LocalGlowpickColors = staticCompositionLocalOf {
//    GlowpickColors(
//        glowRed = Color.Unspecified,
//        glowViolet = Color.Unspecified,
//        glowYellow = Color.Unspecified,
//        glowBlue = Color.Unspecified,
//        glowGreen = Color.Unspecified,
//        starRed = Color.Unspecified,
//        disable = Color.Unspecified,
//
//        highLightGlowRed = Color.Unspecified,
//        highLightGlowViolet = Color.Unspecified,
//        highLightGlowViolet02 = Color.Unspecified,
//
//        primaryLight = Color.Unspecified,
//        secondaryLight = Color.Unspecified,
//        tertiaryLight = Color.Unspecified,
//        quaternaryLight = Color.Unspecified,
//
//        primaryDark = Color.Unspecified,
//        secondaryDark = Color.Unspecified,
//        tertiaryDark = Color.Unspecified,
//        quaternaryDark = Color.Unspecified,
//
//        greyLight01 = Color.Unspecified,
//        greyLight02 = Color.Unspecified,
//        greyLight03 = Color.Unspecified,
//        greyLight04 = Color.Unspecified,
//        greyLight05 = Color.Unspecified,
//        greyLight06 = Color.Unspecified,
//
//        greyDark01 = Color.Unspecified,
//        greyDark02 = Color.Unspecified,
//        greyDark03 = Color.Unspecified,
//        greyDark04 = Color.Unspecified,
//        greyDark05 = Color.Unspecified,
//        greyDark06 = Color.Unspecified,
//
//        master = Color.Unspecified,
//        expert = Color.Unspecified,
//        collector = Color.Unspecified,
//        explorer = Color.Unspecified,
//        beginner = Color.Unspecified,
//    )
//}