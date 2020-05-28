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
public class CaesarModelTest {
    
    public CaesarModelTest() {
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
     * Test of getKey method, of class CaesarModel.
     */
    @Test
    public void testGetKey(){
        CaesarModel kod = new CaesarModel();
        assertEquals(0, kod.getKey());
        kod.setKey(5);
        assertEquals(5, kod.getKey());
    }
    /**
     * Test of setKey method, of class CaesarModel.
     */
    @Test
    public void testSetKey(){
        CaesarModel kod = new CaesarModel();
        kod.setKey(15);
        assertEquals(15, kod.getKey());
    }
    /**
     * Test of getIsEncrypted method, of class CaesarModel.
     */
    @Test
    public void testGetIsEncrypted(){
        CaesarModel kod2 = new CaesarModel();
        kod2.setIsEncrypted(true);
        assertEquals(true, kod2.getIsEncrypted());
    }
    /**
     * Test of setIsEncrypted method, of class CaesarModel.
     */
    @Test
    public void testSetIsEncrypted(){
        CaesarModel kod2 = new CaesarModel();
        kod2.setIsEncrypted(false);
        assertEquals(false, kod2.getIsEncrypted());
    }
    /**
     * Test of getMessage method, of class CaesarModel.
     */
    @Test
    public void testGetMessage(){
        String test = "  abcdefghijklmnopqrstxyz";
        String test2 = "abcdefghijklmnopqrstxyz";
        CaesarModel kod2 = new CaesarModel();
        kod2.setMessage(test.trim());
        assertEquals(test2, kod2.getMessage());
    }
    /**
     * Test of setMessage method, of class CaesarModel.
     */
    @Test
    public void testSetMessage(){
        String test2 = "abcdefghijklmnopqrstxyz";
        CaesarModel kod2 = new CaesarModel();
        assertEquals("", kod2.getMessage());
        kod2.setMessage(test2);
        assertEquals(test2, kod2.getMessage());
    }
    /**
     * Test of changeMessage method, of class CaesarModel.
     */
    @Test
    public void testChangeMessage(){
        String test3 = "efgh";
        CaesarModel kod3 = new CaesarModel();
        kod3.setKey(4);
        kod3.setMessage(test3);
        kod3.changeMessage();
        assertEquals("ijkl", kod3.getMessage());
        kod3.changeMessage();
        assertEquals("efgh", kod3.getMessage());
        
        CaesarModel kod4 = new CaesarModel();
        kod4.setKey(-2);
        kod4.setMessage("fgHI34 jk");
        kod4.changeMessage();
        assertEquals("defg34 hi", kod4.getMessage());
        kod4.changeMessage();
        assertEquals("fghi34 jk", kod4.getMessage());
    }    
     /**
     * Test of getFlagNextStep method, of class CaesarModel.
     */
    @Test
    public void testGetFlagNextStep(){
        CaesarModel kod = new CaesarModel();
        assertFalse(kod.getFlagNextStep());
        kod.setFlagNextStep(true);
        assertTrue(kod.getFlagNextStep());
    }
    /**
     * Test of setFlagNextStep method, of class CaesarModel.
     */
    @Test    
    public void testSetFlagNextStep(){
        CaesarModel kod = new CaesarModel();
        kod.setFlagNextStep(true);
        assertTrue(kod.getFlagNextStep());
        kod.setFlagNextStep(false);
        assertFalse(kod.getFlagNextStep());
    }
    /**
     * Test of getSBSFlag method, of class CaesarModel.
     */
    @Test    
    public void testGetSBSFlag(){
        CaesarModel kod = new CaesarModel();
        assertFalse(kod.getSBSFlag());
        kod.setSBSFlag(true);
        assertTrue(kod.getSBSFlag());
    }
    /**
     * Test of setSBSFlag method, of class CaesarModel.
     */
    @Test    
    public void testSetSBSFlag(){
        CaesarModel kod = new CaesarModel();
        kod.setSBSFlag(true);
        assertTrue(kod.getSBSFlag());
        kod.setSBSFlag(false);
        assertFalse(kod.getSBSFlag());
    }
    /**
     * Test of changeChar method, of class CaesarModel.
     */
    @Test    
    public void testChangeChar(){
        CaesarModel kod = new CaesarModel();
        CaesarModel kod2 = new CaesarModel();
        kod.setIsEncrypted(false);
        kod2.setIsEncrypted(true);
        kod.setKey(5);
        kod2.setKey(5);
        kod.setMessage("k");
        kod2.setMessage("k");
        assertEquals("k", kod.getMessage());
        assertEquals("k", kod2.getMessage());
        kod.changeMessage();
        kod2.changeMessage();
        assertEquals("p", kod.getMessage());
        assertEquals("f", kod2.getMessage());
    }
    /**
     * Test of changeMessageStep method, of class CaesarModel.
     */
    @Test
    public void testChangeMessageStep(){
        CaesarModel kod = new CaesarModel();
        kod.setIsEncrypted(false);
        kod.setKey(3);
        kod.setMessage("abcdefghijkl");
        kod.changeMessageStep();
        assertEquals("dbcdefghijkl", kod.getMessage());
        kod.changeMessageStep();
        assertEquals("decdefghijkl", kod.getMessage());
        kod.changeMessageStep();
        kod.changeMessageStep();
        assertEquals("defgefghijkl", kod.getMessage());
    }
}
