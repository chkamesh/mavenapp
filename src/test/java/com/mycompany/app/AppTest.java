package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void simpleTest(){
    	System.out.println(":::::::::::::::::::Simple Test:::::::::::::::::::");
    	
    	assertTrue("simpleTest  :::::::::::",true==true);
    	
    }
    
    @Test
    public void simpleTestF(){
    	System.out.println(":::::::::::::::::::Simple Test F:::::::::::::::::::");
    	
    	assertTrue("simpleTestF  :::::::::::",true==true);
    	
    }
}
