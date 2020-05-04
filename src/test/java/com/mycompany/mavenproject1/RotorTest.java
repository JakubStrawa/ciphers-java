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
    
    /**
     * Assert arrayList function.
     */
    private boolean assertArrayList(ArrayList<Pair<Character>> l1, ArrayList<Pair<Character>> l2){
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
        char [] tab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Rotor test3 = new Rotor(3, tab);
        ArrayList<Pair<Character>> testlist = new ArrayList<Pair<Character>>();
        char tmp = 'a';
        for (int i = 0; i < 26; i++) {
            testlist.add(new Pair<Character>(tmp, tmp));
            tmp++;
        }
        assertTrue(assertArrayList(testlist, test3.getTable()));
        
    }

    /**
     * Test of rotate method, of class Rotor.
     */
    @Test
    public void testRotate() {
        char [] tab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Rotor test2 = new Rotor(2,tab);
        test2.rotate();
        assertEquals(test2.getRotatation(), 2);
    }

    /**
     * Test of getRotatation method, of class Rotor.
     */
    @Test
    public void testGetRotatation() {
        char [] tab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Rotor test = new Rotor(1,tab);
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
        char [] tab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Rotor test = new Rotor(1,tab);
        test.setRotation(23);
        assertEquals(23, test.getRotatation());
    }

    /**
     * Test of getChar method, of class Rotor.
     */
    @Test
    public void testGetChar() {
        char [] tab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Rotor test = new Rotor(1,tab);
        test.setTable(tab);
        assertEquals('a', test.getChar(0));
        assertEquals('z', test.getChar(25));
    }

    /**
     * Test of getCounterChar method, of class Rotor.
     */
    @Test
    public void testGetCounterChar() {
        char [] rot_tab = {'e','k','m','f','l','g','d','q','v','z','n','t','o','w','y','h','x','u','s','p','a','i','b','r','c','j'};
        char [] tab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Rotor test2 = new Rotor(2,tab);
        test2.setTable(rot_tab);
        assertEquals('a', test2.getCounterChar('e'));
        assertEquals('b', test2.getCounterChar('k'));
    }

    /**
     * Test of setTable method, of class Rotor.
     */
    @Test
    public void testSetTable() {
        char [] rot_tab = {'e','k','m','f','l','g','d','q','v','z','n','t','o','w','y','h','x','u','s','p','a','i','b','r','c','j'};
        char [] tab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Rotor rot = new Rotor(1,tab);
        rot.setTable(rot_tab);
        assertEquals(rot.getChar(0), 'a');
        assertEquals(rot.getChar(25), 'z');
    }

    /**
     * Test of getIsUsed method, of class Rotor.
     */
    @Test
    public void testGetIsUsed() {
        char [] tab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Rotor test2 = new Rotor(2,tab);
        assertFalse(test2.getIsUsed());
        test2.changeIsUsed();
        assertTrue(test2.getIsUsed());
    }

    /**
     * Test of changeIsUsed method, of class Rotor.
     */
    @Test
    public void testChangeIsUsed() {
        char [] tab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Rotor test = new Rotor(1,tab);
        assertFalse(test.getIsUsed());
        test.changeIsUsed();
        assertTrue(test.getIsUsed());
    }

    /**
     * Test of getNumber method, of class Rotor.
     */
    @Test
    public void testGetNumber() {
        char [] tab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Rotor tmp = new Rotor(5, tab);
        assertEquals(5, tmp.getNumber());
    }
    
}