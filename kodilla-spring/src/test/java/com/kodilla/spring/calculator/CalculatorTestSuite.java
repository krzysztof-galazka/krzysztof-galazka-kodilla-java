package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testAdd() {
        //given
        double a = 10.0;
        double b = 5.0;

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double result = calculator.add(a, b);

        //then
        Assert.assertEquals(15, result, 0);
    }

    @Test
    public void testMul() {
        //given
        double a = 10.0;
        double b = 5.0;

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double result = calculator.mul(a, b);

        //then
        Assert.assertEquals(50, result, 0);
    }

    @Test
    public void testDiv() {
        //given
        double a = 10.0;
        double b = 5.0;

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double result = calculator.div(a, b);

        //then
        Assert.assertEquals(2, result, 0);
    }

    @Test
    public void testSub() {
        //given
        double a = 10.0;
        double b = 5.0;

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double result = calculator.sub(a, b);

        //then
        Assert.assertEquals(5, result, 0);
    }

}
