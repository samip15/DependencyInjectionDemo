package com.sam.dependencyinjectionkt.db

import androidx.lifecycle.LiveData
import com.sam.dependencyinjectionkt.model.Quote

interface QuoteDao {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}