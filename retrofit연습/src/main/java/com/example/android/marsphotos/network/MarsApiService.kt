package com.example.android.marsphotos.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"

/**
 * Build the Moshi object with Kotlin adapter factory that Retrofit will be using.
 */
private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

// 문자열 및 기타 프리미티브 유형 지원 라이브러리 존재
/**
 * The Retrofit object with the Moshi converter.
 */
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)  // 기본 URL
    .build() // 객체 생성

interface MarsApiService {
    // web 서비스 응답 문자열 가져오는 함수
    @GET("photos")
    // 정지함수
    suspend fun getPhotos() : List<MarsPhoto>
}

object MarsApi{
    // 지연 초기화(최초 사용 초기화를 위해)
    val retrofitService : MarsApiService by lazy{
        retrofit.create(MarsApiService::class.java) // retrofitService 변수 초기화
    }
}