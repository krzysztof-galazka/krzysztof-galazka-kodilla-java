package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;
import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testCreatePizzaWithAllAdsGetCost(){
        //Given
        PizzaOrder order = new StandardPizza();
        order = new CheeseDecorator(order);
        order = new HamDecorator(order);
        order = new ProsciuttoDecorator(order);
        System.out.println("Price: "+order.getCost());
        //When
        BigDecimal cost = order.getCost();
        //Then
        assertEquals(new BigDecimal(33),cost);
    }

    @Test
    public void testCreatePizzaWithAllAdsGetDescription(){
        //Given
        PizzaOrder order = new StandardPizza();
        order = new CheeseDecorator(order);
        order = new HamDecorator(order);
        order = new ProsciuttoDecorator(order);
        System.out.println("Description: "+order.getDescription());
        //When
        String description = order.getDescription();
        //Then
        assertEquals("Standard pizza, with sauce and cheese + extra cheese + ham + prosciutto" , description);
    }
}
