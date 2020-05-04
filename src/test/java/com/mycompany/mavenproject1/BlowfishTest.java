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
public class BlowfishTest {
    
    public BlowfishTest() {
    }

    /**
     * Test of getMessageList method, of class Blowfish.
     */
    @Test
    public void testGetMessageList() {
        Blowfish blowfish = new Blowfish("abcdefgh", "12345678", false);
        blowfish.encryptMessage();
        assertEquals("abcdefgh", blowfish.getMessageList());
    }

    /**
     * Test of getEncodedList method, of class Blowfish.
     */
    @Test
    public void testGetEncodedList() {
        Blowfish blowfish = new Blowfish("abcd", "12345678", false);
        blowfish.encryptMessage();
        assertEquals("鼚쪀ꗰ랯", blowfish.getEncodedList());
    }

    /**
     * Test of getCharList method, of class Blowfish.
     */
    @Test
    public void testGetCharList() {
        Blowfish blowfish = new Blowfish("abcd", "12345678", false);
        blowfish.encryptMessage();
        assertEquals("40730, 51840, 42480, 47023", blowfish.getCharList());
    }

    /**
     * Test of getBinaryList method, of class Blowfish.
     */
    @Test
    public void testGetBinaryList() {
        Blowfish blowfish = new Blowfish("abcd", "12345678", false);
        blowfish.encryptMessage();
        assertEquals("1001111100011010110010101000000010100101111100001011011110101111", blowfish.getBinaryList());
    }

    /**
     * Test of getHexList method, of class Blowfish.
     */
    @Test
    public void testGetHexList() {
        Blowfish blowfish = new Blowfish("abcd", "12345678", false);
        blowfish.encryptMessage();
        assertEquals("9f1aca80a5f0b7af", blowfish.getHexList());
    }

    /**
     * Test of getIsEncrypted method, of class Blowfish.
     */
    @Test
    public void testGetIsEncrypted() {
        Blowfish blowfish = new Blowfish("abcd", "12345678", false);
        assertFalse(blowfish.getIsEncrypted());
    }

    /**
     * Test of getMessage method, of class Blowfish.
     */
    @Test
    public void testGetMessage() {
        Blowfish blowfish = new Blowfish("abcd", "12345678", false);
        assertEquals("abcd", blowfish.getMessage());
    }

    /**
     * Test of getKey method, of class Blowfish.
     */
    @Test
    public void testGetKey() {
        Blowfish blowfish = new Blowfish("abcd", "12345678", false);
        assertEquals("12345678", blowfish.getKey());
    }

    /**
     * Test of setIsEncrypted method, of class Blowfish.
     */
    @Test
    public void testSetIsEncrypted() {
        Blowfish blowfish = new Blowfish("abcd", "12345678", false);
        blowfish.setIsEncrypted(true);
        assertTrue(blowfish.getIsEncrypted());
    }

    /**
     * Test of setMessage method, of class Blowfish.
     */
    @Test
    public void testSetMessage() {
        Blowfish blowfish = new Blowfish("abcd", "12345678", false);
        blowfish.setMessage("AFgh");
        assertEquals("AFgh", blowfish.getMessage());
    }

    /**
     * Test of setKey method, of class Blowfish.
     */
    @Test
    public void testSetKey() {
        Blowfish blowfish = new Blowfish("abcd", "12345678", false);
        blowfish.setKey("!@#$%^");
        assertEquals("!@#$%^", blowfish.getKey());
    }

    /**
     * Test of encryptMessage method, of class Blowfish.
     */
    @Test
    public void testEncryptMessage() {
        Blowfish blowfish = new Blowfish("abcd", "12345678", false);
        blowfish.encryptMessage();
        assertEquals("9f1aca80a5f0b7af", blowfish.getHexList());
        assertEquals("1001111100011010110010101000000010100101111100001011011110101111", blowfish.getBinaryList());
    }

    /**
     * Test of decryptMessage method, of class Blowfish.
     */
    @Test
    public void testDecryptMessage() {
        Blowfish blowfish = new Blowfish("鼚쪀ꗰ랯", "12345678", true);
        blowfish.decryptMessage();
        assertEquals("61626364", blowfish.getHexList());
        assertEquals("0000000001100001000000000110001000000000011000110000000001100100", blowfish.getBinaryList());
    }
    
}
