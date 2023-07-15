package ir.android.filimo

import android.net.DnsResolver
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ir.android.filimo.api.Iservice
import ir.android.filimo.api.RetrofitClient
import ir.android.filimo.databinding.ActivityMainBinding
import okhttp3.Callback
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.create

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        var iservice:Iservice=RetrofitClient.retrofit.create(Iservice::class.java)
        iservice.getHbanner().enqueue(object :retrofit2.Callback<ResponseBody>{
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                Log.e("","")

            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                Log.e("","")
            }

        })

    }
}