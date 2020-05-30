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
public class BlowfishModelTest {
    
    public BlowfishModelTest() {
    }

    /**
     * Test of getMessageList method, of class BlowfishModel.
     */
    @Test
    public void testGetMessageList() {
        BlowfishModel blowfish = new BlowfishModel();
        blowfish.setMessage("abcdefgh");
        blowfish.setKey("12345678");
        blowfish.setIsEncrypted(false);
        blowfish.changeMessage();
        assertEquals("abcdefgh", blowfish.getMessageList());
    }

    /**
     * Test of getEncodedList method, of class BlowfishModel.
     */
    @Test
    public void testGetEncodedList() {
        BlowfishModel blowfish = new BlowfishModel();
        blowfish.setMessage("abcd");
        blowfish.setKey("12345678");
        blowfish.setIsEncrypted(false);
        blowfish.changeMessage();
        assertEquals("鼚쪀ꗰ랯", blowfish.getEncodedList());
    }

    /**
     * Test of getCharList method, of class BlowfishModel.
     */
    @Test
    public void testGetCharList() {
        BlowfishModel blowfish = new BlowfishModel();
        blowfish.setMessage("abcd");
        blowfish.setKey("12345678");
        blowfish.setIsEncrypted(false);
        blowfish.changeMessage();
        assertEquals("40730, 51840, 42480, 47023", blowfish.getCharList());
    }

    /**
     * Test of getBinaryList method, of class BlowfishModel.
     */
    @Test
    public void testGetBinaryList() {
        BlowfishModel blowfish = new BlowfishModel();
        blowfish.setMessage("abcd");
        blowfish.setKey("12345678");
        blowfish.setIsEncrypted(false);
        blowfish.changeMessage();
        assertEquals("1001111100011010110010101000000010100101111100001011011110101111", blowfish.getBinaryList());
    }

    /**
     * Test of getHexList method, of class BlowfishModel.
     */
    @Test
    public void testGetHexList() {
        BlowfishModel blowfish = new BlowfishModel();
        blowfish.setMessage("abcd");
        blowfish.setKey("12345678");
        blowfish.setIsEncrypted(false);
        blowfish.changeMessage();
        assertEquals("9f1aca80a5f0b7af", blowfish.getHexList());
    }

    /**
     * Test of getIsEncrypted method, of class BlowfishModel.
     */
    @Test
    public void testGetIsEncrypted() {
        BlowfishModel blowfish = new BlowfishModel();
        blowfish.setMessage("abcd");
        blowfish.setKey("12345678");
        blowfish.setIsEncrypted(false);
        assertFalse(blowfish.getIsEncrypted());
    }

    /**
     * Test of getMessage method, of class BlowfishModel.
     */
    @Test
    public void testGetMessage() {
        BlowfishModel blowfish = new BlowfishModel();
        blowfish.setMessage("abcd");
        blowfish.setKey("12345678");
        blowfish.setIsEncrypted(false);
        assertEquals("abcd", blowfish.getMessage());
    }

    /**
     * Test of getKey method, of class BlowfishModel.
     */
    @Test
    public void testGetKey() {
        BlowfishModel blowfish = new BlowfishModel();
        blowfish.setMessage("abcd");
        blowfish.setKey("12345678");
        blowfish.setIsEncrypted(false);
        assertEquals("12345678", blowfish.getKey());
    }

    /**
     * Test of setIsEncrypted method, of class BlowfishModel.
     */
    @Test
    public void testSetIsEncrypted() {
        BlowfishModel blowfish = new BlowfishModel();
        blowfish.setMessage("abcd");
        blowfish.setKey("12345678");
        blowfish.setIsEncrypted(false);
        blowfish.setIsEncrypted(true);
        assertTrue(blowfish.getIsEncrypted());
    }

    /**
     * Test of setMessage method, of class BlowfishModel.
     */
    @Test
    public void testSetMessage() {
        BlowfishModel blowfish = new BlowfishModel();
        blowfish.setMessage("abcd");
        blowfish.setKey("12345678");
        blowfish.setIsEncrypted(false);
        blowfish.setMessage("AFgh");
        assertEquals("AFgh", blowfish.getMessage());
    }

    /**
     * Test of setKey method, of class BlowfishModel.
     */
    @Test
    public void testSetKey() {
        BlowfishModel blowfish = new BlowfishModel();
        blowfish.setMessage("abcd");
        blowfish.setKey("12345678");
        blowfish.setIsEncrypted(false);
        blowfish.setKey("!@#$%^");
        assertEquals("!@#$%^", blowfish.getKey());
    }

    /**
     * Test of changeMessage method, of class BlowfishModel.
     */
    @Test
    public void testChangeMessage() {
        BlowfishModel blowfish = new BlowfishModel();
        blowfish.setMessage("abcd");
        blowfish.setKey("12345678");
        blowfish.setIsEncrypted(false);
        blowfish.changeMessage();
        assertEquals("9f1aca80a5f0b7af", blowfish.getHexList());
        assertEquals("1001111100011010110010101000000010100101111100001011011110101111", blowfish.getBinaryList());
    }

    /**
     * Test of decryptMessage method, of class BlowfishModel.
     */
    @Test
    public void testDecryptMessage() {
        BlowfishModel blowfish = new BlowfishModel();
        blowfish.setMessage("鼚쪀ꗰ랯");
        blowfish.setKey("12345678");
        blowfish.setIsEncrypted(true);
        blowfish.changeMessage();
        assertEquals("61626364", blowfish.getHexList());
        assertEquals("0000000001100001000000000110001000000000011000110000000001100100", blowfish.getBinaryList());
    }
    /**
     * Test of setFlagSBS method, of class BlowfishModel.
     */
    @Test
    public void testSetFlagSBS() {
        BlowfishModel blowfish = new BlowfishModel();
        assertFalse(blowfish.getFlagSBS());
        blowfish.setFlagSBS(true);
        assertTrue(blowfish.getFlagSBS());
    }
    /**
     * Test of setFlagNextStep method, of class BlowfishModel.
     */
    @Test
    public void testSetFlagNextStep() {
        BlowfishModel blowfish = new BlowfishModel();
        assertFalse(blowfish.getFlagNextStep());
        blowfish.setFlagNextStep(true);
        assertTrue(blowfish.getFlagNextStep());
    }
    /**
     * Test of getFlagSB method, of class BlowfishModel.
     */
    @Test
    public void testGetFlagSBS() {
        BlowfishModel blowfish = new BlowfishModel();
        assertFalse(blowfish.getFlagSBS());
        blowfish.setFlagSBS(true);
        assertTrue(blowfish.getFlagSBS());
    }
    /**
     * Test of getFlagNextStep method, of class BlowfishModel.
     */
    @Test
    public void testGetFlagNextStep() {
        BlowfishModel blowfish = new BlowfishModel();
        assertFalse(blowfish.getFlagNextStep());
        blowfish.setFlagNextStep(true);
        assertTrue(blowfish.getFlagNextStep());
    }

    
}
