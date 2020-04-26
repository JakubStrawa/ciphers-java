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
public class PairTest {
    
    public PairTest() {
    }
    Pair test = new Pair('a','c');
    Pair test2 = new Pair('b','d');

    /**
     * Test of getFirst method, of class Pair.
     */
    @Test
    public void testGetFirst() {
        assertEquals('a', test.getFirst());
    }

    /**
     * Test of getSecond method, of class Pair.
     */
    @Test
    public void testGetSecond() {
        assertEquals('c', test.getSecond());
    }

    /**
     * Test of setFirst method, of class Pair.
     */
    @Test
    public void testSetFirst() {
        test2.setFirst('x');
        assertEquals('x', test2.getFirst());
    }

    /**
     * Test of setSecond method, of class Pair.
     */
    @Test
    public void testSetSecond() {
        test2.setSecond('q');
        assertEquals('q', test2.getSecond());
    }
    
}
