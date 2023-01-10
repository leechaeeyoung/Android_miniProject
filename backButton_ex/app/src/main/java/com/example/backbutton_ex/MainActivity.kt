package com.example.backbutton_ex

import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {

        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        Log.d("MainActivity","backbutton")

        var isDouble = true
        Toast.makeText(this,"종료하시려면 더블클릭",Toast.LENGTH_LONG).show()

        Handler().postDelayed(Runnable{
            isDouble = false
        },2000)
    }
}