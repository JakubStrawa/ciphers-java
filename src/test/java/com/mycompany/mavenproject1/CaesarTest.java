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
public class CaesarTest {
    
    public CaesarTest() {
    }
    
    /**
     * Test of trim method.
     */
    @Test
    public void testTrim(){
        String test2 = "abcdefghijklmnopqrstxyz";
        String test = "  abcdefghijklmnopqrstxyz";
        assertEquals(test2, test.trim());
    }
    /**
     * Test of getKey method, of class Caesar.
     */
    @Test
    public void testGetKey(){
        String test = "  abcdefghijklmnopqrstxyz";
        Caesar kod = new Caesar(5, test.trim(),false);
        kod.setKey(5);
        assertEquals(5, kod.getKey());
    }
    /**
     * Test of setKey method, of class Caesar.
     */
    @Test
    public void testSetKey(){
        String test = "  abcdefghijklmnopqrstxyz";
        Caesar kod = new Caesar(5, test.trim(),false);
        kod.setKey(15);
        assertEquals(15, kod.getKey());
    }
    /**
     * Test of getIsEncrypted method, of class Caesar.
     */
    @Test
    public void testGetIsEncrypted(){
        String test2 = "abcdefghijklmnopqrstxyz";
        Caesar kod2 = new Caesar(-3, test2.trim(), true);
        kod2.setIsEncrypted(true);
        assertEquals(true, kod2.getIsEncrypted());
    }
    /**
     * Test of setIsEncrypted method, of class Caesar.
     */
    @Test
    public void testSetIsEncrypted(){
        String test2 = "abcdefghijklmnopqrstxyz";
        Caesar kod2 = new Caesar(-3, test2.trim(), true);
        kod2.setIsEncrypted(false);
        assertEquals(false, kod2.getIsEncrypted());
    }
    /**
     * Test of getMessage method, of class Caesar.
     */
    @Test
    public void testGetMessage(){
        String test = "  abcdefghijklmnopqrstxyz";
        String test2 = "abcdefghijklmnopqrstxyz";
        Caesar kod2 = new Caesar(-3, test2.trim(), true);
        kod2.setMessage(test.trim());
        assertEquals(test2, kod2.getMessage());
    }
    /**
     * Test of setMessage method, of class Caesar.
     */
    @Test
    public void testSetMessage(){
        String test2 = "abcdefghijklmnopqrstxyz";
        Caesar kod2 = new Caesar(-3, test2.trim(), true);
        kod2.setMessage(test2);
        assertEquals(test2, kod2.getMessage());
    }
    /**
     * Test of changeMessage method, of class Caesar.
     */
    @Test
    public void testChangeMessage(){
        String test3 = "efgh";
        Caesar kod3 = new Caesar(4, test3, false);
        kod3.changeMessage();
        assertEquals("ijkl", kod3.getMessage());
        kod3.changeMessage();
        assertEquals("efgh", kod3.getMessage());
        
        Caesar kod4 = new Caesar(-2, "fgHI34 jk", false);
        kod4.changeMessage();
        assertEquals("defg34 hi", kod4.getMessage());
        kod4.changeMessage();
        assertEquals("fghi34 jk", kod4.getMessage());
    }    
}
