package com.rjornelas.crypto_monitor.service

import retrofit2.http.GET
import retrofit2.http.Path

interface CryptoService {

    @GET("api/{coin}/ticker")
    suspend fun	fetchCoinTicker(@Path("coin") coin: String = "BTC"): TickerResponse
}