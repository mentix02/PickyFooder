package com.example.manan.pickyfooder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Salad")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.requestWindowFeature(Window.FEATURE_NO_TITLE)

        setContentView(R.layout.activity_main)

        newFoodBtn.setOnClickListener(){
            println("clicked") // sanity check
            val random = Random()
            val randomFoodIndex = random.nextInt(foodList.count())
            foodName.text = foodList[randomFoodIndex]
        }

        addFoodBtn.setOnClickListener(){
            val newFood = addFootInp.text.toString()
            foodList.add(newFood)
            addFootInp.text.clear()
        }
    }
}
