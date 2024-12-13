package com.example.redapi_publica.Conexiones;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConexionRetrofit
{
    private static Retrofit retrofit;

    // Base URL, no incluyas el token en el baseUrl, solo la parte base
    private static final String BASE_URL = "https://www.superheroapi.com/api.php/682bda283e4ea9839b285032e6f377f1/";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            // Crear Retrofit con GsonConverterFactory
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL) // Base URL
                    .addConverterFactory(GsonConverterFactory.create()) // Serializador JSON
                    .build();
        }
        return retrofit;
    }
}
