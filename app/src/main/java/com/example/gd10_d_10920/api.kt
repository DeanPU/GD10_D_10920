package com.example.gd10_d_10920

import retrofit2.Call
import retrofit2.http.*

//ini digunakan untuk menjebatani akses ke database
interface api {
    //{cari} itu sebagai parameter
    @GET("mahasiswa/{cari}")
    fun getData(@Path("cari") cari:String? = null): Call<ResponseDataMahasiswa>//untuk cari parameter di databasenya

    @FormUrlEncoded
    @POST("mahasiswa") //untuk create data isinya itu pastikan seperti parameter field itu harus sama dengan nama kolom di databasenya
    fun createData(
        @Field("mhsnobp") mhsnobp:String?,
        @Field("mhsnama") mhsnama:String?,
        @Field("mhsalamat") mhsalamat:String?,
        @Field("prodinama") prodinama:String?,
        @Field("mhstgllhr") mhstgllhr:String?,
    ):Call<ResponseCreate>

    @DELETE("mahasiswa/{mhsnobp}")
    fun deleteData(@Path("mhsnobp") mhsnobp: String?):Call<ResponseCreate>

    @FormUrlEncoded //ini memakai kayak seperti x-www-form... di postman
    @PUT("mahasiswa/{mhsnobp}") //panggil ini dulu baru update parameternya harus ada kalau gak ada gak bisa akses, parameternya didapatkan dari default nama aja bisa karena untuk gampang aja
    fun updateData(
        @Path("mhsnobp") mhsnobp:String?,
        @Field("mhsnama") mhsnama:String?,
        @Field("mhsalamat") mhsalamat:String?,
        @Field("prodinama") prodinama:String?,
        @Field("mhstgllhr") mhstgllhr:String?,
    ):Call<ResponseCreate>

}