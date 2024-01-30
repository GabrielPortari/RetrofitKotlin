package com.example.retrofitkotlin

import retrofit2.Call
import retrofit2.http.GET


interface PostService {
    //https://jsonplaceholder.typicode.com/ *** URL BASE

    @GET("posts")
    fun list(): Call<List<PostEntity>>

}