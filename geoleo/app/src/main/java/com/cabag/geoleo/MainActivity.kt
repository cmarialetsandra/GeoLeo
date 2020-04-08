package com.cabag.geoleo

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cabag.geoleo.Fragments.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Museo_imabite.OnFragmentInteractionListener{
    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    val manager = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(1)
        navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {
            item ->
        when(item.itemId){
            R.id.nav_inicio->{
                replaceFragment(1)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_museos->{
                replaceFragment(2)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_mapa->{
                replaceFragment(3)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_acerca->{
                replaceFragment(4)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    fun replaceFragment(frag: Int){
        val transaction = manager.beginTransaction()
        val fragmentInicio = InicioFragment()
        val fragmentMuseo = MuseosFragment()
        val fragmentMapa = MapaFragment()
        val fragmentAcerca = AcercaDeFragment()
        when(frag){
            1->{
                transaction.replace(R.id.fragmentF, fragmentInicio).addToBackStack(null).commit()
            }
            2->{
                transaction.replace(R.id.fragmentF, fragmentMuseo).addToBackStack(null).commit()
            }
            3->{
                transaction.replace(R.id.fragmentF, fragmentMapa).addToBackStack(null).commit()
            }
            4->{
                transaction.replace(R.id.fragmentF, fragmentAcerca).addToBackStack(null).commit()
            }
        }
    }
}
