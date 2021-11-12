package com.erenkara.cryptocurrencyapp.domain.repository

import com.erenkara.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.erenkara.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}