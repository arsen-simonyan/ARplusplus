package com.example.test1.main;

import com.example.test1.main.main_data.BasicResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONPlaceHolderApi {
    @GET("/search?q=debates&api-key=test")
    Call<BasicResponse> getContent();

    @GET("search?q=12%20years%20a%20slave&format=json&tag=film/film,tone/reviews&from-date=2010-01-01&show-tags=contributor&show-fields=starRating,headline,thumbnail,short-url&order-by=relevance&api-key=test")
    Call<BasicResponse> getContentX();
}
