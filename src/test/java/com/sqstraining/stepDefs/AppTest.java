package com.sqstraining.stepDefs;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test//@test is an annotation
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void showMessage()
    {
        System.out.println("this is my test");
    }
}
