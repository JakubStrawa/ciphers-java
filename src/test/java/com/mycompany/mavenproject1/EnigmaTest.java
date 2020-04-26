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
public class EnigmaTest {
    
    public EnigmaTest() {
    }
    Enigma enigma = new Enigma("testmessage");
    Enigma enigma2 = new Enigma("testmessage");
    /**
     * Test of addToPlugBoard method, of class Enigma.
     */
    @Test
    public void testAddToPlugBoard_String() {
        String str = "ab cd ef l   ";
        enigma.addToPlugBoard(str);
        assertEquals(3, enigma.getPlugBoard().size());
        assertEquals('a', enigma.getPlugBoard().get(0).getFirst());
        assertEquals('b', enigma.getPlugBoard().get(0).getSecond());
        enigma.clearPlugBoard();
    }

    /**
     * Test of addToPlugBoard method, of class Enigma.
     */
    @Test
    public void testAddToPlugBoard_char_char() {
        
        enigma.addToPlugBoard('a', 'b');
        enigma.addToPlugBoard('e', 'q');
        enigma.addToPlugBoard('a', 'z');
        assertEquals(2, enigma.getPlugBoard().size());
        assertEquals('e', enigma.getPlugBoard().get(0).getFirst());
        assertEquals('q', enigma.getPlugBoard().get(0).getSecond());
        enigma.addToPlugBoard('h', 'o');
        enigma.addToPlugBoard('r', 'e');
        assertEquals(3, enigma.getPlugBoard().size());
        assertEquals('a', enigma.getPlugBoard().get(0).getFirst());
        assertEquals('z', enigma.getPlugBoard().get(0).getSecond());
        enigma.clearPlugBoard();
    }

    /**
     * Test of clearPlugBoard method, of class Enigma.
     */
    @Test
    public void testClearPlugBoard() {
        String str = "ab cd ef l   ";
        enigma.addToPlugBoard(str);
        enigma.clearPlugBoard();
        assertTrue(enigma.getPlugBoard().isEmpty());
    }

    /**
     * Test of clearRotorList method, of class Enigma.
     */
    @Test
    public void testClearRotorList() {
        enigma.addRotor(2);
        enigma.addRotor(1);
        enigma.addRotor(5);
        enigma.clearRotorList();
        assertTrue(enigma.getRotorList().isEmpty());
    }

    /**
     * Test of getRotorList method, of class Enigma.
     */
    @Test
    public void testGetRotorList() {
        enigma.addRotor(2);
        enigma.addRotor(1);
        enigma.addRotor(5);
        assertEquals(3, enigma.getRotorList().size());
        assertEquals(1, enigma.getRotorList().get(1).getNumber());
        enigma.clearRotorList();
    }

    /**
     * Test of getPlugBoard method, of class Enigma.
     */
    @Test
    public void testGetPlugBoard() {
        enigma.addToPlugBoard('a', 'b');
        enigma.addToPlugBoard('e', 'q');
        enigma.addToPlugBoard('f', 'z');
        assertEquals(3, enigma.getPlugBoard().size());
        assertEquals('f', enigma.getPlugBoard().get(2).getFirst());
        assertEquals('z', enigma.getPlugBoard().get(2).getSecond());
        enigma.clearPlugBoard();
    }

    /**
     * Test of getRotor method, of class Enigma.
     */
    @Test
    public void testGetRotor() {
        enigma.addRotor(1);
        enigma.addRotor(2);
        enigma.addRotor(3);
        assertEquals(1, enigma.getRotor(1).getNumber());
        assertTrue(enigma.getRotor(2).getIsUsed());
        assertEquals(3, enigma.getRotorList().size());
        assertEquals(3, enigma.getRotorList().get(2).getNumber());
        enigma.clearRotorList();
    }

    /**
     * Test of addRotor method, of class Enigma.
     */
    @Test
    public void testAddRotor() {
        enigma.addRotor(1);
        enigma.addRotor(2);
        enigma.addRotor(3);
        assertEquals(3, enigma.getRotorList().size());
        enigma.clearRotorList();
    }

    /**
     * Test of getMessage method, of class Enigma.
     */
    @Test
    public void testGetMessage() {
        enigma.setMessage("this is a test");
        assertEquals("this is a test", enigma.getMessage());
    }

    /**
     * Test of setMessage method, of class Enigma.
     */
    @Test
    public void testSetMessage() {
        enigma.setMessage("this is a second test");
        assertEquals("this is a second test", enigma.getMessage());
    }

    /**
     * Test of moveRotors method, of class Enigma.
     */
    @Test
    public void testMoveRotors() {
        enigma.addRotor(1);
        enigma.addRotor(2);
        enigma.addRotor(3);
        enigma.moveRotors();
        assertEquals(2, enigma.getRotor(3).getRotatation());
        assertEquals(1, enigma.getRotor(2).getRotatation());
        for (int i = 0; i < 25; i++) {
            enigma.moveRotors();
        }
        assertEquals(2, enigma.getRotor(2).getRotatation());
        assertEquals(1, enigma.getRotor(3).getRotatation());
        enigma.clearRotorList();
    }

    /**
     * Test of setDeflector method, of class Enigma.
     */
    @Test
    public void testSetDeflector() {
        enigma.setDeflector(1);
        assertEquals(1, enigma.getDeflector());
        enigma.setDeflector(2);
        assertEquals(2, enigma.getDeflector());
    }
    
    /**
     * Test of getDeflector method, of class Enigma.
     */
    @Test
    public void testGetDeflector() {
        enigma.setDeflector(1);
        assertEquals(1, enigma.getDeflector());
        enigma.setDeflector(2);
        assertEquals(2, enigma.getDeflector());
    }

    /**
     * Test of printEnigma method, of class Enigma.
     */
    @Test
    public void testPrintEnigma() {
    }

    /**
     * Test of changeMessage method, of class Enigma.
     */
    @Test
    public void testChangeMessage() {
        enigma2.addRotor(1);
        enigma2.addRotor(2);
        enigma2.addRotor(3);
        enigma2.setDeflector(2);
        enigma2.addToPlugBoard('s', 't');
        enigma2.addToPlugBoard('m', 'a');
        enigma2.setMessage("testmessage");
        enigma2.changeMessage();
        assertEquals("pulcuvbvzii", enigma2.getMessage());
        enigma2.clearPlugBoard();
        enigma2.clearRotorList();
    }
    
}
