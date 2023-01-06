package com.example.twice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getData = intent.getStringExtra("data")
        Toast.makeText(this,getData,Toast.LENGTH_LONG).show()

        val member = findViewById<ImageView>(R.id.memberimage)
        if(getData=="1"){
            member.setImageResource(R.drawable.member_1)
        }
        if(getData=="2"){
            member.setImageResource(R.drawable.member_2)
        }
        if(getData=="3"){
            member.setImageResource(R.drawable.member_3)
        }
        if(getData=="4"){
            member.setImageResource(R.drawable.member_4)
        }
        if(getData=="5"){
            member.setImageResource(R.drawable.member_5)
        }
        if(getData=="6"){
            member.setImageResource(R.drawable.member_6)
        }
        if(getData=="7"){
            member.setImageResource(R.drawable.member_7)
        }
        if(getData=="8"){
            member.setImageResource(R.drawable.member_8)
        }
        if(getData=="9"){
            member.setImageResource(R.drawable.member_9)
        }
    }
}