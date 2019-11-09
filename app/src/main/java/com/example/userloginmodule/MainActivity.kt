package com.example.userloginmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        visibleButton.setOnClickListener{

            if(visibleButton.text.toString().equals("-")){

                password.transformationMethod = HideReturnsTransformationMethod.getInstance()
                visibleButton.setBackgroundResource(R.drawable.visible_30dp)
                visibleButton.text = ""
            }

            else{

                password.transformationMethod = PasswordTransformationMethod.getInstance()
                visibleButton.setBackgroundResource(R.drawable.not_visible_30dp)
                visibleButton.text = "-"
            }

        }
    }

}
