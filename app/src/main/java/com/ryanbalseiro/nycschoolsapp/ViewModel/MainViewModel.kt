package com.ryanbalseiro.nycschoolsapp.ViewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ryanbalseiro.nycschoolsapp.Model.SATDataItem
import com.ryanbalseiro.nycschoolsapp.Model.SchoolData
import com.ryanbalseiro.nycschoolsapp.Model.SchoolDataItem
import com.ryanbalseiro.nycschoolsapp.Model.schoolAPIService
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    //private variable that gets manipulated
    private val _schoolState = mutableStateOf(SchoolState())
    //public variable that exposes private variable's value
    val schoolState: State<SchoolState> = _schoolState

    //private variable that gets manipulated
    private val _satState = mutableStateOf(SatState())
    //public variable that exposes private variable's value
    val satState: State<SatState> = _satState

    //runs on initialization, i.e. when this viewmodel is created
    init {
        fetchSchools()
        fetchSATScores()
    }

    //gets schools list from api
    private fun fetchSchools() {
        //allows coroutine to be launched in the viewmodel scope
        viewModelScope.launch {
            try {
                val response = schoolAPIService.getSchoolData()
                _schoolState.value = _schoolState.value.copy(
                    list = response,
                    loading = false,
                    error = null
                )
            } catch (e: Exception) {
                _schoolState.value = _schoolState.value.copy(
                    loading = false,
                    error = "Error fetching Categories ${e.message}"
                )
            }
        }
    }

    //gets SAT scores list from api
    private fun fetchSATScores() {
        //allows coroutine to be launched in the viewmodel scope
        viewModelScope.launch {
            try {
                val response = schoolAPIService.getSATData()
                _satState.value = _satState.value.copy(
                    list = response,
                    loading = false,
                    error = null
                )
            } catch (e: Exception) {
                _satState.value = _satState.value.copy(
                    loading = false,
                    error = "Error fetching Categories ${e.message}"
                )
            }
        }
    }

    //data class that contains state info
    data class SchoolState(
        val loading: Boolean = true,
        val list: SchoolData = SchoolData(),
        val error: String? = null
    )
    //data class that contains state info
    data class SatState(
        val loading: Boolean = true,
        val list: List<SATDataItem> = emptyList(),
        val error: String? = null
    )
}