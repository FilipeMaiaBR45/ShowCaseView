package com.example.showcaseview

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import co.mobiwise.materialintro.animation.MaterialIntroListener
import co.mobiwise.materialintro.shape.Focus
import co.mobiwise.materialintro.shape.FocusGravity
import co.mobiwise.materialintro.shape.ShapeType
import co.mobiwise.materialintro.view.MaterialIntroView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView : TextView = findViewById(R.id.textView1)
        val textView2 : TextView = findViewById(R.id.textView2)

        MaterialIntroView.Builder(this)
            .enableDotAnimation(false)
            .enableIcon(false)
            .setFocusGravity(FocusGravity.CENTER)
            .setFocusType(Focus.ALL)
            .setDelayMillis(500)
            .enableFadeAnimation(true)
            .performClick(true)
            .setInfoText("Hi There! Click this card and see what happens.")
            .setShape(ShapeType.CIRCLE)
            .setTarget(textView)
            .setUsageId("intro_card") //THIS SHOULD BE UNIQUE ID
            .setListener {
                MaterialIntroView.Builder(this)
                    .enableDotAnimation(false)
                    .enableIcon(false)
                    .setFocusGravity(FocusGravity.CENTER)
                    .setFocusType(Focus.ALL)
                    .setDelayMillis(500)
                    .enableFadeAnimation(true)
                    .performClick(true)
                    .setInfoText("Hi There! Click this card and see what happens.")
                    .setShape(ShapeType.CIRCLE)
                    .setTarget(textView2)
                    .setUsageId("intro_card2") //THIS SHOULD BE UNIQUE ID
                    .show()

            }
            .show()
    }
}