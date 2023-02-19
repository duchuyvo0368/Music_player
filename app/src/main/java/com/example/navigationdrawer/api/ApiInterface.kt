package com.example.navigationdrawer.api

import com.example.navigationdrawer.model.Data
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("xhr/chart-realtime?songId=0&videoId=0&albumId=0&chart=song&time=-1")
    fun getSong(): Call<Data>
}
