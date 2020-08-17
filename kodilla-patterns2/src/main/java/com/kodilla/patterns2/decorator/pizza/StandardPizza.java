package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class StandardPizza implements PizzaOrder{
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(20);
    }

    @Override
    public String getDescription() {
        return "Standard pizza, with sauce and cheese";
    }
}
