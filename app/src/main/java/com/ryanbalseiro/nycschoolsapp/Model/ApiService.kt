package com.ryanbalseiro.nycschoolsapp.Model

import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.converter.gson.GsonConverterFactory

private val retrofit = Retrofit.Builder().baseUrl("https://data.cityofnewyork.us/resource/")
    .addConverterFactory(GsonConverterFactory.create()).build()

val schoolAPIService = retrofit.create(ApiService::class.java)

interface ApiService{
    @GET("s3k6-pzi2.json")
    suspend fun getSchoolData():SchoolData

    @GET("f9bf-2cp4.json")
    suspend fun getSATData():SATData
}

