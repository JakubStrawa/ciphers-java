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
public class PolybiusTableModelTest {
    
    public PolybiusTableModelTest() {
    }

    /**
     * Test of getTable method, of class PolybiusTableModel.
     */
    @Test
    public void testGetTable() {
        PolybiusTableModel pol = new PolybiusTableModel();
        Character[] tab = {'x','y','z','d','e','a','b','c','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w'};
        pol.setTable(tab);
        assertArrayEquals(tab, pol.getTable());
    }

    /**
     * Test of setTable method, of class PolybiusTableModel.
     */
    @Test
    public void testSetTable() {
        PolybiusTableModel pol = new PolybiusTableModel();
        Character[] tab = {'x','y','z','d','e','a','b','c','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w'};
        pol.setTable(tab);
        assertArrayEquals(tab, pol.getTable());
    }
    
}
