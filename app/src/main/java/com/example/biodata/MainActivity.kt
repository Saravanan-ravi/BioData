package com.example.biodata

import android.annotation.SuppressLint
import android.icu.lang.UCharacter.getAge
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import android.text.InputFilter
import java.security.PublicKey

import android.widget.DatePicker
import android.widget.LinearLayout
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {




    @SuppressLint("WrongViewCast")
    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val etName: EditText  = findViewById(R.id.etName) as EditText
        etName.setFilters(arrayOf<InputFilter>(InputFilter.AllCaps()))



     /*  val personNames =
            arrayOf("none","B.E., ECE", "B.E., CSE", "B.E., MECH", "B.E., BIO-MED", "B.E., EEE", "B.E., CIVIL", "B.TECH., IT")
        val spinner: Spinner = findViewById(R.id.spinner) as Spinner

        if (spinner != null) {
            val arrayAdapter =
                ArrayAdapter(this@MainActivity, android.R.layout.simple_spinner_dropdown_item, personNames)
            spinner.adapter = arrayAdapter
            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity,getString(R.string.selected_item) + "" + personNames[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // Code to perform some action when nothing is selected
                }
            }
        } */

    }
}


