package org.geeksforgeeks.devicedetails

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val m0 = Build.BOARD
        val m1 = Build.BRAND
        val m2 = Build.DEVICE
        val m3 = Build.DISPLAY
        val m4 = Build.FINGERPRINT
        val m5 = Build.HARDWARE
        val m6 = Build.MANUFACTURER
        val m7 = Build.MODEL
        val m8 = Build.PRODUCT

        val mTextView = findViewById<TextView>(R.id.text_view_1)
        
        mTextView.text =
                "Mother Board: $m0\n\n" +
                "Brand:        $m1\n\n" +
                "Device:       $m2\n\n" +
                "Display:      $m3\n\n" +
                "Fingerprint:  $m4\n\n" +
                "Hardware:     $m5\n\n" +
                "Manufacturer: $m6\n\n" +
                "Model:        $m7\n\n" +
                "Product:      $m8"



    }
}