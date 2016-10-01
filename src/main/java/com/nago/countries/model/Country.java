package com.nago.countries.model;

import java.util.List;

public class Country {
    private String name;
    private int population;
    private String capCity;
    private List<String> languages;

    public Country(String name, int population, String capCity, List<String> languages) {
        this.name = name;
        this.population = population;
        this.capCity = capCity;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapCity() {
        return capCity;
    }

    public void setCapCity(String capCity) {
        this.capCity = capCity;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
}
