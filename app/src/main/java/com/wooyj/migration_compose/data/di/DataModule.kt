package com.wooyj.migration_compose.data.di

import com.wooyj.migration_compose.data.repository.HomeRepository
import com.wooyj.migration_compose.data.repository.fake.FakeHomeRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json


//테스트 용이라 Fake Repository 붙임
@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Binds
    fun bindsHomeRepository(
        fakeHomeRepository: FakeHomeRepository
    ): HomeRepository


}