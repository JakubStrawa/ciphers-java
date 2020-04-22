/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author kuba
 */
public class Enigma {
    private Rotor rotor1,rotor2,rotor3,rotor4,rotor5;
    //E K M F L G D Q V Z N T O W Y H X U S P A I B R C J
    private char [] tab1 = {'e','k','m','f','l','g','d','q','v','z','n','t','o','w','y','h','x','u','s','p','a','i','b','r','c','j'};
    //A J D K S I R U X B L H W T M C Q G Z N P Y F V O E
    private char [] tab2 = {'a','j','d','k','s','i','r','u','x','b','l','h','w','t','m','c','q','g','z','n','p','y','f','v','o','e'};
    //B D F H J L C P R T X V Z N Y E I W G A K M U S Q O
    private char [] tab3 = {'b','d','f','h','j','l','c','p','r','t','x','v','z','n','y','e','i','w','g','a','k','m','u','s','q','o'};
    //E S O V P Z J A Y Q U I R H X L N F T G K D C M W B
    private char [] tab4 = {'e','s','o','v','p','z','j','a','y','q','u','i','r','h','x','l','n','f','t','g','k','d','c','m','w','b'};
    //V Z B R G I T Y U P S D N H L X A W M J Q O F E C K
    private char [] tab5 = {'v','z','b','r','g','i','t','y','u','p','s','d','n','h','l','x','a','w','m','j','q','o','f','e','c','k'};

    private ArrayList<Rotor> rotorList;
    
    private ArrayList<Pair> plugBoard;
    
    public Enigma(){
        rotor1 = new Rotor();
        rotor2 = new Rotor();
        rotor3 = new Rotor();
        rotor4 = new Rotor();
        rotor5 = new Rotor();
        rotorList = new ArrayList<Rotor>();
        plugBoard = new ArrayList<Pair>();
        
        rotor1.setTable(tab1);
        rotor2.setTable(tab2);
        rotor3.setTable(tab3);
        rotor4.setTable(tab4);
        rotor5.setTable(tab5);
                
    }
    
    public void addToPlugBoard(char a, char b){
        plugBoard.removeIf(p -> (p.getFirst() == a || p.getSecond() == a));
        plugBoard.removeIf(p -> (p.getFirst() == b || p.getSecond() == b));
        plugBoard.add(new Pair(a,b));
        
    }
    
    public void clearPlugBoard(){
        plugBoard.clear();
    }
    
    public void clearRotorList(){
        rotorList.clear();
    }
    
    public void addRotor(int num){
        if (num <= 0 || num >= 6) {
            System.out.println("Rotor does not exist! Use only numbers from 1 to 5");
        }
        switch(num){
            case 1:
                if (!rotor1.getIsUsed()) {
                    rotorList.add(rotor1);
                    rotor1.changeIsUsed(); 
                }
                break;
            case 2:
                if (!rotor2.getIsUsed()) {
                    rotorList.add(rotor2);
                    rotor2.changeIsUsed();
                }
                break;
            case 3:
                if (!rotor3.getIsUsed()) {
                    rotorList.add(rotor3);
                    rotor3.changeIsUsed();
                }
                break;
            case 4:
                if (!rotor4.getIsUsed()) {
                    rotorList.add(rotor4);
                    rotor4.changeIsUsed();
                }
                break;
            case 5:
                if (!rotor5.getIsUsed()) {
                    rotorList.add(rotor5);
                    rotor5.changeIsUsed();
                }
                break;
            default:
                break;
        }
    }
}
