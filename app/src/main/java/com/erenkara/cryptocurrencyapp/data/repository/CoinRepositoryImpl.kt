package com.erenkara.cryptocurrencyapp.data.repository

import com.erenkara.cryptocurrencyapp.data.remote.CoinPaprikaAPI
import com.erenkara.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.erenkara.cryptocurrencyapp.data.remote.dto.CoinDto
import com.erenkara.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaAPI
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}