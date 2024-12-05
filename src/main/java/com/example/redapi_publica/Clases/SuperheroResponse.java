package com.example.redapi_publica.Clases;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SuperheroResponse {

    @SerializedName("results")
    private List<Superhero> resultados;

    public List<Superhero> getResultados() {
        return resultados;
    }

    public void setResultados(List<Superhero> resultados) {
        this.resultados = resultados;
    }
}

