package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        //user test
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //calculator test
        Calculator calculator = new Calculator();
        int addingTest = calculator.add(4,2);

        if (addingTest == 6){
            System.out.println("Adding test OK");
        } else {
            System.out.println("Error in adding");
        }

        int substractTest = calculator.substract(9,4);

        if (substractTest == 2){
            System.out.println("Substract test OK");
        } else {
            System.out.println("Error in substract");
        }
    }
}
