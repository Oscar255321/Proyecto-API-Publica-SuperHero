package com.example.redapi_publica.Clases;

import com.google.gson.annotations.SerializedName;

public class Superhero {

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
