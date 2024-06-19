package com.example.savetogether.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.savetogether.components.searchcomponents.SearchDoctorItem
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update

class SearchViewModel : ViewModel() {

  private val _searchDoctors = MutableStateFlow("")
    val searchDoctors = _searchDoctors.asStateFlow()

   private val _isSearching = MutableStateFlow(false)
    val isSearching = _isSearching.asStateFlow()

    private val _search = MutableStateFlow(SearchDoctorItem)


    val searchs = searchDoctors
        .debounce(1000L)
        .onEach { _isSearching.update { true } }
        .combine(_search){
            text, searchdoctors ->
            if (text.isBlank()){
                searchdoctors
            }else{
                delay(2000L)
                searchdoctors.filter {
                    it.doesMatchSearchQuery(text)
                }
            }
        }
        .onEach { _isSearching.update { false } }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            _search.value

        )
    fun onSearchDoctorChange(doctors : String){
        _searchDoctors.value = doctors

    }

}