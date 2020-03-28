package com.cabag.geoleo.ui.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cabag.geoleo.Modelo.VistaMuseo
import com.cabag.geoleo.R
import com.cabag.geoleo.repository.MuseoRepository
import com.cabag.geoleo.ui.Event
import kotlinx.coroutines.launch

class MuseoViewModel(private val museoRepository: MuseoRepository): ViewModel(){
    private val _uiState =
        MutableLiveData<MuseoDataState>()
    val uiState: LiveData<MuseoDataState>
        get() = _uiState

    fun retrieveInfoMuseo(){
        viewModelScope.launch{
            runCatching{
                //Se inicia la peticion
                emitUiState(showProgress = true)
                museoRepository.obtainInfoMuseos()
            }.onSuccess{
                //SE OBTUVO EL JSON CON EXITO
                println("IT $it")
                println(emitUiState())
                emitUiState(prod = Event(it))
            }.onFailure{
                println("Fallo en: $it")
                emitUiState(error = Event(R.string.internet_failure_error))
            }
        }
    }

    private fun emitUiState(showProgress: Boolean = false, prod: Event<List<VistaMuseo>>? = null, error: Event<Int>? = null){
        val dataState = MuseoDataState(showProgress, prod, error)
        _uiState.value = dataState
    }

    data class MuseoDataState(val showProgress: Boolean, val prod: Event<List<VistaMuseo>>?, val error: Event<Int>?)
}