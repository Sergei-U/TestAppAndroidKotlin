package ru.usov.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonPanel.setOnClickListener {
            Toast.makeText(this, "Я буду android-разработчиком!", Toast.LENGTH_SHORT).show()
        }
    }

    fun onClickToast(view: View) {
        Toast.makeText(this, "CHIN!", Toast.LENGTH_SHORT).show()
    }
}