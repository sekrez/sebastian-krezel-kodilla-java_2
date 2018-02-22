package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Contintent {
    private final List<Country> contintentName = new ArrayList<>();

    public List<Country> addCountryPeoples (Country country) {
        contintentName.add(country);
        return contintentName;
    }

    public List<Country> getContintentName() {
        return contintentName;
    }
}




