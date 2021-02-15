package com.sam.dependencyinjectionkt
import android.app.Application
import com.sam.dependencyinjectionkt.db.Database
import com.sam.dependencyinjectionkt.db.DatabaseFakeImpl
import com.sam.dependencyinjectionkt.db.QuoteDao
import com.sam.dependencyinjectionkt.db.QuoteDaoFakeImpl
import com.sam.dependencyinjectionkt.repository.QuoteRepository
import com.sam.dependencyinjectionkt.repository.QuoteRepositoryImpl
import com.sam.dependencyinjectionkt.ui.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton
class QuotesApplication : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        bind<Database>() with singleton { DatabaseFakeImpl() }
        bind<QuoteDao>() with singleton { instance<Database>().quoteDao }
        bind<QuoteRepository>() with singleton { QuoteRepositoryImpl(instance())}
        bind() from  provider { QuotesViewModelFactory(instance()) }
    }
}