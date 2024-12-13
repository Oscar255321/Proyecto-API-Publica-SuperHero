package com.example.redapi_publica.Clases;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SuperheroResponse {
    @SerializedName("response")
    public String response;
    @SerializedName("results-for")
    public String results_for;
    @SerializedName("results")
    private List<Superhero> resultados;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getResults_for() {
        return results_for;
    }

    public void setResults_for(String results_for) {
        this.results_for = results_for;
    }

    public List<Superhero> getResultados() {
        return resultados;
    }

    public void setResultados(List<Superhero> resultados) {
        this.resultados = resultados;
    }
}

