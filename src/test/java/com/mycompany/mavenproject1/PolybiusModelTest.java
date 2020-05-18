/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kuba
 */
public class PolybiusModelTest {
    
    public PolybiusModelTest() {
    }

    /**
     * Test of getMessage method, of class PolybiusModel.
     */
    @Test
    public void testGetMessage() {
        PolybiusModel pol = new PolybiusModel();
        pol.setIsEncrypted(true);
        pol.setMessage("   11 12 13 14 15 21 22 23 24");
        PolybiusModel pol2 = new PolybiusModel();
        pol2.setIsEncrypted(false);
        pol2.setMessage("helloworld");
        assertEquals("helloworld", pol2.getMessage());
        assertEquals("11 12 13 14 15 21 22 23 24", pol.getMessage());
    }

    /**
     * Test of getIsEncrypted method, of class PolybiusModel.
     */
    @Test
    public void testGetIsEncrypted() {
        PolybiusModel pol = new PolybiusModel();
        pol.setIsEncrypted(true);
        PolybiusModel pol2 = new PolybiusModel();
        pol2.setIsEncrypted(false);
        assertTrue(pol.getIsEncrypted());
        assertFalse(pol2.getIsEncrypted());
    }

    /**
     * Test of getTable method, of class PolybiusModel.
     */
    @Test
    public void testGetTable() {
        Character [] table = {'x','y','z','a','b','c','d','e','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w'};
        PolybiusModel pol = new PolybiusModel();
        pol.setTable("xyz");
        assertArrayEquals(table, pol.getTable());
    }

    /**
     * Test of setMessage method, of class PolybiusModel.
     */
    @Test
    public void testSetMessage() {
        PolybiusModel pol = new PolybiusModel();
        PolybiusModel pol2 = new PolybiusModel();
        pol.setMessage("teststring");
        pol2.setMessage("abcdefg");
        assertEquals("abcdefg", pol2.getMessage());
        assertEquals("teststring", pol.getMessage());
    }

    /**
     * Test of setIsEncrypted method, of class PolybiusModel.
     */
    @Test
    public void testSetIsEncrypted() {
        PolybiusModel pol = new PolybiusModel();
        PolybiusModel pol2 = new PolybiusModel();
        pol.setIsEncrypted(false);
        pol2.setIsEncrypted(true);
        assertTrue(pol2.getIsEncrypted());
        assertFalse(pol.getIsEncrypted());
    }

    /**
     * Test of setTable method, of class PolybiusModel.
     */
    @Test
    public void testSetTable() {
        Character [] table = {'x','y','z','d','e','a','b','c','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w'};
        PolybiusModel pol = new PolybiusModel();
        pol.setTable("xyzde");
        assertArrayEquals(table, pol.getTable());
    }
    
    /**
     * Test of changeMessage method, of class PolybiusModel.
     */
    @Test
    public void testChangeMessage() {
        PolybiusModel pol = new PolybiusModel();
        pol.setIsEncrypted(true);
        pol.setMessage("   11 12 13 14 15 21 22 23 24");
        pol.setTable("kopia");
        PolybiusModel pol2 = new PolybiusModel();
        pol2.setIsEncrypted(false);
        pol2.setMessage("helloworld");
        pol2.setTable("defjam");
        PolybiusModel pol3 = new PolybiusModel();
        pol3.setIsEncrypted(false);
        pol3.setMessage("test string");
        pol3.setTable("xyz");
        pol.changeMessage();
        pol2.changeMessage();
        pol3.changeMessage();
        assertEquals(pol.getMessage(), "kopiabcde");
        assertEquals(pol2.getMessage(), "25 12 32 32 34 52 34 42 32 11");
        assertEquals(pol3.getMessage(), "52 23 51 52 51 52 45 32 41 25");
    }
    
}
