package com.example.dacs3.model

import java.time.LocalDate
import java.time.Year
import java.util.*

data class RequestBook(
    val title: String, val thumbnail: String, val author: String, val requestDay: LocalDate,
    val publishYear: Year,
    val category: String,
    val status: String)
