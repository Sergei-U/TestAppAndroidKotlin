package ru.usov.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(findViewById(R.id.bottom_navigation))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_main)

        topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.fav -> {
                    Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.search -> {
                    Toast.makeText(this, "Поиск", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.more -> {
                    Toast.makeText(this, "Еще", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        val mainFragment = MainFragment()
        val bundle = Bundle()
        bundle.putString("token", "qqweazs12213")
        MainFragment.newInstance(args = bundle)


        val emample = Example("ex")
        val intent = Intent(applicationContext, MainActivity::class.java)
        intent.putExtra("ex", emample)


        fun onClickToast(view: View) {
            Toast.makeText(this, "CHIN!", Toast.LENGTH_SHORT).show()
        }
    }
}