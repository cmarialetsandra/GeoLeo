package com.cabag.geoleo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import com.cabag.geoleo.ui.viewModels.MuseoViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


import com.cabag.geoleo.R
import kotlinx.android.synthetic.main.fragment_inicio.*

class InicioFragment : Fragment() {

    private val museoViewModel: MuseoViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_inicio, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        prueba.setOnClickListener {

            museoViewModel.uiState.observe(viewLifecycleOwner, Observer {
                val dataState = it ?: return@Observer
                if (!dataState.showProgress){ }
                if (dataState.prod != null && !dataState.prod.consumed){
                    dataState.prod.consume()?.let { prods ->
                        //adapter.submitList(prods)
                        println(prods)
                        println("LA DATA HA SIDO RECIBIDA")
                    }
                }
                if (dataState.error != null && !dataState.error.consumed){
                    dataState.error.consume()?.let {error ->
                        Toast.makeText(activity!!.applicationContext, resources.getString(error), Toast.LENGTH_LONG).show()
                        println("HUBO UN ERROR DE CONEXION")
                    }
                }
            })

            museoViewModel.retrieveInfoMuseo()

        }
    }

}
