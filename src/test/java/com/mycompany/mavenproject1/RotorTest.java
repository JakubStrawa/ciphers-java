/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
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
    Rotor test = new Rotor(1,tab);
    Rotor test2 = new Rotor(2,tab);
    ArrayList<Pair> testlist = new ArrayList<Pair>();
    Rotor test3 = new Rotor(3, tab);
    
    char [] rot_tab = {'x','d','a','c','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','e','f'};
    Rotor rot = new Rotor(1,tab);
 
    
    private boolean assertArrayList(ArrayList<Pair> l1, ArrayList<Pair> l2){
        if (l1.size() != l2.size()) {
            return false;
        }
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i).getFirst() != l2.get(i).getFirst()) {
                return false;
            }
            if (l1.get(i).getSecond()!= l2.get(i).getSecond()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Test of getTable method, of class Rotor.
     */
    @Test
    public void testGetTable() {
        char tmp = 'a';
        for (int i = 0; i < 26; i++) {
            testlist.add(new Pair(tmp, tmp));
            tmp++;
        }
        assertTrue(assertArrayList(testlist, test3.getTable()));
        
    }

    /**
     * Test of rotate method, of class Rotor.
     */
    @Test
    public void testRotate() {
        test2.rotate();
        assertEquals(test2.getRotatation(), 2);
    }

    /**
     * Test of getRotatation method, of class Rotor.
     */
    @Test
    public void testGetRotatation() {
        test.rotate();
        test.rotate();
        assertEquals(test.getRotatation(), 3);
        for (int i = 0; i < 23; i++) {
            test.rotate();
        }
        assertEquals(test.getRotatation(), 26);
        test.rotate();
        assertEquals(test.getRotatation(), 1);
    }

    /**
     * Test of setRotation method, of class Rotor.
     */
    @Test
    public void testSetRotation() {
        test.setRotation(23);
        assertEquals(23, test.getRotatation());
    }

    /**
     * Test of getChar method, of class Rotor.
     */
    @Test
    public void testGetChar() {
        test.setTable(tab);
        assertEquals(test.getChar(0), 'a');
        assertEquals(test.getChar(25), 'z');
    }

    /**
     * Test of getCounterChar method, of class Rotor.
     */
    @Test
    public void testGetCounterChar() {
        test2.setTable(rot_tab);
        assertEquals('x', test2.getCounterChar('x'));
        assertEquals('f', test2.getCounterChar('f'));
    }

    /**
     * Test of setTable method, of class Rotor.
     */
    @Test
    public void testSetTable() {
        rot.setTable(rot_tab);
        assertEquals(rot.getChar(0), 'a');
        assertEquals(rot.getChar(25), 'z');
    }

    /**
     * Test of getIsUsed method, of class Rotor.
     */
    @Test
    public void testGetIsUsed() {
        assertFalse(test2.getIsUsed());
        test2.changeIsUsed();
        assertTrue(test2.getIsUsed());
    }

    /**
     * Test of changeIsUsed method, of class Rotor.
     */
    @Test
    public void testChangeIsUsed() {
        assertFalse(test.getIsUsed());
        test.changeIsUsed();
        assertTrue(test.getIsUsed());
    }

    /**
     * Test of getNumber method, of class Rotor.
     */
    @Test
    public void testGetNumber() {
        Rotor tmp = new Rotor(5, tab);
        assertEquals(5, tmp.getNumber());
    }
    
}