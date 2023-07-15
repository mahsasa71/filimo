package ir.android.filimo.api


import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

interface Iservice {
    @GET("api.php?home_banner")
    fun getHbanner():Call<ResponseBody>

}