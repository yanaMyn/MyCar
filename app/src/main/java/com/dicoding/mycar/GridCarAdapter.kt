package com.dicoding.mycar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridCarAdapter(val listCar: ArrayList<Car>): RecyclerView.Adapter<GridCarAdapter.GridViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickedCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class GridViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var photo: ImageView = itemView.findViewById(R.id.img_car)
        var year: TextView = itemView.findViewById(R.id.tv_year)
        var name: TextView = itemView.findViewById(R.id.car_name)
        var brand: TextView = itemView.findViewById(R.id.car_brand)
        var price: TextView = itemView.findViewById(R.id.car_price)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GridCarAdapter.GridViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_grid_car, parent, false)
        return  GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridCarAdapter.GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listCar[position].photo)
            .apply(RequestOptions().override(550, 350))
            .into(holder.photo)

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listCar[holder.adapterPosition]) }

        holder.year.text = listCar[position].year.toString()
        holder.name.text = listCar[position].name
        holder.brand.text = listCar[position].brand
        holder.price.text = listCar[position].price
    }

    override fun getItemCount(): Int {
        return  listCar.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Car)
    }
}