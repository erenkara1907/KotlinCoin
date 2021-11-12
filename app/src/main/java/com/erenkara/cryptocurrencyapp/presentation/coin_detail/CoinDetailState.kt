package com.erenkara.cryptocurrencyapp.presentation.coin_detail

import com.erenkara.cryptocurrencyapp.domain.model.Coin
import com.erenkara.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
