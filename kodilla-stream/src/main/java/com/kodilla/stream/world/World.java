package com.kodilla.stream.world;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World implements CitizensQuantity {
    private final List<Contintent> wholeWorld = new ArrayList<>();

    public List<Contintent> addWorldPeoples(Contintent contintent) {
        wholeWorld.add(contintent);
        return wholeWorld;
    }

    public List<Contintent> getWholeWorld() {
        return wholeWorld;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal totalWordPeople = wholeWorld.stream()
                .flatMap(c -> c.getContintentName().stream())
                .map(CitizensQuantity::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalWordPeople;

    }

}