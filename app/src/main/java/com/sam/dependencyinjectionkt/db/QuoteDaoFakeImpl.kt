package com.sam.dependencyinjectionkt.db

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sam.dependencyinjectionkt.model.Quote

class QuoteDaoFakeImpl : QuoteDao {
    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()
    init {
        quotes.value = quoteList
    }
    override fun addQuote(quote: Quote){
        quoteList.add(quote)
        quotes.value = quoteList
    }

    override fun getQuotes(): LiveData<List<Quote>>  = quotes as LiveData<List<Quote>>
}