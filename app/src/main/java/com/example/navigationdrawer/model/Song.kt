package com.example.navigationdrawer.model

data class Song(
    val ads: Boolean,
    val code: String,
    val content_owner: Int,
    val id: String,
    val ip: String,
    val isWorldWide: Boolean,
    val is_vip: Boolean,
    val isoffical: Boolean,
    val name: String,
    val playlist_id: String,
    val title: String,
    val artists_names:String,
    val thumbnail:String
)