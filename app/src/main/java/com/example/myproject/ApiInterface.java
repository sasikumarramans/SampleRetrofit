package com.example.myproject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("heroStats")
    Call<List<MarvelObj>> getsuperHeroes();
}
