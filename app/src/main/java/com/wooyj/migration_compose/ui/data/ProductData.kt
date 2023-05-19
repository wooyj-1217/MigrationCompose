package com.wooyj.migration_compose.ui.data

/**
 *
 * product UI 및 navigation 하기위해 필요한 data만 정리하기 위한 data class
 *
 * @author wooyj
 *
 */
data class ProductData(
    val idProduct: Int,
    val imageUrl: String,
    val brandTitle: String,
    val productTitle: String,
    val ratingAvg: Float? = 0f,
    val reviewCount: Long? = 0L,
    val volume: String? = "",
    val price: Int? = 0,
    val productRank: Long? = 0,
    val hasEventAdInfo: Boolean = false,
)

val testProductData = ProductData(
    18487,
    "https://dn5hzapyfrpio.cloudfront.net/home/glowmee/upload/20150619/1434707861234.jpg",
    "SNP",
    "온-오프 수분진정팩",
)


fun List<common.Common.Product>.toListProductData(): List<ProductData> {
    val result: MutableList<ProductData> = mutableListOf()
    this.forEach {
        result.add(
            ProductData(
                idProduct = it.idProduct,
                imageUrl = it.imageUrl,
                brandTitle = it.brand.brandTitle,
                productTitle = it.productTitle,
                productRank = it.productRank.getValue(),
                ratingAvg = it.ratingAvg,
                reviewCount = it.reviewCount.getValue(),
                volume = it.volume,
                price = it.price,
                hasEventAdInfo = it.hasEventAdInfo(),
            )
        )
    }
    return result
}