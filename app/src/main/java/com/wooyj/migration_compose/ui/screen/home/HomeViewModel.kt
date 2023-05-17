package com.wooyj.migration_compose.ui.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import api_j.ApiJ
import com.wooyj.migration_compose.data.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val homeRepository: HomeRepository
) : ViewModel() {

    private val _mainList = MutableStateFlow<ApiJ.HomeMainModuleListRes?>(null)
    val mainList: StateFlow<ApiJ.HomeMainModuleListRes?> get() = _mainList

    init{
        getMainList()
    }

    private fun getMainList() {
        viewModelScope.launch {
            homeRepository.getMainListData().collect {
                _mainList.value = it
            }
        }
    }

}