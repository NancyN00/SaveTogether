package com.example.savetogether.components.searchcomponents

data class SearchDoctor(
   // val searchimg : Int,
    val searchdoctorName : String,
    val searchhospitalName: String,
    val searchrate : String
        ) {

//if user searches a name without a space, it should be included in the search result
//also when initials are searched.

//ignore case, it doesn't matter if user writes in lowercase or not

    fun doesMatchSearchQuery(query: String): Boolean  {
        val searchWords = searchdoctorName.split(" ")
        val lowerCaseQuery = query.lowercase()

        return searchWords.any { word ->
            word.lowercase().contains(lowerCaseQuery, ignoreCase = true)
        } || searchdoctorName.lowercase().contains(lowerCaseQuery, ignoreCase = true)
    }
}
