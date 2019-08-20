package com.qa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class App2Test {

    private App2 app = new App2();

    @Test
    public void calculatorTest(){
        assertEquals(21,app.calculator(7,3,"*"));
        assertEquals(3,app.calculator(15,5,"/"));
        assertEquals(32,app.calculator(15,17,"+"));
        assertEquals(9,app.calculator(27,18,"-"));
        assertEquals(0,app.calculator(0,12,"/"));
        assertEquals(0,app.calculator(23,34,"r"));


    }

}
