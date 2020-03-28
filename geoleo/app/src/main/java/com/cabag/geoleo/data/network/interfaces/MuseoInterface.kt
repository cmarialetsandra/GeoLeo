package com.cabag.geoleo.data.network.interfaces

import com.cabag.geoleo.Modelo.VistaMuseo
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface MuseoInterface {
    @GET("/obtenerInfoMuseos")
    suspend fun retrieveInfoMuseos(): List<VistaMuseo>

//    @POST
//    suspend fun requestPost(@Body miJsonBody: Model)
}