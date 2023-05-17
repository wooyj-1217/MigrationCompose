package com.wooyj.migration_compose.data.repository.fake

import api_j.ApiJ
import com.wooyj.migration_compose.core.AppDispatchers
import com.wooyj.migration_compose.core.Dispatcher
import com.wooyj.migration_compose.data.model.ProtoRes
import com.wooyj.migration_compose.data.repository.HomeRepository
import com.wooyj.migration_compose.data.util.getDecodeData
import com.wooyj.migration_compose.network.fake.FakeDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import javax.inject.Inject

class FakeHomeRepository @Inject constructor(
    @Dispatcher(AppDispatchers.IO) private val ioDispatcher: CoroutineDispatcher,
    private val networkJson: Json,
) : HomeRepository {
    override fun getMainListData(): Flow<ApiJ.HomeMainModuleListRes> = flow {
        emit(
            networkJson.decodeFromString<ProtoRes>(FakeDataSource.mainListData).data?.getDecodeData().let {
                ApiJ.HomeMainModuleListRes.parseFrom(it)
            }
        )
    }.flowOn(ioDispatcher)
}