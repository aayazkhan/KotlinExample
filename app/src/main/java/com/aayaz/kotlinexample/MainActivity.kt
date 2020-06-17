package com.aayaz.kotlinexample

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        circularProgress.maxProgress = 150.0
        circularProgress.setCurrentProgress(5000.0)

        circularProgress.setProgress(98.0, 150.0)

        circularProgress.textColor = resources.getColor(R.color.colorBlueDark)


    }

    fun onNextClick(view: View) {

        startActivity(Intent(this, HomeActivity::class.java))

    }
}