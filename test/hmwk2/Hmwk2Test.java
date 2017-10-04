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
        Scanner in = new Scanner("11 15");
        int[] expResult = new int[2];

        expResult = app.Input(in);
        assertEquals(expResult[0], 11);
        assertEquals(expResult[1], 15);
    }
    
    @Test
    public void testInRange() {
        Hmwk2 app = new Hmwk2();
        assertEquals(false,app.inRange(-1001));
        assertEquals(true,app.inRange(-1000));
        assertEquals(true,app.inRange(1000));
        assertEquals(false,app.inRange(1001));
        assertEquals(true,app.inRange(100));
    }  
    
    @Test
    public void testIsLessThan() {
        Hmwk2 app = new Hmwk2();
        assertEquals(false,app.isLessThan(4, 3));
        assertEquals(true,app.isLessThan(11, 15));
    } 
    
    @Test
    public void testDoMath()
    {
        Hmwk2 app = new Hmwk2();
        int r1, r2, s;
        r1 = 4;
        s = 3;
        r2 = 2;
        
        assertEquals(r2, app.doMath(r1, s));
       
    }
}
