package com.nago.countries.data;

import com.nago.countries.model.Country;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CountryRepository {
    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("Ukraine", 45426200, "Kiev", Collections.singletonList("ukrainian")),
            new Country("France", 65844000, "Paris", Collections.singletonList("french")),
            new Country("Italy", 59943933, "Rome", Collections.singletonList("italian")),
            new Country("New Zealand", 4518330, "Wellington", Arrays.asList("english", "maori")),
            new Country("United States", 317706000, "Washington", Collections.singletonList("english"))
    );

    public Country findByName(String name) {
        return ALL_COUNTRIES.stream()
                .filter(country -> country.getName().equals(name))
                .findFirst()
                .get();
    }

    public List<Country> getAllCountriesSorted(String value) {
        if (value.equals("sortByNames")) {
           Collections.sort(ALL_COUNTRIES , (c1, c2) -> c1.getName()
                   .compareToIgnoreCase(c2.getName()));
        }
        if (value.equals("sortByCapitalCity")) {
            Collections.sort(ALL_COUNTRIES , (c1, c2) -> c1.getCapCity()
                    .compareToIgnoreCase(c2.getCapCity()));
        }
        return ALL_COUNTRIES;
    }
}
