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
    
    /**
     * Test of addToPlugBoard method, of class Enigma.
     */
    @Test
    public void testAddToPlugBoard_String() {
        Enigma enigma = new Enigma("testmessage");
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
        Enigma enigma = new Enigma("testmessage");
        
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
        Enigma enigma = new Enigma("testmessage");
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
        Enigma enigma = new Enigma("testmessage");
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
        Enigma enigma = new Enigma("testmessage");
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
        Enigma enigma = new Enigma("testmessage");
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
        Enigma enigma = new Enigma("testmessage");
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
        Enigma enigma = new Enigma("testmessage");
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
        Enigma enigma = new Enigma("testmessage");
        enigma.setMessage("this is a test");
        assertEquals("this is a test", enigma.getMessage());
    }

    /**
     * Test of setMessage method, of class Enigma.
     */
    @Test
    public void testSetMessage() {
        Enigma enigma = new Enigma("testmessage");
        enigma.setMessage("this is a second test");
        assertEquals("this is a second test", enigma.getMessage());
    }

    /**
     * Test of moveRotors method, of class Enigma.
     */
    @Test
    public void testMoveRotors() {
        Enigma enigma = new Enigma("testmessage");
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
        Enigma enigma = new Enigma("testmessage");
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
        Enigma enigma = new Enigma("testmessage");
        enigma.setDeflector(1);
        assertEquals(1, enigma.getDeflector());
        enigma.setDeflector(2);
        assertEquals(2, enigma.getDeflector());
    }

    /**
     * Test of changeMessage method, of class Enigma.
     */
    @Test
    public void testChangeMessage() {
        Enigma enigma = new Enigma("testmessage");
        enigma.addRotor(1);
        enigma.addRotor(2);
        enigma.addRotor(3);
        enigma.setDeflector(2);
        enigma.addToPlugBoard('s', 't');
        enigma.addToPlugBoard('m', 'a');
        enigma.setMessage("testmessage");
        enigma.changeMessage();
        assertEquals("pulcuvbvzii", enigma.getMessage());
        enigma.clearPlugBoard();
        enigma.clearRotorList();
    }
    
}
