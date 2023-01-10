package com.example.multimedia_t5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
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
        /*if (texto1.text.toString().isEmpty()){
            botonHacer.isEnabled=false
        } else {
            botonHacer.isEnabled=true
        }*/

        findViewById<EditText>(R.id.texto1).addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                findViewById<Button>(R.id.botonHacer).isEnabled =
                    !(findViewById<EditText>(R.id.texto1).text.toString().isEmpty()
                            || findViewById<EditText>(R.id.texto2).text.toString().isEmpty());
            }
        })

        findViewById<EditText>(R.id.texto2).addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                findViewById<Button>(R.id.botonHacer).isEnabled =
                    !(findViewById<EditText>(R.id.texto1).text.toString().isEmpty()
                            || findViewById<EditText>(R.id.texto2).text.toString().isEmpty());
            }
        })
    }
}