package com.sabsrocambole.coderswag.Controler

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.ListView
import androidx.recyclerview.widget.GridLayoutManager
import com.sabsrocambole.codderswag2.R
import com.sabsrocambole.coderswag.Adapters.ProductsAdapter
import com.sabsrocambole.coderswag.Services.DataService
import com.sabsrocambole.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    //var categoryListView = findViewById<ListView>(R.id.categoryListView)
    var productsListView = findViewById<ListView>(R.id.productListView)

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringArrayExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this,DataService.getProducts(categoryType))

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 4
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize>720){
            spanCount = 3
        }


        val layoutManager = GridLayoutManager(this,spanCount)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}