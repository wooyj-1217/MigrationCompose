package com.wooyj.migration_compose.ui.screen.home

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.wooyj.migration_compose.ui.feature.module.AwardModule
import com.wooyj.migration_compose.ui.feature.module.AwardWinnerModule
import com.wooyj.migration_compose.ui.feature.module.BrandRankingModule
import com.wooyj.migration_compose.ui.feature.module.CastModule
import com.wooyj.migration_compose.ui.feature.module.DAModule
import com.wooyj.migration_compose.ui.feature.module.EventModule
import com.wooyj.migration_compose.ui.feature.module.QnAModule
import com.wooyj.migration_compose.ui.feature.module.RankingModule
import com.wooyj.migration_compose.ui.feature.module.ReviewModule
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import com.wooyj.migration_compose.ui.theme.ModuleType


@Composable
fun HomeScreen() {
    val viewModel: HomeViewModel = viewModel()
    val mainList: api_j.ApiJ.HomeMainModuleListRes? by viewModel.mainList.collectAsState()

    Column(modifier = Modifier.fillMaxSize()) {
        if (mainList != null) {
            LazyColumn(verticalArrangement = Arrangement.spacedBy(56.dp)) {
                items(mainList!!.moduleListList) {
                    when (it.type) {
                        in ModuleType.rankingModule -> {
                            RankingModule()
                        }

                        in ModuleType.castModule -> {
                            val pouch = it.moduleNewCast.pouch
                            CastModule(pouch)
                        }

                        ModuleType.event -> {
                            EventModule()
                        }

                        ModuleType.newAward -> {
                            AwardModule()
                        }

                        ModuleType.newAwardProductCategory -> {
                            AwardWinnerModule()
                        }

                        ModuleType.lineBanner -> {
                            val banner = it.moduleLineBanner.lineBanner
                            DAModule(
                                banner
                            )
                        }

                        ModuleType.recommendBrand -> {
                            BrandRankingModule()
                        }

                        ModuleType.recommendQnaCategory -> {
                            QnAModule()
                        }

                        ModuleType.recommendReviewCategory -> {
                            ReviewModule()
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    GlowpickTheme {
        HomeScreen()
    }
}