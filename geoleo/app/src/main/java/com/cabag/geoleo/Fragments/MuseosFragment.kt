package com.cabag.geoleo.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cabag.geoleo.CardView.RecyclerViewAdapter
import com.cabag.geoleo.CardView.UserDataModel

import com.cabag.geoleo.R

class MuseosFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var recyclerViewAdapter: RecyclerViewAdapter

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

        var user = ArrayList<UserDataModel>()

        user.add(UserDataModel("Museo de Arte Indígena Imabite", R.drawable.museoimabite))
        user.add(UserDataModel("Museo de arte Sacro", R.drawable.museoartesacro))
        user.add(UserDataModel("Museo Adiact", R.drawable.museoadiact))
        user.add(UserDataModel("Museo Archivo Rubén Darío",R.drawable.museorubendario))
        user.add(UserDataModel("Museo Entomológico de León",R.drawable.museoentomologico))
        user.add(UserDataModel("Museo de Leyendas y Tradiciones",R.drawable.museoleyendasytradiciones))
        user.add(UserDataModel("Museo Genízaro y Cmdt. Silvio M.",R.drawable.museogenizaro))
        user.add(UserDataModel("Museo Histórico Héroes y Mártires",R.drawable.museohistoricohym))
        user.add(UserDataModel("Centro de Arte Fundación Ortíz G.",R.drawable.centroarte))
        user.add(UserDataModel("Sitio histórico Ruinas León Viejo", R.drawable.sitiohistorico))

        recyclerViewAdapter = RecyclerViewAdapter(user)

        recyclerViewAdapter.sharedFragmentCALL(fragmentManager!!)
        recyclerView.adapter = recyclerViewAdapter
    }

}
