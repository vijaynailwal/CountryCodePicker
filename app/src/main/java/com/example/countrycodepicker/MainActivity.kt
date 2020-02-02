package com.example.countrycodepicker

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.hbb20.CountryCodePicker
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), CountryCodePicker.OnCountryChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ccp!!.setOnCountryChangeListener(this)
//        ccp!!.setDefaultCountryUsingNameCode("JP")
    }
    override fun onCountrySelected() {
        Log.v("MainActivity", ccp!!.selectedCountryCode)
        Log.v("MainActivity", ccp!!.selectedCountryName)


    }
}
