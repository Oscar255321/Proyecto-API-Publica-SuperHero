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

class Superhero {

    private String id;
    private String name;

    @SerializedName("powerstats")
    private Powerstats powerstats;

    @SerializedName("appearance")
    private Apariencia apariencia;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Powerstats getPowerstats()
    {
        return powerstats;
    }

    public void setPowerstats(Powerstats powerstats)
    {
        this.powerstats = powerstats;
    }

    public Apariencia getApariencia()
    {
        return apariencia;
    }

    public void setApariencia(Apariencia apariencia)
    {
        this.apariencia = apariencia;
    }
}

class Powerstats {

    private String inteligencia;
    private String fuerza;
    private String velocidad;

    public String getInteligencia()
    {
        return inteligencia;
    }
    public void setInteligencia(String inteligencia)
    {
        this.inteligencia = inteligencia;
    }

    public String getFuerza()
    {
        return fuerza;
    }
    public void setFuerza(String fuerza)
    {
        this.fuerza = fuerza;
    }

    public String getVelocidad()
    {
        return velocidad;
    }
    public void setVelocidad(String velocidad)
    {
        this.velocidad = velocidad;
    }

}

    class Apariencia
    {
        private String genero;
        private String raza;

        public String getGenero()
        {
            return genero;
        }
        public void setGenero(String genero)
        {
            this.genero = genero;
        }

        public String getRaza()
        {
            return raza;
        }

        public void setRaza(String raza)
        {
            this.raza = raza;
        }
    }
