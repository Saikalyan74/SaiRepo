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
      int expected=80;
      int actual=ar.sum(40, 40);
        assertEquals(expected, actual);
    }
    @Test
    public void testSumWithNegatives()
    {
     Arathematic ar=new Arathematic();
      int expected=-200;
      int actual=ar.sum(-100, -100);
        assertEquals(expected, actual);
    }
    @Test
    public void testSumWithZeros()
    {
     Arathematic ar=new Arathematic();
      int expected=0;
      int actual=ar.sum(0, 0);
        assertEquals(expected, actual);
    }
}
