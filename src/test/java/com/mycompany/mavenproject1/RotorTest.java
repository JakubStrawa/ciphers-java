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
public class RotorTest {
    
    public RotorTest() {
    }
    char [] tab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    Rotor test = new Rotor(tab);

    /**
     * Test of rotate method, of class Rotor.
     */
    @Test
    public void testRotate() {
        test.rotate();
        assertEquals(test.getRotate(), 2);
    }

    /**
     * Test of getRotate method, of class Rotor.
     */
    @Test
    public void testGetRotate() {
        test.rotate();
        assertEquals(test.getRotate(), 3);
        for (int i = 0; i < 24; i++) {
            test.rotate();
        }
        assertEquals(test.getRotate(), 1);
    }

    /**
     * Test of getChar method, of class Rotor.
     */
    @Test
    public void testGetChar() {
        assertEquals(test.getChar(0), 'a');
        assertEquals(test.getChar(25), 'z');
    }
    
}
