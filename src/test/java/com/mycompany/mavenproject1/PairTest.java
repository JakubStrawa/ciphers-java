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

    /**
     * Test of getFirst method, of class Pair.
     */
    @Test
    public void testGetFirst() {
        Pair test = new Pair('a','c');
        Pair test2 = new Pair(1234, 5678);
        assertEquals('a', test.getFirst());
        assertEquals(1234, test2.getFirst());
    }

    /**
     * Test of getSecond method, of class Pair.
     */
    @Test
    public void testGetSecond() {
        Pair test = new Pair('a','c');
        Pair test2 = new Pair(1234, 5678);
        assertEquals('c', test.getSecond());
        assertEquals(5678, test2.getSecond());
    }

    /**
     * Test of setFirst method, of class Pair.
     */
    @Test
    public void testSetFirst() {
        Pair test = new Pair('b','d');
        Pair test2 = new Pair(1234, 5678);
        test.setFirst('x');
        test2.setFirst(345678);
        assertEquals('x', test.getFirst());
        assertEquals(345678, test2.getFirst());
    }

    /**
     * Test of setSecond method, of class Pair.
     */
    @Test
    public void testSetSecond() {
        Pair test = new Pair('b','d');
        Pair test2 = new Pair(1234, 5678);
        test.setSecond('q');
        test2.setSecond(987654);
        assertEquals('q', test.getSecond());
        assertEquals(987654, test2.getSecond());
    }
    
}
