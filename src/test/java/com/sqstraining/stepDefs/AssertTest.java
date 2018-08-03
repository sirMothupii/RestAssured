package com.sqstraining.stepDefs;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class AssertTest
        //assertions helps with telling the framework weather a test on a test framework passed or failed
{
    @Test
    public void assertTest()
    {
        Integer i = 100;
        assertTrue(1==1);
        assertThat( i, equalTo(100));
    }
}


