package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.adapter.ItemAdapter
import com.example.myapplication.data.DataItem
import com.example.myapplication.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding
    private lateinit var productArrayList: ArrayList<DataItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.img_productimage_1,
            R.drawable.img_productimage_2,
            R.drawable.img_productimage_3,
            R.drawable.img_productimage_4,
            R.drawable.img_productimage_5
        )

        val name = arrayOf(
            "1","2","3","4","5"
        )
        val price = arrayOf(
            "Rp 1.000.000","Rp 1.000.000","Rp 1.000.000","Rp 1.000.000","Rp 1.000.000"
        )

        productArrayList = ArrayList()
        for (i in name.indices) {
            val product = DataItem(name[i], price[i], imageId[i])
            productArrayList.add(product)
        }

        binding.ListView.adapter = ItemAdapter(this, productArrayList)
    }
}