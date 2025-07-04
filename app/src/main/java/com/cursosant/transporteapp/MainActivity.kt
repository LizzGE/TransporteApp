package com.cursosant.transporteapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cursosant.transporteapp.databinding.ActivityMainBinding
import com.cursosant.transporteapp.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            Toast.makeText(
                this,
                "¡Bienvenido! Pulsa cualquier botón para ver el horario.",
                Toast.LENGTH_LONG
            ).show()
        }
    }
