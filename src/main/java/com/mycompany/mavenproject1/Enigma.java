/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

//TODO:
// change tables to arraylist of pairs +
// make enigma working +
// optimalization
// comments in english

/**
 *
 * @author kuba
 */
public class Enigma {
    private String message;
    
    private Rotor rotor1,rotor2,rotor3,rotor4,rotor5,deflector1,deflector2;
    //
    //Rotor and Enigma rules:
    // each letter has its counterletter
    // eg. for tab1: A->E, B->K, C->M, D->F etc.
    // but neither relation is transitive, meaning that E->L, F->G, G->D, not E-/>A or F-/>D
    // rotor offset is indicated by rotation-1, eg. if all rotors have rotation of 1, all As are aligned
    // if one rotor has rotation of 2 and others of 1, that is equal to one B being aligned to As
    // electric current flows through all rotors, reflector, all rotors again and through plugboard to bubble(showing encoded letter)
    // each letter increases leftmost rotor rotation by 1
    // one full rotor rotation rotates left rotor by 1
    // to decode message Enigma needs to be pluged the same way with the same rotor order and rotations
    // then user just needs to type encoded message to receive decoded one
    //
    // Enigma deflector types:
    // UKW B ->  AY  BR  CU  DH  EQ  FS  GL  IP  JX  KN  MO  TZ  VW
    private char [] deflect1 = {'y','r','u','h','q','s','l','d','p','x','n','g','o','k','m','i','e','b','f','z','c','w','v','j','a','t'};
    // UKW C ->  AF  BV  CP  DJ  EI  GO  HY  KR  LZ  MX  NW  QT  SU
    private char [] deflect2 = {'f','v','p','j','i','a','o','y','e','d','r','z','x','w','g','c','t','k','u','q','s','b','n','m','h','l'};
    // Enigma rotor types:
    // I:  E K M F L G D Q V Z N T O W Y H X U S P A I B R C J
    private char [] tab1 = {'e','k','m','f','l','g','d','q','v','z','n','t','o','w','y','h','x','u','s','p','a','i','b','r','c','j'};
    // II:  A J D K S I R U X B L H W T M C Q G Z N P Y F V O E
    private char [] tab2 = {'a','j','d','k','s','i','r','u','x','b','l','h','w','t','m','c','q','g','z','n','p','y','f','v','o','e'};
    // III:  B D F H J L C P R T X V Z N Y E I W G A K M U S Q O
    private char [] tab3 = {'b','d','f','h','j','l','c','p','r','t','x','v','z','n','y','e','i','w','g','a','k','m','u','s','q','o'};
    // IV:  E S O V P Z J A Y Q U I R H X L N F T G K D C M W B
    private char [] tab4 = {'e','s','o','v','p','z','j','a','y','q','u','i','r','h','x','l','n','f','t','g','k','d','c','m','w','b'};
    // V:  V Z B R G I T Y U P S D N H L X A W M J Q O F E C K
    private char [] tab5 = {'v','z','b','r','g','i','t','y','u','p','s','d','n','h','l','x','a','w','m','j','q','o','f','e','c','k'};

    private ArrayList<Rotor> rotorList;
    
    private ArrayList<Pair> plugBoard;
    
    private int deflectorUsed;
    
    public Enigma(String msg){
        message = msg.trim().toLowerCase();
        rotor1 = new Rotor(1,tab1);
        rotor2 = new Rotor(2,tab2);
        rotor3 = new Rotor(3,tab3);
        rotor4 = new Rotor(4,tab4);
        rotor5 = new Rotor(5,tab5);
        deflector1 = new Rotor(101,deflect1);
        deflector2 = new Rotor(102,deflect2);
        rotorList = new ArrayList<Rotor>();
        plugBoard = new ArrayList<Pair>();
        
        deflectorUsed = 1;
                
    }
    
    public void addToPlugBoard(String s){
        String text = s.trim().toLowerCase();
        char a,b;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                i++;
            }
            a = text.charAt(i);
            i++;
            
            //exception
            try {
                b = text.charAt(i);
            } catch (Exception e) {
                b = ' ';
            }
            
            if (a >= 'a' && a <= 'z' && b >= 'a' && b <= 'z') {
                addToPlugBoard(a, b);
            }
        }
    }
    
    public void addToPlugBoard(char a, char b){
        if (a == ' ' || b == ' ') {
            return;
        }
        plugBoard.removeIf(p -> (p.getFirst() == a || p.getSecond() == a));
        plugBoard.removeIf(p -> (p.getFirst() == b || p.getSecond() == b));
        plugBoard.add(new Pair(a,b));
        
    }
    
    public void clearPlugBoard(){
        plugBoard.clear();
    }
    
    public void clearRotorList(){
        for (Rotor r : rotorList) {
            r.changeIsUsed();
        }
        rotorList.clear();
    }
    public ArrayList<Rotor> getRotorList(){
        return rotorList;
    }
    public ArrayList<Pair> getPlugBoard(){
        return plugBoard;
    }
    
    public Rotor getRotor(int num){
        switch(num){
            case 1:
                return rotor1;
            case 2:
                return rotor2;
            case 3:
                return rotor3;
            case 4:
                return rotor4;
            case 5:
                return rotor5;
            default:
                return null;
        }
    }
    // CHANGE
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
    
    public String getMessage(){
        System.out.println(message);
        return message;
    }
    
    public void setMessage(String msg){
        message = msg;
    }
    
    public void moveRotors(){
        if (rotorList.isEmpty()) {
            return;
        }
        int size = rotorList.size() - 1;
        int rot = rotorList.get(size).getRotatation();
        
        rotorList.get(size).rotate();
        if (rot == 26 && size != 0) {
            size--;
            rot = rotorList.get(size).getRotatation();
            rotorList.get(size).rotate();
            if (rot == 26 && size != 0) {
                size--;
                rotorList.get(size).rotate();
            }
            
        }
        
//        do {            
//            rotorList.get(size).rotate();
//            size --;
//            if (size < 0) {
//                break;
//            }
//            rot = rotorList.get(size).getRotatation();
//        } while (rot == 26 && size >= 0);
    }
    
    public void setDeflector(int i){
        if (i != 1 && i != 2) {
            System.out.println("Deflector does not exist! Use 1 or 2.");
            return;
        } else {
            deflectorUsed = i;
        }
    }
    
    public int getDeflector(){
        return deflectorUsed;
    }
    
    public void printEnigma(){
        System.out.println("Enigma state:");
        System.out.println("Rotors order:");
        for (Rotor rot : rotorList) {
            System.out.println("Rotor: " + rot.getNumber() + " rotation: " + rot.getRotatation());
        }
        System.out.println("Plugboard:");
        for (Pair p : plugBoard) {
            String temp = "";
            temp += p.getFirst();
            temp += p.getSecond();
            System.out.println(temp.toUpperCase());
        }
    }
    
    private char addRotation(char c, int rot){
        c = (char) ('a' + ((c + rot - 1) % 97) % 26);
        return c;
    }
    private char subRotation(char c, int rot){
        c = addRotation(c, 26 - rot + 1);
        return c;
    }
    
    public void changeMessage(){
        String tmp_string = "";
        char tmp_char;
        for (int i = 0; i < message.length(); i++) {
            tmp_char = message.charAt(i);
            if (tmp_char >= 'a' && tmp_char <= 'z') {
                System.out.println("New char: " + tmp_char);
                // Przejscie po plugboardzie
                for (Pair p : plugBoard) {
                    if (p.getFirst() == tmp_char) {
                        tmp_char = p.getSecond();
                        break;
                    }
                    if (p.getSecond() == tmp_char) {
                        tmp_char = p.getFirst();
                        break;
                    }
                }
                System.out.println("1st plugboard: " + tmp_char);
                // Przejscie po rotorach w kierunku do deflektora
                for (int j = rotorList.size() - 1; j >= 0; j--) {
                    // dostosowanie chara do rotacji rotora
                    tmp_char = addRotation(tmp_char, rotorList.get(j).getRotatation());
                    System.out.println("Rotor: " + rotorList.get(j).getNumber() + " char: " + tmp_char);
                    // znalezienie chara po 2 stronie rotora
                    tmp_char = rotorList.get(j).getChar(tmp_char - 97);
                    System.out.println("Rotor: " + rotorList.get(j).getNumber() + " char: " + tmp_char);
                    // odjecie rotacji
                    tmp_char = subRotation(tmp_char, rotorList.get(j).getRotatation()-1);
                    System.out.println("Rotor: " + rotorList.get(j).getNumber() + " char: " + tmp_char);
                    
                }
                //System.out.println(tmp_char);
                // Przejście przez deflektor
                if (deflectorUsed == 1) {
                    tmp_char = addRotation(tmp_char, deflector1.getRotatation());
                    tmp_char = deflector1.getChar(tmp_char - 97);
                    tmp_char = subRotation(tmp_char, deflector1.getRotatation()-1);
                } else {
                    tmp_char = addRotation(tmp_char, deflector2.getRotatation());
                    tmp_char = deflector2.getChar(tmp_char - 97);
                    tmp_char = subRotation(tmp_char, deflector2.getRotatation()-1);
                }
                System.out.println("Deflector: " + tmp_char);
                // Przejscie po rotorach w kierunku od deflektora
                for (int j = 0; j < rotorList.size(); j++) {
                    // dostosowanie chara do rotacji rotora
                    tmp_char = addRotation(tmp_char, rotorList.get(j).getRotatation());
                    System.out.println("Rotor: " + rotorList.get(j).getNumber() + " char: " + tmp_char);
                    // znalezienie chara po 2 stronie rotora
                    tmp_char = rotorList.get(j).getCounterChar(tmp_char);
                    System.out.println("Rotor: " + rotorList.get(j).getNumber() + " char: " + tmp_char);
                    // odjecie rotacji
                    tmp_char = subRotation(tmp_char, rotorList.get(j).getRotatation()-1);
                    System.out.println("Rotor: " + rotorList.get(j).getNumber() + " char: " + tmp_char);
                }
                
                // Przejscie po plugboardzie
                for (Pair p : plugBoard) {
                    if (p.getFirst() == tmp_char) {
                        tmp_char = p.getSecond();
                        break;
                    }
                    if (p.getSecond() == tmp_char) {
                        tmp_char = p.getFirst();
                        break;
                    }
                }
                System.out.println("2nd plugboard: " + tmp_char);
                tmp_string += tmp_char;
                moveRotors();
            }
        }
        message = tmp_string;
        System.out.println("New message is: " + tmp_string);
    }
    
}
