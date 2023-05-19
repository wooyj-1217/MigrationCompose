package com.wooyj.migration_compose.ui.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.wooyj.migration_compose.ui.data.RankingData
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
import com.wooyj.migration_compose.ui.data.toListProductData
import com.wooyj.migration_compose.ui.data.toCategoryData
import api_j.ApiJ
import common.Common


@Composable
fun HomeScreen() {
    val viewModel: HomeViewModel = viewModel()
    val mainList: api_j.ApiJ.HomeMainModuleListRes? by viewModel.mainList.collectAsState()


    Column(modifier = Modifier.fillMaxSize()) {
        if (mainList != null) {
            LazyColumn(verticalArrangement = Arrangement.spacedBy(48.dp)) {
                items(mainList!!.getModuleListList().size) {index->
                    val module = mainList!!.getModuleList(index)
                    when (module.type) {
                        in ModuleType.rankingModule -> {
                            val data = buildRankingData(module)
                            RankingModule(data)
                        }

                        in ModuleType.castModule -> {
                            val pouch = module.moduleNewCast.pouch
                            val productList =
                                (pouch.getProductListList() as List<common.Common.Product>).toListProductData()
                            CastModule(
                                pouch.idPouch,
                                pouch.mainImage,
                                pouch.pouchTitle,
                                pouch.description,
                                pouch.isNew.getValue(),
                                productList,
                            )
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
                            val banner = module.moduleLineBanner.lineBanner
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


fun buildRankingData(module: api_j.ApiJ.HomeMainModuleListRes.Module) :RankingData=
    when (module.type) {
        "module_collection" -> {
            RankingData(
                productList = (module.moduleCollection.getProductListList() as List<common.Common.Product>).toListProductData(),
            )
        }
        "module_collection_category" -> {
            RankingData(
                productList = (module.moduleCollectionCategory.getProductListList() as List<common.Common.Product>).toListProductData(),
                category = (module.moduleCollectionCategory.getCategory() as common.Common.CurrentCategory).toCategoryData()
            )
        }
        "module_category" -> {
            RankingData(
                productList = (module.moduleCategory.getProductListList() as List<common.Common.Product>).toListProductData(),
                category = (module.moduleCategory.getCategory() as common.Common.CurrentCategory).toCategoryData()
            )
        }
        "module_recommend_product_category" -> {
            RankingData(
                productList = (module.moduleRecommendProductCategory.getProductListList() as List<common.Common.Product>).toListProductData(),
                category = (module.moduleRecommendProductCategory.getCategory() as common.Common.CurrentCategory).toCategoryData()

            )
        }
        "module_monthly_product" -> {
            RankingData(
                productList = (module.moduleMonthlyProduct.getProductListList() as List<common.Common.Product>).toListProductData()
            )
        }
        "module_new_product" -> {
            RankingData(
                productList = (module.moduleNewProduct.getProductListList() as List<common.Common.Product>).toListProductData()
            )
        }
        else -> {
            //module_new_product_category
            RankingData(
                productList = (module.moduleNewProductCategory.getProductListList() as List<common.Common.Product>).toListProductData(),
                category = (module.moduleCollectionCategory.getCategory() as common.Common.CurrentCategory).toCategoryData()
            )
        }
    }


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    GlowpickTheme {
        HomeScreen()
    }
}