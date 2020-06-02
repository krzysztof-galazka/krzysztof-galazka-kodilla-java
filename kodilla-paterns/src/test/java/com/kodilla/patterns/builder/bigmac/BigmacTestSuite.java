package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.patterns.builder.bigmac.IngredientsType.*;
import static com.kodilla.patterns.builder.bigmac.RollType.*;
import static com.kodilla.patterns.builder.bigmac.SauceType.*;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder(){
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .roll(ROLL)
                .burgers(3)
                .sauce(BARBECUE)
                .ingredients(BACON)
                .ingredients(CHEESE)
                .ingredients(MUSHROOMS)
                .ingredients(ONION)
                .ingredients(CUCUMBER)
                .ingredients(SALAD)
                .build();
        System.out.println(bigmac);
        //When
        RollType chooseRoll = bigmac.getRoll();
        int chooseBurgersQty = bigmac.getBurgers();
        SauceType chooseSauce = bigmac.getSauce();
        int chooseIngredientsQty = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(ROLL, chooseRoll);
        Assert.assertEquals(3, chooseBurgersQty);
        Assert.assertEquals(BARBECUE, chooseSauce);
        Assert.assertEquals(6, chooseIngredientsQty);
    }
}
