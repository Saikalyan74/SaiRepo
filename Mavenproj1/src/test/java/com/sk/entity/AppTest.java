package com.sk.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private static Arathematic ar;
    
    @Test
    public void testSumWithpositives()
    {
     Arathematic ar=new Arathematic();
      int expected=30;
      int actual=ar.sum(10, 20);
        assertEquals(expected, actual);
    }
}
