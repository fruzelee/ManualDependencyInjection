package com.example.manualdependencyinjection.data

import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {
    @POST
    suspend fun login(
        @Body body: LoginRequest
    )
}

data class LoginRequest(
    val email: String,
    val password: String
)