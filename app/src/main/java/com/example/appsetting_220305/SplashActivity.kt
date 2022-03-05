package com.example.appsetting_220305

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        2.5초 후에 메인 화면으로 이동

        val myHandler = Handler(Looper.getMainLooper())

        myHandler.postDelayed({

            val myIntent =Intent(this,MainActivity::class.java )
            startActivity(myIntent)
//        위가 메인에서 로고 뜨고 넘어가게 하는거
//            이동후에 splash 종료
            finish()

        },2500)



    }
}