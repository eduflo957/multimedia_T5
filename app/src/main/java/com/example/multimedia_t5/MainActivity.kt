package com.example.multimedia_t5

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonHacer = findViewById<Button>(R.id.botonHacer)
        val texto1 = findViewById<EditText>(R.id.texto1)
        val texto2 = findViewById<EditText>(R.id.texto2)

        botonHacer.isEnabled = false

        texto1.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                botonHacer.isEnabled =
                    !(texto1.text.toString().isEmpty()
                            || texto2.text.toString().isEmpty())
            }
        })

        texto2.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                botonHacer.isEnabled =
                    !(texto1.text.toString().isEmpty()
                            || texto2.text.toString().isEmpty())
            }
        })

        botonHacer.setOnClickListener {
            concatenar()

        }

    }

    @SuppressLint("SetTextI18n")
    private fun concatenar() {
        val texto1 = findViewById<TextView>(R.id.texto1)
        val texto2 = findViewById<TextView>(R.id.texto2)
        val botonHacer = findViewById<Button>(R.id.botonHacer)
        val textToConcat1 = texto1.text.toString()
        val textToConcat2 = texto2.text.toString()
        texto2.text = textToConcat1 + textToConcat2
        texto1.text = " "
        botonHacer.isEnabled=false
    }
}
