package com.kazimasum.recmvvm.apis;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroInstance
{
    public static String baseurl="http://192.168.0.100/api/"; // volley_array.json
    private static Retrofit retrofit;

    public static Retrofit getRetroClient()
    {
         if(retrofit==null)
         {
             retrofit= new Retrofit.Builder()
                           .baseUrl(baseurl)
                           .addConverterFactory(GsonConverterFactory.create())
                           .build();
         }
         return retrofit;
    }
}
