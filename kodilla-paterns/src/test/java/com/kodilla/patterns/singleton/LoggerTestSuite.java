package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void newLog() {
        Logger.getInstance().log("Last log!");
    }

    @Test
    public void testNewLog(){
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Last log!",lastLog);
    }
}
