package ru.usov.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NewActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        intent.extras?.getString("ex")

    }
}