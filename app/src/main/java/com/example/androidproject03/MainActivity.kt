package com.example.androidproject03

import android.content.Intent
import android.hardware.display.DeviceProductInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        intent.getStringExtra("product")?.let {
            showProductInfo(it)
        }

    }

    override fun onNewIntent(intent: Intent?) {
        intent?.getStringExtra("product")?.let {
            showProductInfo(it)
        }
        super.onNewIntent(intent)
    }

    private fun showProductInfo(productInfo: String) {
        Log.i("MainActivity", productInfo)
    }
}