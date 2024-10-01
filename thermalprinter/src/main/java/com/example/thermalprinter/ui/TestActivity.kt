package com.example.thermalprinter.ui

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.thermalprinter.R
import com.example.thermalprinter.model.PrintViewPrescription
import com.example.thermalprinter.model.PrintViewPrescriptionDataModel

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_test)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
           /* val printViewPrescription = PrintViewPrescription(
                this, "clsDetails",
                "patient", PrintViewPrescriptionDataModel(),
                this)
            try {
                printViewPrescription.textPrint()
            } catch (e: Exception) {
                throw RuntimeException(e)
            }*/
        }

    }
}