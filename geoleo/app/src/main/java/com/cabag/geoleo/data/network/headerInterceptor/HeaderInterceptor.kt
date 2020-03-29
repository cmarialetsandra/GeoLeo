package com.cabag.geoleo.data.network.headerInterceptor

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class HeaderInterceptor: Interceptor {
    companion object{
        //OJO
        const val ENDPOINT_OBTENER_INFOMUSEOS = "/obtenerInfoMuseos"
    }
    private lateinit var requestBuilder: Request.Builder

    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        requestBuilder = request.newBuilder()
        when(request.url().url().path){
            ENDPOINT_OBTENER_INFOMUSEOS -> {
                requestBuilder
                    .addHeader("Content-Type","application/json")
            }
            else -> {
                requestBuilder
                    .addHeader("Content-Type","application/json")
            }
        }

        request = requestBuilder.build()
        return chain.proceed(request)
    }
}