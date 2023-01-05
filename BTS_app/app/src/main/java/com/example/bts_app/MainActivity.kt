package com.example.bts_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.example.bts_app.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        // 1. 화면이 클릭되었다는 것을 프로그램에게 알려줌
        val image1 = findViewById<ImageView>(id.btsImage1)
        val image2 = findViewById<ImageView>(id.btsImage2)
        val image3 = findViewById<ImageView>(id.btsImage3)
        val image4 = findViewById<ImageView>(id.btsImage4)
        val image5 = findViewById<ImageView>(id.btsImage5)
        val image6 = findViewById<ImageView>(id.btsImage6)
        val image7 = findViewById<ImageView>(id.btsImage7)
        image1.setOnClickListener{
            Toast.makeText(this,"1번이 선택되었습니다.",Toast.LENGTH_LONG).show()

            // 2. 화면 클릭 시 다음 화면으로 넘어가 사진을 크게 보여줌
            val intent = Intent(this, Bts1_Activity::class.java)
            startActivity(intent)
        }
        image2.setOnClickListener{
            Toast.makeText(this,"2번이 선택되었습니다.",Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts2_Activity::class.java)
            startActivity(intent)
        }
        image3.setOnClickListener{
            Toast.makeText(this,"3번이 선택되었습니다.",Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts3_Activity::class.java)
            startActivity(intent)
        }
        image4.setOnClickListener{
            Toast.makeText(this,"4번이 선택되었습니다.",Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts4_Activity::class.java)
            startActivity(intent)
        }
        image5.setOnClickListener{
            Toast.makeText(this,"5번이 선택되었습니다.",Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts5_Activity::class.java)
            startActivity(intent)
        }
        image6.setOnClickListener{
            Toast.makeText(this,"6번이 선택되었습니다.",Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts6_Activity::class.java)
            startActivity(intent)
        }
        image7.setOnClickListener{
            Toast.makeText(this,"7번이 선택되었습니다.",Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts7_Activity::class.java)
            startActivity(intent)
        }
    }
}