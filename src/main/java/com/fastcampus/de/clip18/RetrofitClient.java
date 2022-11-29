package com.fastcampus.de.clip18;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String BASE_URL = "https://reqres.in/";

    /* 실제 retrofit 객체를 리턴하는 메소드를 생성 */
    public static RetrofitService getApi()
    {
        return getInstance().create(RetrofitService.class);
    }


    private static Retrofit getInstance()
    {
        Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson)) // 어떻게 데이터를 parsing할지 converter를 추가하는 부분
                .build();
    }
}
