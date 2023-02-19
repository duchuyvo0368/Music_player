package com.example.navigationdrawer.api

import android.app.Service
import retrofit2.Retrofit
import retrofit2.create

class ApiUtils {
    companion object{
        private var BASE_URL:String ="https://mp3.zing.vn/"
        fun getDataService(): ApiInterface {
            return RetrofitClient.getClient(BASE_URL).create(ApiInterface::class.java)
        }
    }
}