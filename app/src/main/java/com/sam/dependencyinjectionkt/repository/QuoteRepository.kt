package com.sam.dependencyinjectionkt.repository

import androidx.lifecycle.LiveData
import com.sam.dependencyinjectionkt.model.Quote

interface QuoteRepository {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}