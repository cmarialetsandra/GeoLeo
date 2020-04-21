package com.cabag.geoleo.CardView

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.cabag.geoleo.Fragments.Museo_imabite
import com.cabag.geoleo.Interfaces.IRecyclerClick
import com.cabag.geoleo.R

class RecyclerViewAdapter (val userList: ArrayList<UserDataModel>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){

    lateinit var context: Context
    lateinit var fragmentManager: FragmentManager
    lateinit var fragmentTransaction : FragmentTransaction
    lateinit var fragmentShareFragment : Fragment
    var museoImabite = Museo_imabite()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        context = parent.context
        return ViewHolder(view)
    }

    fun sharedFragmentCALL(fragmentManager: FragmentManager){
        this.fragmentShareFragment = fragmentManager.findFragmentById(R.id.fragmentF)!!
        this.fragmentManager = fragmentManager
        this.fragmentTransaction = this.fragmentManager.beginTransaction()
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var user:UserDataModel = userList[position]
        holder.title.text  = user.title
        holder.iv.setImageResource(userList[position].imagen)

        /*Se manda a llamar al elemento al que se le dio click*/
        /*Puedo mandar a llamar a otra fragment*/

        holder.setClick(object:IRecyclerClick{
            override fun onClick(view: View, position: Int) {
                val bundle = Bundle()
                val positionSend = position+1
                bundle.putString("position", positionSend.toString())
                museoImabite.arguments = bundle
                museoImabite.sendFragmentCall(fragmentShareFragment)
                fragmentTransaction.replace(R.id.fragmentF,museoImabite).addToBackStack("tagMuseoDetail")
                fragmentTransaction.commit()
                // Toast.makeText(context,"Fila: #$position", Toast.LENGTH_SHORT).show()
            }
        })
    }

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item), View.OnClickListener{
        override fun onClick(p0: View?) {
            iRecyclerClick.onClick(p0!!, adapterPosition )
        }

        var title:TextView = item.findViewById(R.id.titulo)
        var  iv = itemView.findViewById(R.id.imagen) as ImageView
        lateinit var iRecyclerClick: IRecyclerClick

        /*Aquí se mandan a llamar la interfaz del onclick*/
        fun setClick(iRecyclerClick: IRecyclerClick){
            this.iRecyclerClick = iRecyclerClick
        }

        init {
            itemView.setOnClickListener(this)
        }
    }

}