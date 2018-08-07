/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewProject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class NewClassTest {
    
    public NewClassTest() {
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

    @Test
    public void testAdd() {
        System.out.println("ADDITION");
        String s1="2";
         String s2="2";
          NewClass out = new  NewClass ();
         int expResult= 4;
         int result = out.add(s1,s2);
         assertEquals(expResult,result);

       
    }
    @Test
    public void testSub() {
        System.out.println("SUBTRUCTION");
        String s1="5";
         String s2="2";
          NewClass out = new  NewClass ();
         int expResult= 3;
         int result = out.sub(s1,s2);
         assertEquals(expResult,result);

       
    }
     @Test
    public void testMul() {
        System.out.println("MULTIPLICATION");
        String s1="5";
         String s2="2";
          NewClass out = new  NewClass ();
         int expResult= 10;
         int result = out.mul(s1,s2);
         assertEquals(expResult,result);

       
    }
     @Test
    public void testDiv() {
        System.out.println("DIVIDAD");
        String s1="5";
         String s2="2";
          NewClass out = new  NewClass ();
         int expResult= (int) 2.5;
         int result = out.div(s1,s2);
         assertEquals(expResult,result);

       
    }
}
