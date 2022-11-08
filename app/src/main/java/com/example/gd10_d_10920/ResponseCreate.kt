package com.example.gd10_d_10920

import com.google.gson.annotations.SerializedName

//ini seperti nampilan kayak json di postman itu yg paling bawah
class ResponseCreate (
    @SerializedName("status") val stt:Int,
    @SerializedName("error") val e:Boolean,
    @SerializedName("message") val pesan:String,
)