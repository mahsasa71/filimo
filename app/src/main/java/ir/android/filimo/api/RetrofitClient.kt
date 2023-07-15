package ir.android.filimo.api

import retrofit2.Retrofit

object RetrofitClient {
    var retrofit=Retrofit.Builder()
        .baseUrl("http://mobilemasters.ir/apps/filimo-android/")
        .build()
}