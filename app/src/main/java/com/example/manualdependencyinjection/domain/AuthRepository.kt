package com.example.manualdependencyinjection.domain

interface AuthRepository {
    suspend fun login(email: String, password: String)
}