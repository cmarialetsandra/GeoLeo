package com.cabag.geoleo.CardView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cabag.geoleo.R

class recyclerViewAdapter (val userList: ArrayList<userDataModel>) :
    RecyclerView.Adapter<recyclerViewAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var user:userDataModel = userList[position]
        holder.title.text  = user.title

        /*Se manda a llamar al elemento al que se le dio click*/
        /*Puedo mandar a llamar a otra fragment*/
    }

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item){
        var title:TextView = item.findViewById(R.id.titulo)

        /*Aquí se mandan a llamar la interfaz del onclick*/
    }


}
