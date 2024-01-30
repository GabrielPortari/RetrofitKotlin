package com.example.retrofitkotlin

import com.google.gson.annotations.SerializedName

class PostEntity {

    @SerializedName("userId")
    var userID: Int = 0

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("title")
    var title: String = ""

    @SerializedName("body")
    var body: String = ""
}