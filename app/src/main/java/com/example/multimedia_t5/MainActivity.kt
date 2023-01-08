package com.example.multimedia_t5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var botonHacer = findViewById<Button>(R.id.botonHacer)
        var texto1 = findViewById<EditText>(R.id.texto1)
        var texto2 = findViewById<EditText>(R.id.texto2)

        // || texto2.text.isEmpty()
        if (texto1.text.toString() == "h"){
            botonHacer.setEnabled(false)
        } else {
            botonHacer.setEnabled(true)
        }

    }
}