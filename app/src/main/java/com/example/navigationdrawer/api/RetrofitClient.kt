package com.example.navigationdrawer.api

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    companion object {
        private lateinit var retrofit: Retrofit
        fun getClient(baseUrl: String): Retrofit {
            retrofit = Retrofit.Builder().baseUrl(baseUrl).client(OkHttpClient.Builder().build())
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create())).build()
            return retrofit
        }
    }

}
