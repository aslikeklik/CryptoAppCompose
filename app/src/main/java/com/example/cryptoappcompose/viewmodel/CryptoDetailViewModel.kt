package com.example.cryptoappcompose.viewmodel

import androidx.lifecycle.ViewModel
import com.example.cryptoappcompose.model.Crypto
import com.example.cryptoappcompose.repo.CryptoRepository
import com.example.cryptoappcompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel @Inject constructor(
    private val repository: CryptoRepository
): ViewModel() {
    suspend fun getCrypto() : Resource<Crypto>{
        return repository.getCrypto()
    }
}