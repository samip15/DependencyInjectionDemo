package com.sam.dependencyinjectionkt.ui.quotes

import androidx.lifecycle.ViewModel
import com.sam.dependencyinjectionkt.model.Quote
import com.sam.dependencyinjectionkt.repository.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel()
{
    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
    fun getQuotes() = quoteRepository.getQuotes()
}