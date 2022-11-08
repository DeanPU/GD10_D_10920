package com.example.gd10_d_10920

import com.google.gson.annotations.SerializedName

//ini seperti nampilan kayak json di postman itu yg paling bawah
data class ResponseDataMahasiswa(
    @SerializedName("status") val stt:String,
    val totaldata: Int,
    val data:List<MahasiswaData>
)
