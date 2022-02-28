package com.sabsrocambole.coderswag.Controler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sabsrocambole.coderswag.R
import com.sabsrocambole.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringArrayExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}