/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmwk2;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jacob
 */
public class Hmwk2Test {
    
    public Hmwk2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of Input method, of class Hmwk2.
     */
    @Test
    public void testInput_Scanner() {
        Hmwk2 app = new Hmwk2();
        Scanner in = new Scanner("32");
        
        int expResult = 32;
        int result = app.Input(in);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInRange() {
        Hmwk2 app = new Hmwk2();
        assertEquals(false,app.inRange(0));
        assertEquals(true,app.inRange(1));
        assertEquals(true,app.inRange(100));
        assertEquals(false,app.inRange(101));
        assertEquals(true,app.inRange(32));
    }
    
    @Test
    public void testMessage() {
        Hmwk2 app = new Hmwk2();
        assertEquals("1 Abracadabra"+ System.lineSeparator(), app.message(1));
        assertEquals("2 Abracadabra" + System.lineSeparator()
                +"2 Abracadabra"+ System.lineSeparator() , 
                app.message(2));
    }    
}
