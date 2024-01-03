package com.rjornelas.crypto_monitor.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rjornelas.crypto_monitor.service.CryptoService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CryptoViewModelFactory: ViewModelProvider.Factory {

    private fun createService(): CryptoService {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.mercadobitcoin.net/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(
            CryptoService::class.java
        )
    }
    override fun <T	: ViewModel> create(modelClass:	Class<T>): T {
        return CryptoViewModel(service = createService()) as T
    }
}