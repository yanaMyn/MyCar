package com.dicoding.mycar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailCarActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_BRAND = "extra_brand"
        const val EXTRA_YEAR = "extra_year"
        const val EXTRA_NEGO = "extra_nego"
        const val EXTRA_DESC = "extra_desc"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_car)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        populateData()
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    private fun populateData() {
        val imgCar: ImageView = findViewById(R.id.img_car)
        val tvCarName: TextView = findViewById(R.id.tv_name)
        val tvCarPrice: TextView = findViewById(R.id.tv_price)
        val tvCarBrand: TextView = findViewById(R.id.tv_brand)
        val tvCaryear: TextView = findViewById(R.id.tv_year)
        val tvCarNego: TextView = findViewById(R.id.tv_negotiable)
        val tvCarDesc: TextView = findViewById(R.id.tv_desc)

        Glide.with(this@DetailCarActivity)
            .load(intent.getIntExtra(EXTRA_PHOTO, 0))
            .apply(RequestOptions().override(350, 550))
            .into(imgCar)

        tvCarName.text = intent.getStringExtra(EXTRA_NAME)
        tvCarPrice.text = intent.getStringExtra(EXTRA_PRICE)
        tvCarBrand.text = intent.getStringExtra(EXTRA_BRAND)
        tvCarDesc.text = intent.getStringExtra(EXTRA_DESC)

        val year = intent.getIntExtra(EXTRA_YEAR, 2000)
        tvCaryear.text = year.toString()

        val isNego = intent.getBooleanExtra(EXTRA_NEGO, false)
        tvCarNego.text = if (isNego) "Ya" else "Tidak"
    }
}