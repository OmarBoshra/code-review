package com.snappymob.coderead.android

data class Book(
    var book_id: Int?,
    var title: String?,
    var bookCoverUrl: String?,
    var isFavorited: Boolean = false
)
