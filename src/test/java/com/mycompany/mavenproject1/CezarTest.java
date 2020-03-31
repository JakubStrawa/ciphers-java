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
public class CezarTest {
    
    public CezarTest() {
    }
    String test = "  abcdefghijklmnopqrstxyz";
    String test2 = "abcdefghijklmnopqrstxyz";
    Cezar kod = new Cezar(5, test.trim(),false); // trim deletes spaces
    Cezar kod2 = new Cezar(-3, test2.trim(), true);
    @Test
    public void trim(){
        assertEquals(test2, test.trim());
    }
    @Test
    public void testGetKey(){
        assertEquals(5, kod.getKey());
    }
    @Test
    public void testGetFlag(){
        assertEquals(true, kod2.getIsEncrypted());
    }
    @Test
    public void testGetMessage(){
        assertEquals(test2, kod2.getMessage());
    }
    @Test
    public void testCipherWork1(){
        String test3 = "efgh";
        Cezar kod3 = new Cezar(4, test3, false);
        kod3.changeMessage();
        assertEquals("ijkl", kod3.getMessage());
    }
    @Test
    public void testCipherWork2(){
        Cezar kod4 = new Cezar(-2, "fgHI34 jk", false);
        kod4.changeMessage();
        assertEquals("defg34 hi", kod4.getMessage());
    }
    /**
     * Test of getKey method, of class Cezar.
     */
    
}
