package com.nago.countries.controller;

import com.nago.countries.data.CountryRepository;
import com.nago.countries.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping("/")
    public String listOfCountries(ModelMap modelMap){
        List<Country> allCountries = countryRepository.getAllCountriesSorted("");
        modelMap.put("countries", allCountries);
        return "home";
    }

    @RequestMapping("/countries/{value}")
    public String sortedListOfCountries(@PathVariable String value, ModelMap modelMap){
        List<Country> allCountries = countryRepository.getAllCountriesSorted(value);
        modelMap.put("countries", allCountries);
        return "home";
    }

    @RequestMapping("/country/{name}")
    public String countryDetails(@PathVariable String name, ModelMap modelMap){
        Country country = countryRepository.findByName(name);
        modelMap.put("country", country);
        return "country-details";
    }
}
