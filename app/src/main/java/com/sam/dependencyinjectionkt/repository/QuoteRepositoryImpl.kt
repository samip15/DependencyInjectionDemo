package com.sam.dependencyinjectionkt.repository

import androidx.lifecycle.LiveData
import com.sam.dependencyinjectionkt.db.QuoteDao
import com.sam.dependencyinjectionkt.model.Quote

class QuoteRepositoryImpl(private val quoteDao: QuoteDao) : QuoteRepository
{
    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuotes(): LiveData<List<Quote>>  = quoteDao.getQuotes()
}