package com.wooyj.migration_compose.ui.feature.component.badge

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.bold


sealed interface BadgeType

sealed class RankingBadge : BadgeType {
    companion object {
        @Composable
        fun Large(modifier: Modifier, text: String, backgroundColor: Color, textColor: Color) =
            Badge(
                modifier = modifier,
                shape = RoundedCornerShape(8.dp),
                backgroundColor = backgroundColor,
                badgeText = text,
                textStyle = GlowpickTheme.typography.heading2.bold().copy(textColor),
                textModifier = Modifier.padding(
                    horizontal = if (text.isDigitsOnly()) {
                        when (text.length) {
                            1, 2 -> {
                                16.dp
                            }

                            else -> {
                                11.dp
                            }
                        }
                    } else {
                        8.dp
                    }, vertical = 11.dp
                )
            )

        @Composable
        fun Medium(modifier: Modifier, text: String, backgroundColor: Color, textColor: Color) =
            Badge(
                modifier = modifier,
                shape = RoundedCornerShape(8.dp),
                backgroundColor = backgroundColor,
                badgeText = text,
                textStyle = GlowpickTheme.typography.footnote.bold().copy(textColor),
                textModifier = Modifier.padding(
                    horizontal = if (text.isDigitsOnly()) {
                        when (text.length) {
                            1 -> {
                                (12.5).dp
                            }

                            2 -> {
                                (7.5).dp
                            }

                            else -> {
                                9.dp
                            }
                        }
                    } else {
                        8.dp
                    }, vertical = 9.dp
                )
            )

        @Composable
        fun Small(modifier: Modifier, text: String, backgroundColor: Color, textColor: Color) =
            Badge(
                modifier = modifier,
                shape = RoundedCornerShape(4.dp),
                backgroundColor = backgroundColor,
                badgeText = text,
                textStyle = GlowpickTheme.typography.caption2.bold().copy(textColor),
                textModifier = Modifier.padding(
                    horizontal = if (text.isDigitsOnly()) {
                        when (text.length) {
                            1 -> {
                                9.dp
                            }

                            2 -> {
                                (4.5).dp
                            }

                            else -> {
                                8.dp
                            }
                        }
                    } else {
                        8.dp
                    }, vertical = 6.dp
                )
            )

        @Composable
        fun XSmall(modifier: Modifier, text: String, backgroundColor: Color, textColor: Color) =
            Badge(
                modifier = modifier,
                shape = RoundedCornerShape(4.dp),
                backgroundColor = backgroundColor,
                badgeText = text,
                textStyle = GlowpickTheme.typography.caption2.bold().copy(textColor),
                textModifier = Modifier.padding(
                    horizontal = if (text.isDigitsOnly()) {
                        when (text.length) {
                            1 -> {
                                5.dp
                            }

                            else -> {
                                4.dp
                            }
                        }
                    } else {
                        4.dp
                    }, vertical = 2.dp
                )
            )

    }
}

sealed class PromotionBadge : BadgeType {
    companion object {
        @Composable
        fun Large(
            modifier: Modifier,
            text: String,
            backgroundColor: Color,
            textColor: Color,
            drawableId: Int = 0
        ) =
            Badge(
                modifier = modifier,
                shape = RectangleShape,
                backgroundColor = backgroundColor,
                badgeText = text,
                textStyle = GlowpickTheme.typography.footnote.bold().copy(textColor),
                textModifier = Modifier.padding(
                    horizontal = if (drawableId != 0) {
                        5.dp
                    } else {
                        8.dp
                    }, vertical = 5.dp
                ), drawableId = drawableId
            )

        @Composable
        fun Small(
            modifier: Modifier,
            text: String,
            backgroundColor: Color,
            textColor: Color,
            drawableId: Int = 0
        ) =
            Badge(
                modifier = modifier,
                shape = RectangleShape,
                backgroundColor = backgroundColor,
                badgeText = text,
                textStyle = GlowpickTheme.typography.caption2.bold().copy(textColor),
                textModifier = Modifier.padding(
                    horizontal = if (drawableId != 0) {
                        4.dp
                    } else {
                        6.dp
                    }, vertical = 2.dp
                ), drawableId = drawableId
            )
    }
}


