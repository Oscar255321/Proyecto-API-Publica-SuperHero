package com.example.redapi_publica.Conexiones;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConexionRetrofit
{
    private static Retrofit retrofit;

    private static final String url = "https://www.superheroapi.com/api.php/682bda283e4ea9839b285032e6f377f1/";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create()) // Serializador JSON
                    .build();
        }
        return retrofit;
    }
}
