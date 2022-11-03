package com.dicoding.mycar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvCars: RecyclerView
    private var list: ArrayList<Car> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "My Car"
        configureRecyclerData()
    }

    private fun configureRecyclerData() {
        rvCars = findViewById(R.id.rv_car)
        rvCars.setHasFixedSize(true)
        list.addAll(CarsData.listData)
        showRecyclerGrid()
    }

    private fun showRecyclerGrid() {
        rvCars.layoutManager = GridLayoutManager(this, 2)
        val gridCarAdapter = GridCarAdapter(list)
        rvCars.adapter = gridCarAdapter

        gridCarAdapter.setOnItemClickedCallback(object : GridCarAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Car) {
                didTapCar(data)
            }
        })
    }

    fun didTapCar(car: Car) {
        val detailCarIntent = Intent(this@MainActivity, DetailCarActivity::class.java)
        detailCarIntent.putExtra(DetailCarActivity.EXTRA_PHOTO, car.photo)
        detailCarIntent.putExtra(DetailCarActivity.EXTRA_NAME, car.name)
        detailCarIntent.putExtra(DetailCarActivity.EXTRA_PRICE, car.price)
        detailCarIntent.putExtra(DetailCarActivity.EXTRA_BRAND, car.brand)
        detailCarIntent.putExtra(DetailCarActivity.EXTRA_YEAR, car.year)
        detailCarIntent.putExtra(DetailCarActivity.EXTRA_NEGO, car.nego)
        detailCarIntent.putExtra(DetailCarActivity.EXTRA_DESC, car.desc)

        startActivity(detailCarIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about_page, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        didTapAboutPage(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun didTapAboutPage(itemId: Int) {
        when (itemId)  {
            R.id.about_page -> {
                val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(aboutIntent)
            }
        }
    }
}