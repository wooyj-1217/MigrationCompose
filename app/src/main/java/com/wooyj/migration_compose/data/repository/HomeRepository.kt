package com.wooyj.migration_compose.data.repository

import api_j.ApiJ
import kotlinx.coroutines.flow.Flow

interface HomeRepository {

    fun getMainListData(): Flow<ApiJ.HomeMainModuleListRes>

}