package com.cabag.geoleo.repository

import com.cabag.geoleo.Modelo.VistaMuseo
import com.cabag.geoleo.data.network.`interfaces`.MuseoInterface

interface MuseoRepository{
    suspend fun obtainInfoMuseos(): List<VistaMuseo>
}
class MuseoRepositoryImpl(private val museoServices: MuseoInterface):
    MuseoRepository{
    override suspend fun obtainInfoMuseos(): List<VistaMuseo>{
        return museoServices.retrieveInfoMuseos()
    }
}