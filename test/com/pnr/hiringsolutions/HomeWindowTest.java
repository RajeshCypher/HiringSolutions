/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pnr.hiringsolutions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class HomeWindowTest {
    
    public HomeWindowTest() {
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
     * Test of connect method, of class HomeWindow.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        HomeWindow instance = new HomeWindow();
        instance.connect();
        // TODO review the generated test code and remove the default call to fail.
        
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class HomeWindow.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        HomeWindow.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
