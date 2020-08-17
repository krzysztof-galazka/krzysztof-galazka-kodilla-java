package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ProsciuttoDecorator extends AbstractPizzaOrderDecorator{
    protected ProsciuttoDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(8));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + prosciutto";
    }
}
