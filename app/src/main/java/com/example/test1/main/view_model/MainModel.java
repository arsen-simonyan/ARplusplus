package com.example.test1.main.view_model;

import com.example.test1.main.JSONPlaceHolderApi;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainModel {
    private static final String BASE_URL = "https://content.guardianapis.com/";

    private static MainModel mInstance;

    private final Retrofit mRetrofit;
    
    private MainModel() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }

    public static MainModel getInstance() {
        if (mInstance == null) {
            mInstance = new MainModel();
        }
        return mInstance;
    }

    public JSONPlaceHolderApi getJSONApi()
    {
        return mRetrofit.create(JSONPlaceHolderApi.class);
    }
}
