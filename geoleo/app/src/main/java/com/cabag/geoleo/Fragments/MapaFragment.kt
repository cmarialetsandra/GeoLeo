package com.cabag.geoleo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.cabag.geoleo.R
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapaFragment : Fragment(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    companion object {
        var mapFragment : SupportMapFragment?=null
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater.inflate(R.layout.fragment_mapa, container, false)

        mapFragment = childFragmentManager.findFragmentById(R.id.mapa) as SupportMapFragment?
        mapFragment?.getMapAsync(this)

        return rootView
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        if (googleMap != null) {
            mMap = googleMap
        }

        val leonviejo = LatLng(12.4019444, -86.61694444444444)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.museopuntero))
            .position(leonviejo).title("Ruinas de León Viejo"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(leonviejo))

        val arteSacro = LatLng(12.433, -86.89547222222222)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.museopuntero))
            .position(arteSacro).title("Museo de arte sacro, Monseñor César Bosco Vivas Robelo"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(arteSacro))

        val adiact = LatLng(12.435, -86.8938888888889)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.museopuntero))
            .position(adiact).title("Museo Adiact"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(adiact))

        val rubenDario = LatLng(12.435,  -86.88277777777778)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.museopuntero))
            .position(rubenDario).title("Museo Archivo Rubén Darío"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rubenDario))

        val entomologico = LatLng(12.4375, -86.87444444444444)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.museopuntero))
            .position(entomologico).title("Museo Entomológico de León"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(entomologico))

        val leyendas = LatLng(12.4321111, -86.87883333333333)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.museopuntero))
            .position(leyendas).title("Museo de Leyendas y Tradiciones “Coronel Joaquín de Arrechavala”"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(leyendas))

        val genizaro = LatLng(12.2650556, -86.56408333333333)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.museopuntero))
            .position(genizaro).title("Museo Genízaro y comandante Silvio Mayorga"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(genizaro))

        val revolucion = LatLng(12.43475, -86.87941666666666)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.museopuntero))
            .position(revolucion).title("Museo Histórico Héroes y Mártires de Veracruz"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(revolucion))

        val fundacion = LatLng(12.4347778, -86.88191666666665)
        mMap.addMarker(MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.museopuntero))
            .position(fundacion).title("Centro de Arte de la Fundación Ortíz Gurdián"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fundacion))
    }

}
