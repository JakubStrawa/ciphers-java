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
public class PolybiusTest {
    
    public PolybiusTest() {
    }

    /**
     * Test of getMessage method, of class Polybius.
     */
    @Test
    public void testGetMessage() {
        Polybius pol = new Polybius("   11 12 13 14 15 21 22 23 24", true, "kopia");
        Polybius pol2 = new Polybius("helloworld", false, "defjam");
        assertEquals("helloworld", pol2.getMessage());
        assertEquals("11 12 13 14 15 21 22 23 24", pol.getMessage());
    }

    /**
     * Test of getIsEncrypted method, of class Polybius.
     */
    @Test
    public void testGetIsEncrypted() {
        Polybius pol4 = new Polybius("   11 12 13 14 15 21 22 23 24", true, "kopia");
        Polybius pol5 = new Polybius("helloworld", false, "defjam");
        assertTrue(pol4.getIsEncrypted());
        assertFalse(pol5.getIsEncrypted());
    }

    /**
     * Test of getTable method, of class Polybius.
     */
    @Test
    public void testGetTable() {
        Character [] table = {'x','y','z','a','b','c','d','e','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w'};
        Polybius pol3 = new Polybius("test string", false, "xyz");
        assertArrayEquals(table, pol3.getTable());
    }

    /**
     * Test of setMessage method, of class Polybius.
     */
    @Test
    public void testSetMessage() {
        Polybius pol = new Polybius("   11 12 13 14 15 21 22 23 24", true, "kopia");
        Polybius pol2 = new Polybius("helloworld", false, "defjam");
        pol.setMessage("teststring");
        pol2.setMessage("abcdefg");
        assertEquals("abcdefg", pol2.getMessage());
        assertEquals("teststring", pol.getMessage());
    }

    /**
     * Test of setIsEncrypted method, of class Polybius.
     */
    @Test
    public void testSetIsEncrypted() {
        Polybius pol4 = new Polybius("   11 12 13 14 15 21 22 23 24", true, "kopia");
        Polybius pol5 = new Polybius("helloworld", false, "defjam");
        pol4.setIsEncrypted(false);
        pol5.setIsEncrypted(true);
        assertTrue(pol5.getIsEncrypted());
        assertFalse(pol4.getIsEncrypted());
    }

    /**
     * Test of setTable method, of class Polybius.
     */
    @Test
    public void testSetTable() {
        Character [] table = {'x','y','z','a','b','c','d','e','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w'};
        Polybius pol3 = new Polybius("test string", false, "xyz");
        pol3.setTable("xyz");
        assertArrayEquals(table, pol3.getTable());
    }
    
    /**
     * Test of changeMessage method, of class Polybius.
     */
    @Test
    public void testChangeMessage() {
        Polybius pol = new Polybius("   11 12 13 14 15 21 22 23 24", true, "kopia");
        Polybius pol2 = new Polybius("helloworld", false, "defjam");
        Polybius pol3 = new Polybius("test string", false, "xyz");
        pol.changeMessage();
        pol2.changeMessage();
        pol3.changeMessage();
        assertEquals(pol.getMessage(), "kopiabcde");
        assertEquals(pol2.getMessage(), "25 12 32 32 34 52 34 42 32 11");
        assertEquals(pol3.getMessage(), "52 23 51 52 51 52 45 32 41 25");
    }
    
}
