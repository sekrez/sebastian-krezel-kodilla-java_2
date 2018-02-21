package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;


public final class Country implements CitizensQuantity {
    private final String countryName;
    private final String citizenQuantity;

    public Country(String countryName, String citizenQuantity) {
        this.countryName = countryName;
        this.citizenQuantity = citizenQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return Objects.equals(getCountryName(), country.getCountryName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCountryName());
    }

    @Override
    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = new BigDecimal(citizenQuantity);
        return peopleQuantity;
    }
}