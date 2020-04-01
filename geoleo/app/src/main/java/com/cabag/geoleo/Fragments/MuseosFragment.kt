package com.cabag.geoleo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cabag.geoleo.CardView.recyclerViewAdapter
import com.cabag.geoleo.CardView.userDataModel


import com.cabag.geoleo.R

class MuseosFragment : Fragment() {

    lateinit var recyclerView: RecyclerView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recyclerViewMenu)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_museos, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        recyclerView.layoutManager = LinearLayoutManager(this.activity, LinearLayoutManager.VERTICAL, false)

        var user = ArrayList<userDataModel>()

        user.add(userDataModel("Museo de Arte Indígena Imabite"))
        user.add(userDataModel("Museo de arte Sacro"))
        user.add(userDataModel("Museo Adiact"))
        user.add(userDataModel("Museo Archivo Rubén Darío"))
        user.add(userDataModel("Museo Entomológico de León"))
        user.add(userDataModel("Museo de Leyendas y Tradiciones"))
        user.add(userDataModel("Museo Genízaro y Cmdt. Silvio M."))
        user.add(userDataModel("Museo Histórico Héroes y Mártires"))
        user.add(userDataModel("Centro de Arte Fundación Ortíz G."))

        var adapter = recyclerViewAdapter(user)
        recyclerView.adapter = adapter

    }
}
