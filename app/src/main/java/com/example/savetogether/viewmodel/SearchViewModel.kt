package com.example.savetogether.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.savetogether.components.searchcomponents.SearchDoctorItem
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update

class SearchViewModel : ViewModel() {

  private val _searchDoctors = MutableStateFlow("")
    val searchDoctors = _searchDoctors.asStateFlow()

   private val _isSearching = MutableStateFlow(false)
    val isSearching = _isSearching.asStateFlow()

    private val searchItems = MutableStateFlow(SearchDoctorItem)


    val searchResult = searchDoctors
        .debounce(300)
        .onEach { _isSearching.value = true }
        .flatMapLatest { query ->
            if (query.isBlank()){
                searchItems
            }else{
                searchItems.map { items->
                    items.filter { it.doesMatchSearchQuery(query) }
                }
            }
        }
        .onEach { _isSearching.value = false }
        .stateIn(viewModelScope, SharingStarted.Lazily, listOf()

        )
    fun onSearchDoctorChange(querydoctors : String){
        _searchDoctors.value = querydoctors

    }

}

//        .combine(_search){
//            text, searchdoctors ->
//            if (text.isBlank()){
//                searchdoctors
//            }else{
//                delay(2000L)
//                searchdoctors.filter {
//                    it.doesMatchSearchQuery(text)
//                }
//            }
//        }