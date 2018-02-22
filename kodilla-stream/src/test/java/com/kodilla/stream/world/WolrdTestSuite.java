package com.kodilla.stream.world;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WolrdTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        //Given
        Country poland = new Country("Poland", "55345345345345");
        Country czech = new Country("Czech Republic", "3544523432");
        Country germany = new Country("Germany", "355632345324");
        Country italy = new Country("Italy", "888876554654654645");

        Country rosija = new Country("Rosija", "98934667231481254512");
        Country china = new Country("China", "4357743577283543825923443");
        Country india = new Country("India", "38251251");
        Country kazakhstan = new Country("Kazakhstan", "98821251");
        Country vietnam = new Country("Vietnam", "109872734234");

        Country usa = new Country("U.S.A.", "534651234534");
        Country canada = new Country("Canada", "524356623542523");
        Country mexico = new Country("Mexico", "34534623454563");
        Country guatemala = new Country("Guatemala", "993267736645");

        Country colombia = new Country("Colombia", "98636472356234");
        Country venezuela = new Country("Venezuela", "9983246561345");
        Country brazil = new Country("Brazil", "871197943523");
        Country argentina = new Country("Argentina", "899983342455");

        Country algeria = new Country("Algeria", "38251251");
        Country egypt = new Country("Egypt", "36666666");
        Country sudan = new Country("Sudan", "999992342423");
        Country somalia = new Country("Somalia", "53452223425623");
        Country madagascar = new Country("Madagascar", "231234");

        Contintent europe = new Contintent();
        Contintent asia = new Contintent();
        Contintent southAmerika = new Contintent();
        Contintent norhtAmerika = new Contintent();
        Contintent africa = new Contintent();

        //When

        europe.addCountryPeoples(poland);
        europe.addCountryPeoples(czech);
        europe.addCountryPeoples(germany);
        europe.addCountryPeoples(italy);

        asia.addCountryPeoples(rosija);
        asia.addCountryPeoples(china);
        asia.addCountryPeoples(india);
        asia.addCountryPeoples(kazakhstan);
        asia.addCountryPeoples(vietnam);

        southAmerika.addCountryPeoples(usa);
        southAmerika.addCountryPeoples(canada);
        southAmerika.addCountryPeoples(mexico);
        southAmerika.addCountryPeoples(guatemala);

        norhtAmerika.addCountryPeoples(colombia);
        norhtAmerika.addCountryPeoples(venezuela);
        norhtAmerika.addCountryPeoples(brazil);
        norhtAmerika.addCountryPeoples(argentina);

        africa.addCountryPeoples(algeria);
        africa.addCountryPeoples(egypt);
        africa.addCountryPeoples(sudan);
        africa.addCountryPeoples(somalia);
        africa.addCountryPeoples(madagascar);

        World theWorld = new World();
        theWorld.addWorldPeoples(europe);
        theWorld.addWorldPeoples(asia);
        theWorld.addWorldPeoples(southAmerika);
        theWorld.addWorldPeoples(norhtAmerika);
        theWorld.addWorldPeoples(africa);

        int countriesQuantity = europe.getContintentName().size() + asia.getContintentName().size() +
                southAmerika.getContintentName().size() + norhtAmerika.getContintentName().size() + africa
                .getContintentName().size();

        //Then
        //Contryies quantity
        Assert.assertEquals(22,countriesQuantity);
        //Continent quantity
        Assert.assertEquals(5, theWorld.getWholeWorld().size());
        BigDecimal expectedWorldPeopleQuantity = new BigDecimal("4357843401608406850942456");
        Assert.assertEquals(expectedWorldPeopleQuantity, theWorld.getPeopleQuantity());
    }

}


