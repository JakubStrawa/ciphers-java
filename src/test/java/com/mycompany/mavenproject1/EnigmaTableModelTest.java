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
public class EnigmaTableModelTest {
    
    public EnigmaTableModelTest() {
    }

    /**
     * Test of setFlag method, of class EnigmaTableModel.
     */
    @Test
    public void testSetFlag() {
        EnigmaTableModel enigma = new EnigmaTableModel();
        assertFalse(enigma.getFlag());
        enigma.setFlag(true);
        assertTrue(enigma.getFlag());
    }

    /**
     * Test of setRotors method, of class EnigmaTableModel.
     */
    @Test
    public void testSetRotors() {
        EnigmaModel enigma = new EnigmaModel();
        EnigmaTableModel enigmaTable = new EnigmaTableModel();
        enigma.addRotor(1);
        enigma.addRotor(2);
        enigma.addRotor(3);
        enigmaTable.setRotors(enigma.getRotorList());
        assertEquals(1, enigmaTable.getRotors().get(0).getRotatation());
        assertTrue(enigmaTable.getRotors().get(2).getIsUsed());
        assertEquals(3, enigmaTable.getRotors().size());
        assertEquals(3, enigmaTable.getRotors().get(2).getNumber());
    }

    /**
     * Test of setPlugboard method, of class EnigmaTableModel.
     */
    @Test
    public void testSetPlugboard() {
        EnigmaModel enigma = new EnigmaModel();
        EnigmaTableModel enigmaTable = new EnigmaTableModel();
        enigma.setMessage("testmessage");
        enigma.addToPlugBoard('a', 'b');
        enigma.addToPlugBoard('e', 'q');
        enigma.addToPlugBoard('f', 'z');
        enigmaTable.setPlugboard(enigma.getPlugBoard());
        assertEquals(3, enigmaTable.getPlugBoard().size());
        assertEquals('f', enigmaTable.getPlugBoard().get(2).getFirst());
        assertEquals('z', enigmaTable.getPlugBoard().get(2).getSecond());
        
    }

    /**
     * Test of getFlag method, of class EnigmaTableModel.
     */
    @Test
    public void testGetFlag() {
        EnigmaTableModel enigma = new EnigmaTableModel();
        assertFalse(enigma.getFlag());
        enigma.setFlag(true);
        assertTrue(enigma.getFlag());
        enigma.setFlag(false);
        assertFalse(enigma.getFlag());
    }

    /**
     * Test of getRotors method, of class EnigmaTableModel.
     */
    @Test
    public void testGetRotors() {
        EnigmaModel enigma = new EnigmaModel();
        EnigmaTableModel enigmaTable = new EnigmaTableModel();
        enigma.addRotor(1);
        enigma.addRotor(2);
        enigma.addRotor(3);
        enigmaTable.setRotors(enigma.getRotorList());
        assertEquals(1, enigmaTable.getRotors().get(0).getRotatation());
        assertTrue(enigmaTable.getRotors().get(2).getIsUsed());
        assertEquals(3, enigmaTable.getRotors().size());
        assertEquals(3, enigmaTable.getRotors().get(2).getNumber());
    }

    /**
     * Test of getPlugBoard method, of class EnigmaTableModel.
     */
    @Test
    public void testGetPlugboard() {
        EnigmaModel enigma = new EnigmaModel();
        EnigmaTableModel enigmaTable = new EnigmaTableModel();
        enigma.setMessage("testmessage");
        enigma.addToPlugBoard('a', 'b');
        enigma.addToPlugBoard('e', 'q');
        enigma.addToPlugBoard('q', 'a');
        enigmaTable.setPlugboard(enigma.getPlugBoard());
        assertEquals(1, enigmaTable.getPlugBoard().size());
        assertEquals('q', enigmaTable.getPlugBoard().get(0).getFirst());
        assertEquals('a', enigmaTable.getPlugBoard().get(0).getSecond());
    }
    
}
