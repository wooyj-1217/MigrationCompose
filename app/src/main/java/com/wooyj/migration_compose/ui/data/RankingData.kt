package com.wooyj.migration_compose.ui.data

data class RankingData(
    val productList: List<ProductData>,
    val category: CategoryData? = null,
)


val testRankingData = RankingData(
    category = CategoryData(
        level = 2L,
        id = 7L,
        text = "리퀴드파운데이션",
        shortWording = "숏워딩"
    ),
    productList = listOf(
        ProductData(
            productRank = 1,
            idProduct = 18487,
            imageUrl = "https://dn5hzapyfrpio.cloudfront.net/home/glowmee/upload/20150619/1434707861234.jpg",
            brandTitle = "SNP",
            productTitle = "온-오프 수분진정팩",
            ratingAvg = 4.59F,
            reviewCount = 131L
        ),
        ProductData(
            productRank = 2,
            idProduct = 18487,
            imageUrl = "https://dn5hzapyfrpio.cloudfront.net/home/glowmee/upload/20150619/1434707861234.jpg",
            brandTitle = "SNP",
            productTitle = "온-오프 수분진정팩",
            ratingAvg = 4.59F,
            reviewCount = 131L
        ),
        ProductData(
            productRank = 3,
            idProduct = 18487,
            imageUrl = "https://dn5hzapyfrpio.cloudfront.net/home/glowmee/upload/20150619/1434707861234.jpg",
            brandTitle = "SNP",
            productTitle = "온-오프 수분진정팩",
            ratingAvg = 4.59F,
            reviewCount = 131L
        ),
        ProductData(
            productRank = 4,
            idProduct = 18487,
            imageUrl = "https://dn5hzapyfrpio.cloudfront.net/home/glowmee/upload/20150619/1434707861234.jpg",
            brandTitle = "SNP",
            productTitle = "온-오프 수분진정팩",
            ratingAvg = 4.59F,
            reviewCount = 131L
        ),
        ProductData(
            productRank = 5,
            idProduct = 18487,
            imageUrl = "https://dn5hzapyfrpio.cloudfront.net/home/glowmee/upload/20150619/1434707861234.jpg",
            brandTitle = "SNP",
            productTitle = "온-오프 수분진정팩",
            ratingAvg = 4.59F,
            reviewCount = 131L
        ),
        ProductData(
            productRank = 6,
            idProduct = 18487,
            imageUrl = "https://dn5hzapyfrpio.cloudfront.net/home/glowmee/upload/20150619/1434707861234.jpg",
            brandTitle = "SNP",
            productTitle = "온-오프 수분진정팩",
            ratingAvg = 4.59F,
            reviewCount = 131L
        ),
        ProductData(
            productRank = 7,
            idProduct = 18487,
            imageUrl = "https://dn5hzapyfrpio.cloudfront.net/home/glowmee/upload/20150619/1434707861234.jpg",
            brandTitle = "SNP",
            productTitle = "온-오프 수분진정팩",
            ratingAvg = 4.59F,
            reviewCount = 131L
        ),
        ProductData(
            productRank = 8,
            idProduct = 18487,
            imageUrl = "https://dn5hzapyfrpio.cloudfront.net/home/glowmee/upload/20150619/1434707861234.jpg",
            brandTitle = "SNP",
            productTitle = "온-오프 수분진정팩",
            ratingAvg = 4.59F,
            reviewCount = 131L
        ),
        ProductData(
            productRank = 9,
            idProduct = 18487,
            imageUrl = "https://dn5hzapyfrpio.cloudfront.net/home/glowmee/upload/20150619/1434707861234.jpg",
            brandTitle = "SNP",
            productTitle = "온-오프 수분진정팩",
            ratingAvg = 4.59F,
            reviewCount = 131L
        ),
        ProductData(
            productRank = 10,
            idProduct = 18487,
            imageUrl = "https://dn5hzapyfrpio.cloudfront.net/home/glowmee/upload/20150619/1434707861234.jpg",
            brandTitle = "SNP",
            productTitle = "온-오프 수분진정팩",
            ratingAvg = 4.59F,
            reviewCount = 131L
        )
    )
)
