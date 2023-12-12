package com.example.manualdependencyinjection.data

import com.example.manualdependencyinjection.domain.AuthRepository

class AuthRepositoryImpl(
    private val api: AuthApi
) : AuthRepository {
    override suspend fun login(email: String, password: String) {
        try {
            println("Logging in...")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}