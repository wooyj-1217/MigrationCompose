package com.wooyj.migration_compose.ui.theme

import androidx.compose.ui.graphics.Color


val String.color
    get() = Color(android.graphics.Color.parseColor(this))


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