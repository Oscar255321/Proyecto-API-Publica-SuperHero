package com.example.redapi_publica.Controladores;

import com.example.redapi_publica.Clases.SuperheroResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SuperheroAPI {

    /* Buscamos por nombre en la API*/

    @GET("search/{name}")
    Call<SuperheroResponse> buscarSuperheroe(@Path("name") String name);



}
