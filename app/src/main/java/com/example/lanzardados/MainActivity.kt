package com.example.lanzardados

import android.media.MediaPlayer
import android.os.Bundle
import android.os.CountDownTimer
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.lanzardados.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lanzarDados: Button = findViewById(R.id.lanzardado)
        lanzarDados.setOnClickListener {
           tiempo()


        }
        roll()
    }
    private fun roll(){
        var dado = (1..6).random()
        val txtResult: TextView = findViewById(R.id.vista)

        txtResult.text=dado.toString()

        val imagenDraw = when(dado){
            1 -> R.drawable.dado1
            2 -> R.drawable.dado2
            3 -> R.drawable.dado_3
            4 -> R.drawable.dado_4
            5 -> R.drawable.dado55
            else -> R.drawable.dado6
        }
        val imagenDado: ImageView = findViewById(R.id.imagendado)
        imagenDado.setImageResource(imagenDraw)

    }
    private fun tiempo(){
        object: CountDownTimer(3000,200) {
            override fun onTick(p0: Long) {
                roll()
            }

            override fun onFinish() {
            }


        }.start()
    }

}


