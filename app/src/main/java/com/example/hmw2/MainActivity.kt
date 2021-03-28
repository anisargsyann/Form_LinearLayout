package com.example.hmw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val elements = arrayOf("Male", "Female")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, elements)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(
                    this@MainActivity,
                    " Selected element is ${elements[position]}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}