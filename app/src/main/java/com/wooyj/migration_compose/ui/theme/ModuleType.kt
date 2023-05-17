package com.wooyj.migration_compose.ui.theme


object ModuleType {

    //Ranking Module
    val rankingModule = listOf(
        "module_collection",
        "module_collection_category",
        "module_new_product_category",
        "module_category",
        "module_recommend_product_category",
        "module_monthly_product",
        "module_new_product"
    )

    //Cast Module
    val castModule = listOf(
        "module_new_cast",
        "module_recommend_cast"
    )

    //DA Module
    const val lineBanner = "module_line_banner"

    //Event Module
    const val event = "module_event"

    //QnA Module
    const val recommendQnaCategory = "module_recommend_qna_category"

    //Review Module
    const val recommendReviewCategory = "module_recommend_review_category"

    //Brand Module
    const val recommendBrand = "module_recommend_brand"

    //Award Module
    const val newAward = "module_new_award"

    //Award Winner Module
    const val newAwardProductCategory = "module_new_award_product_category"

}
