package com.kodilla.stream.world;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WolrdTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //Given
        Country poland = new Country("Poland", "38251251");
        Country czech = new Country("Czech Republic", "38251251");
        Country germany = new Country("Germany", "38251251");
        Country italy = new Country("Italy", "38251251");

        Country rosija = new Country("Rosija", "38251251");
        Country china = new Country("China", "38251251");
        Country india = new Country("India", "38251251");
        Country kazakhstan = new Country("Kazakhstan", "38251251");
        Country vietnam = new Country("Vietnam", "38251251");

        Country usa = new Country("U.S.A.", "38251251");
        Country canada = new Country("Canada", "38251251");
        Country mexico = new Country("Mexico", "38251251");
        Country guatemala = new Country("Guatemala", "38251251");

        Country colombia = new Country("Colombia", "38251251");
        Country venezuela = new Country("Venezuela", "38251251");
        Country brazil = new Country("Brazil", "38251251");
        Country argentina = new Country("Argentina", "38251251");

        Country algeria = new Country("Algeria", "38251251");
        Country egypt = new Country("Egypt", "38251251");
        Country sudan = new Country("Sudan", "38251251");
        Country somalia = new Country("Somalia", "38251251");
        Country madagascar = new Country("Madagascar", "38251251");

        Contintent europe = new Contintent();
        Contintent asia = new Contintent();
        Contintent southAmerika = new Contintent();
        Contintent norhtAmerika = new Contintent();
        Contintent africa = new Contintent();

        //When

        europe.addCitizensToContinetnt(poland);
        europe.addCitizensToContinetnt(czech);
        europe.addCitizensToContinetnt(germany);
        europe.addCitizensToContinetnt(italy);

        asia.addCitizensToContinetnt(rosija);
        asia.addCitizensToContinetnt(china);
        asia.addCitizensToContinetnt(india);
        asia.addCitizensToContinetnt(kazakhstan);
        asia.addCitizensToContinetnt(vietnam);

        southAmerika.addCitizensToContinetnt(usa);
        southAmerika.addCitizensToContinetnt(canada);
        southAmerika.addCitizensToContinetnt(mexico);
        southAmerika.addCitizensToContinetnt(guatemala);

        norhtAmerika.addCitizensToContinetnt(colombia);
        norhtAmerika.addCitizensToContinetnt(venezuela);
        norhtAmerika.addCitizensToContinetnt(brazil);
        norhtAmerika.addCitizensToContinetnt(argentina);

        africa.addCitizensToContinetnt(algeria);
        africa.addCitizensToContinetnt(egypt);
        africa.addCitizensToContinetnt(sudan);
        africa.addCitizensToContinetnt(somalia);
        africa.addCitizensToContinetnt(madagascar);

        World theWorld = new World();
        theWorld.addContinentsCitizens(europe);
        theWorld.addContinentsCitizens(asia);
        theWorld.addContinentsCitizens(southAmerika);
        theWorld.addContinentsCitizens(norhtAmerika);
        theWorld.addContinentsCitizens(africa);

        int countriesQuantity = europe.getContintentName().size() + asia.getContintentName().size() +
                southAmerika.getContintentName().size() + norhtAmerika.getContintentName().size() + africa
                .getContintentName().size();

        //Then
        //Contryies quantity
        Assert.assertEquals(22,countriesQuantity);
        //Cintinent quantity
        Assert.assertEquals(5, theWorld.getWholeWorld().size());
        BigDecimal expectedWorldPeopleQuantity = new BigDecimal("841527522");
        Assert.assertEquals(expectedWorldPeopleQuantity, theWorld.getPeopleQuantity());
    }

}


