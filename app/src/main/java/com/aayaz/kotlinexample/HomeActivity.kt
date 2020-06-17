package com.aayaz.kotlinexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {

    companion object {
        private val lineSet = linkedMapOf(
            "JAN" to 0F,
            "FEB" to 2F,
            "MAR" to 5F,
            "MAY" to 2F,
            "APR" to 3.5F,
            "JUN" to 4.5F,
            "JUL" to 5.5F,
            "" to 10F
        )

        private val barSet = linkedMapOf(
            "Delhi" to 1F,
            "Punjab" to 3F,
            "Mumbai" to 2F,
            "Goa" to 3.5F,
            "Jaipur" to 1.5F,
            "Kerala" to 2.5F
        )

        private const val animationDuration = 1000L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        tabLayout.getTabAt(1)?.select()

        lineChart.animation.duration = animationDuration
        lineChart.animate(lineSet)

        barChart.animation.duration = animationDuration
        barChart.animate(barSet)

        barChart.axis.declaringClass

        barChart.spacing = 180F

    }

}