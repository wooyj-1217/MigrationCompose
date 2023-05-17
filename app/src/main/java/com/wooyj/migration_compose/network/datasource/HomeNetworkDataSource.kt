package com.wooyj.migration_compose.network.datasource


interface HomeNetworkDataSource {

    suspend fun getMainListData() : api_j.ApiJ.HomeMainModuleListRes

}