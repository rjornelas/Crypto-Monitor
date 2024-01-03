package com.rjornelas.crypto_monitor.state

import com.rjornelas.crypto_monitor.service.Ticker

sealed class ScreenState	{
    data object Loading: ScreenState()
    data class Success(val data: Ticker): ScreenState()
    data class Error(val exception:	Throwable): ScreenState()
}
