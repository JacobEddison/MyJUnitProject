package com.qa;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app;

    @Test
    public void mainTest(){
        app = new App();
        String[] input = new String[]{"a"};
        app.main(input);
    }
    @Test
    public void blackJackTest(){
        app = new App();
        assertEquals("Expected: ",21,app.blackJack(21,18));
        assertEquals("Expected: ",20,app.blackJack(20,15));
        assertEquals("Expected: ",4,app.blackJack(23,4));
        assertEquals("Expected: ",0,app.blackJack(23,24));
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
