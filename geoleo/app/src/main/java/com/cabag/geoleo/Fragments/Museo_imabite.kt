package com.cabag.geoleo.Fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import com.cabag.geoleo.R
import kotlinx.android.synthetic.main.fragment_museo_imabite.fig1
import kotlinx.android.synthetic.main.fragment_museo_imabite.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Museo_imabite : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null
    lateinit var fragment: Fragment
    private var foto = R.drawable.museoadiact



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_museo_imabite, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var position = ""
        var foto1 = R.drawable.museoimabite3
        var foto2 = R.drawable.museoartesacro2
        var foto3 = R.drawable.museoadiact
        var foto4 = R.drawable.museorubendario2
        var foto5 = R.drawable.museoentomologico2
        var foto6 = R.drawable.museoleyendasytradiciones2
        var foto7 = R.drawable.museogenizaro2
        var foto8 = R.drawable.museohistoricoheroes2
        var foto9 = R.drawable.centrodearte2
        var foto10 = R.drawable.sitiohistoricoleon2

        if(arguments!!.getString("position")!=""){
            position = arguments!!.getString("position").toString()
            println("Elemento numero: $position")


            if(position=="1"){
                fig1.setImageResource(foto1)
                //Aquí ya está todo
            }else if(position=="2"){
                fig1.setImageResource(foto2)
                lblTitulo.text = "Museo de Arte Sacro"
                lblAnioFundInfo.text = "13 de agosto 1998"
                lblFundadorInfo.text = "Instituto Nicaragüense de Cultura"
                lblAdministradorInfo.text = "Instituto Nicaragüense de Cultura"
                lblPrecioInfo.text = "Ext. U$5, Nal. C$ 50, Br. C$25 y Est. C$10"
                lblServiciosInfo.text = "Tours precolombino colonial a Ext. y Nal."
                lblHorarioInfo.text = "M-V 8:00 a.m - 5:00 p.m. y S-D 9:00 a.m. - 4:00p.m."
                lblTematicaInfo.text = "Historia predominante"
                lblActividadesInfo.text = "No hay información para ésta área."
                lblTelefonoInfo.text = "N/H"
                lblDireccionInfo.text = "Ruinas de León Viejo."

            }else if (position=="3"){
                fig1.setImageResource(foto3)
                lblTitulo.text = "Museo Adiact"
                lblAnioFundInfo.text = "2001"
                lblFundadorInfo.text = "Monseñor Ricardo Clemente Juárez"
                lblAdministradorInfo.text = "Luis Manuel Somarriba"
                lblPrecioInfo.text = "No hay información para esta área."
                lblServiciosInfo.text = "No hay información para esta área."
                lblHorarioInfo.text = "No hay información para esta área."
                lblTematicaInfo.text = "Sacro"
                lblActividadesInfo.text = "No hay información para esta área."
                lblTelefonoInfo.text = "(+505) 23116866"
                lblDireccionInfo.text = "Costado Suroeste de la Igl. San Juan Bautista de Sutiava, Casa Coral"

            }else if (position=="4"){
                fig1.setImageResource(foto4)
                lblTitulo.text = "Museo Archivo Rubén Darío"
                lblAnioFundInfo.text = "8 de febrero 1964"
                lblFundadorInfo.text = "Edgardo Buitraga, Mairano Frallos Hill y Gustavo Sequeira Madriz"
                lblAdministradorInfo.text = "N/H"
                lblPrecioInfo.text = "Ext. U$1 y Nal. Voluntario"
                lblServiciosInfo.text = "Tours"
                lblHorarioInfo.text = "M-S 8:00 a.m. - 12:00 a.m. y 2:00 p.m. - 5:00 p.m."
                lblTematicaInfo.text = "Casa Histórica"
                lblActividadesInfo.text = "Presentación de libros, Jornadas Darianas, Otros."
                lblTelefonoInfo.text = "(+505) 2311-8327"
                lblDireccionInfo.text = "Costado noroeste de la Igl. de Sutiava - León, León"

            }else if (position == "5"){
                fig1.setImageResource(foto5)
                lblTitulo.text = "Museo Entomológico de León"
                lblAnioFundInfo.text = "1988"
                lblFundadorInfo.text = "Jean-Michel Maes"
                lblAdministradorInfo.text = "Jean-Michel Maes"
                lblPrecioInfo.text = "Nal. y Ext. C$10 y Niños C$5"
                lblServiciosInfo.text = "Identificación de Insectos"
                lblHorarioInfo.text = "J - Martes 9:00 a.m. - 12:00 a.m. y 2:00 p.m. - 4:00 p.m."
                lblTematicaInfo.text = "Entomológico"
                lblActividadesInfo.text = "Estudio de la entomología en Nicaragua"
                lblTelefonoInfo.text = "(+505) 2311 6586"
                lblDireccionInfo.text = "Costado Sur Iglesia San Juan, 2 cuadras al sur."

            }else if (position == "6"){
                fig1.setImageResource(foto6)
                lblTitulo.text = "Museo de Leyendas y Tradiciones"
                lblAnioFundInfo.text = "13 de marzo de 1993"
                lblFundadorInfo.text = "Carmen Toruño López"
                lblAdministradorInfo.text = "Alcaldía de León"
                lblPrecioInfo.text = "Nal. C$20, Ext. C$50, Est. C$15 y Niños C$10"
                lblServiciosInfo.text = "Tours Informativos"
                lblHorarioInfo.text = "M-V 8:00 a.m. y S-D: 9:30 a.m. y 4:00 p.m."
                lblTematicaInfo.text = "Escultura, Grabado, entre otras."
                lblActividadesInfo.text = "Tours"
                lblTelefonoInfo.text = "(+505) 2311 2886"
                lblDireccionInfo.text = "Frente a las ruinas de la Igl. de San Sebastián"

            }else if (position == "7"){
                fig1.setImageResource(foto7)
                lblTitulo.text = "Museo Genízaro y cte. Silvio Mayorga"
                lblAnioFundInfo.text = "2003"
                lblFundadorInfo.text = "Silvio Mayorga"
                lblAdministradorInfo.text = "Alc. de Nagarote. Ing. Juan Hernández Roja y Lic. Nelly Rueda"
                lblPrecioInfo.text = "Gratis"
                lblServiciosInfo.text = "Tours"
                lblHorarioInfo.text = "L-D: 7:30 a.m. - 12:00 a.m. y 1:30 p.m. - 5:00 p.m."
                lblTematicaInfo.text = "Inmueble Histórico"
                lblActividadesInfo.text = "Tours"
                lblTelefonoInfo.text = "N/H"
                lblDireccionInfo.text = "Parque central 1 cuadra al oeste. Nagarote, León."

            }else if (position == "8"){
                fig1.setImageResource(foto8)
                lblTitulo.text = "Museo Histórico Héroes y Mártires"
                lblAnioFundInfo.text = "1981 y 1993 ampliación del museo"
                lblFundadorInfo.text = "Dionisio Meza"
                lblAdministradorInfo.text = "Dionisio Meza"
                lblPrecioInfo.text = "Ext. C$ 100 y Nal. C$50"
                lblServiciosInfo.text = "Tours"
                lblHorarioInfo.text = "L-D 8:30 a.m. - 5:00 p.m."
                lblTematicaInfo.text = "Biográfico/Militar"
                lblActividadesInfo.text = "Fistas, Reuniones del partido político."
                lblTelefonoInfo.text = "(+505) 84004344"
                lblDireccionInfo.text = "Costado oeste de la Catedral de León"

            }else if (position == "9"){
                fig1.setImageResource(foto9)
                lblTitulo.text = "Centro de Arte Fund. Ortíz Gurdián"
                lblAnioFundInfo.text = "2000"
                lblFundadorInfo.text = "Familia Ortíz Gurdián"
                lblAdministradorInfo.text = "Patricia Gurdián de Ortíz"
                lblPrecioInfo.text = "Ext. U$2, Nic. 20. Domingos es Gratis."
                lblServiciosInfo.text = "Tours"
                lblHorarioInfo.text = "M-V 9:00 am - 5:00 pm y 9:00 am - 4:00 pm"
                lblTematicaInfo.text = "Arte Occidental"
                lblActividadesInfo.text = "Tours"
                lblTelefonoInfo.text = "(+505) 23110718"
                lblDireccionInfo.text = "Esquina opuesta Igl. San Francisco, León, Nicaragua."

            }else if (position == "10"){
                fig1.setImageResource(foto10)
                lblTitulo.text = "Sitio histórico Ruinas León Viejo"
                lblAnioFundInfo.text = "1967 (redescubrimiento) - 1972 (Visitas a turistas)"
                lblFundadorInfo.text = "Instituto Nicaragüense de Cultura"
                lblAdministradorInfo.text = "Instituto Nicaragüense de Cultura"
                lblPrecioInfo.text = "Ext. U$5, Nal. C$ 50, Br. C$25 y Est. C$10"
                lblServiciosInfo.text = "No hay información para esta área."
                lblHorarioInfo.text = "M-V 8:00 a.m - 5:00 p.m. y S-D 9:00 a.m. - 4:00p.m."
                lblTematicaInfo.text = "Arqueología"
                lblActividadesInfo.text = "Tours"
                lblTelefonoInfo.text = "N/H"
                lblDireccionInfo.text = "Ruinas de León Viejo"
            }
        }
    }

    fun sendFragmentCall(fragment: Fragment){
        this.fragment = fragment
    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Museo_imabite.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Museo_imabite().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
