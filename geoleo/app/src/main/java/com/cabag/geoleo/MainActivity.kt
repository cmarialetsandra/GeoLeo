package com.cabag.geoleo

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ViewFlipper
import androidx.viewpager.widget.ViewPager
import com.cabag.geoleo.Fragments.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Museo_imabite.OnFragmentInteractionListener{
    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    val manager = supportFragmentManager

    //internal lateinit var viewPager : ViewPager
   lateinit var viewflipper: ViewFlipper
   var image = intArrayOf(R.drawable.catedral, R.drawable.iglesia, R.drawable.leon)

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewflipper = findViewById(R.id.v_flipper)


        for (i in 0 until image.size){
            flip_image(image[i])
        }

        /*viewPager = findViewById<View>(R.id.viewPager) as ViewPager
        val adapter = ViewPageAdapter(this)
        viewPager.adapter = adapter*/

        replaceFragment(1)
        navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }

   fun flip_image(i : Int){
        val view = ImageView(this)
        view.setBackgroundResource(i)
        viewflipper.addView(view)
        viewflipper.setFlipInterval(3000)
        viewflipper.setAutoStart(true)
        viewflipper.setInAnimation(this, android.R.anim.slide_in_left)
        viewflipper.setOutAnimation(this, android.R.anim.slide_out_right)

    }

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {
            item ->
        when(item.itemId){
            R.id.nav_inicio->{
                viewflipper = findViewById(R.id.v_flipper)


                for (i in 0 until image.size){
                    flip_image(image[i])
                }

                /*fun flip_image(i : Int){
                    val view = ImageView(this)
                    view.setBackgroundResource(i)
                    viewflipper.addView(view)
                    viewflipper.setFlipInterval(3000)
                    viewflipper.setAutoStart(true)
                    viewflipper.setInAnimation(this, android.R.anim.slide_in_left)
                    viewflipper.setOutAnimation(this, android.R.anim.slide_out_right)

                }*/
                replaceFragment(1)
                return@OnNavigationItemSelectedListener true
               /* viewPager = findViewById<View>(R.id.viewPager) as ViewPager
                val adapter = ViewPageAdapter(this)
                viewPager.adapter = adapter*/

            }
            R.id.nav_museos->{
                viewflipper.removeAllViewsInLayout()
               // viewPager.adapter = null
                replaceFragment(2)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_mapa->{
                viewflipper.removeAllViewsInLayout()
                replaceFragment(3)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_acerca->{
                viewflipper.removeAllViewsInLayout()
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
