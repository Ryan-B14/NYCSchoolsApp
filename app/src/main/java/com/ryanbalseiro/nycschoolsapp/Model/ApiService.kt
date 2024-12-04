package com.ryanbalseiro.nycschoolsapp.Model

import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

val okHttpClient = OkHttpClient.Builder()
    .connectTimeout(15, TimeUnit.SECONDS) // Connect timeout
    .readTimeout(30, TimeUnit.SECONDS)    // Read timeout
    .writeTimeout(30, TimeUnit.SECONDS)   // Write timeout
    .build()

private val retrofit = Retrofit.Builder()
    .baseUrl("https://data.cityofnewyork.us/resource/")
    .client(okHttpClient) // Use the custom OkHttpClient
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val schoolAPIService = retrofit.create(ApiService::class.java)

interface ApiService{
    @GET("s3k6-pzi2.json")
    suspend fun getSchoolData():SchoolData

    @GET("f9bf-2cp4.json")
    suspend fun getSATData():SATData
}

