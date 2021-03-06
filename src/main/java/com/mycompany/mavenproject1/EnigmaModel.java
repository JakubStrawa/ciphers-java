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
public class EnigmaModel {
    private Rotor rotor1,rotor2,rotor3,rotor4,rotor5,deflector1,deflector2;
    //
    //Rotor and EnigmaModel rules:
    // each letter has its counterletter
    // eg. for tab1: A->E, B->K, C->M, D->F etc.
    // but neither relation is transitive, meaning that E->L, F->G, G->D, not E-/>A or F-/>D
    // rotor offset is indicated by rotation-1, eg. if all rotors have rotation of 1, all As are aligned
    // if one rotor has rotation of 2 and others of 1, that is equal to one B being aligned to As
    // electric current flows through all rotors, reflector, all rotors again and through plugboard to bubble(showing encoded letter)
    // each letter increases leftmost rotor rotation by 1
    // one full rotor rotation rotates left rotor by 1
    // to decode msg EnigmaModel needs to be pluged the same way with the same rotor order and rotations
    // then user just needs to type encoded msg to receive decoded one
    //
    // EnigmaModel deflector types:
    // UKW B ->  AY  BR  CU  DH  EQ  FS  GL  IP  JX  KN  MO  TZ  VW
    private char [] deflect1 = {'y','r','u','h','q','s','l','d','p','x','n','g','o','k','m','i','e','b','f','z','c','w','v','j','a','t'};
    // UKW C ->  AF  BV  CP  DJ  EI  GO  HY  KR  LZ  MX  NW  QT  SU
    private char [] deflect2 = {'f','v','p','j','i','a','o','y','e','d','r','z','x','w','g','c','t','k','u','q','s','b','n','m','h','l'};
    // EnigmaModel rotor types:
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
    private String msg;
    private ArrayList<Rotor> rotorList;
    private ArrayList<Pair<Character>> plugBoard;
    private int deflectorUsed;
    private Boolean flagSBS;
    private Boolean flagNextStep;
    private int currentChar;
    private int currentStatus;
    
    public EnigmaModel(){
        msg = "";
        rotor1 = new Rotor(1,tab1);
        rotor2 = new Rotor(2,tab2);
        rotor3 = new Rotor(3,tab3);
        rotor4 = new Rotor(4,tab4);
        rotor5 = new Rotor(5,tab5);
        deflector1 = new Rotor(101,deflect1);
        deflector2 = new Rotor(102,deflect2);
        rotorList = new ArrayList<Rotor>();
        plugBoard = new ArrayList<Pair<Character>>();
        
        deflectorUsed = 1;
        flagSBS = false;
        flagNextStep = false;
        currentChar = 0;
        currentStatus = 0;
    }

    public void setFlagSBS(Boolean flagSBS) {
        this.flagSBS = flagSBS;
    }

    public void setFlagNextStep(Boolean flagNextStep) {
        this.flagNextStep = flagNextStep;
    }

    public Boolean getFlagSBS() {
        return flagSBS;
    }

    public Boolean getFlagNextStep() {
        return flagNextStep;
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
    
    public ArrayList<Pair<Character>> getPlugBoard(){
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
    
    public void addRotor(int num){
        if (num <= 0 || num >= 6) {
            System.out.println("Rotor does not exist! Use only numbers from 1 to 5");
        } else {
            if (!getRotor(num).getIsUsed()) {
                rotorList.add(getRotor(num));
                getRotor(num).changeIsUsed();
            }
        }
    }
    
    public String getMessage(){
        System.out.println(msg);
        return msg;
    }
    
    public void setMessage(String msg){
        this.msg = msg;
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
    
    private char addRotation(char c, int rot){
        c = (char) ('a' + ((c + rot - 1) % 97) % 26);
        return c;
    }
    
    private char subRotation(char c, int rot){
        c = addRotation(c, 26 - rot + 1);
        return c;
    }
    
    private char plugboard(char c){
        char tmp_char = c;
        for (Pair<Character> p : plugBoard) {
            if (p.getFirst() == tmp_char) {
                tmp_char = p.getSecond();
                break;
            }
            if (p.getSecond() == tmp_char) {
                tmp_char = p.getFirst();
                break;
            }
        }
        return tmp_char;
    }
    
    private char deflector(char c){
        char tmp_char = c;
        if (deflectorUsed == 1) {
            tmp_char = addRotation(tmp_char, deflector1.getRotatation());
            tmp_char = deflector1.getChar(tmp_char - 97);
            tmp_char = subRotation(tmp_char, deflector1.getRotatation()-1);
        } else {
            tmp_char = addRotation(tmp_char, deflector2.getRotatation());
            tmp_char = deflector2.getChar(tmp_char - 97);
            tmp_char = subRotation(tmp_char, deflector2.getRotatation()-1);
        }
        return tmp_char;
    }
    
    private char rotationForward(char c, int j){
        char tmp_char = c;
        // char adjustion to rotor rotation
        tmp_char = addRotation(tmp_char, rotorList.get(j).getRotatation());
        // finding char on the other side of rotor
        tmp_char = rotorList.get(j).getChar(tmp_char - 97);
        // rotation substraction
        tmp_char = subRotation(tmp_char, rotorList.get(j).getRotatation()-1);
        // zmiana chara
        return tmp_char;
    }
    
    private char rotationBackwards(char c, int j){
        char tmp_char = c;
        // char adjustion to rotor rotation
        tmp_char = addRotation(tmp_char, rotorList.get(j).getRotatation());
        // finding char on the other side of rotor
        tmp_char = rotorList.get(j).getCounterChar(tmp_char);
        // rotation substraction
        tmp_char = subRotation(tmp_char, rotorList.get(j).getRotatation()-1);
        // zmiana chara
        return tmp_char;
    }
    
    public char changeChar(char c){
        char tmp_char = c;
            if (tmp_char >= 'a' && tmp_char <= 'z') {
                
                // Plugboard
                if (currentStatus == 0){
                    tmp_char = plugboard(tmp_char);
                }
                
                // Iteration through rotors to deflector
                if (currentStatus == 1) {
                    if (rotorList.size() == 3) {
                        tmp_char = rotationForward(tmp_char, 2);
                    } else {
                        currentStatus++;
                    }
                }
                if (currentStatus == 2) {
                    if (rotorList.size() >= 2) {
                        tmp_char = rotationForward(tmp_char, 1);
                    } else {
                        currentStatus++;
                    }
                }
                if (currentStatus == 3) {
                    if (rotorList.size() >= 1) {
                        tmp_char = rotationForward(tmp_char, 0);
                    } else {
                        currentStatus++;
                    }
                }
               
                // Going through deflector
                if (currentStatus == 4) {
                    tmp_char = deflector(tmp_char);
                }
                
                // Iteration through rotors from deflector
                if (currentStatus == 5) {
                    if (rotorList.size() >= 1) {
                        tmp_char = rotationBackwards(tmp_char, 0);
                    } else {
                        currentStatus++;
                    }
                }
                if (currentStatus == 6) {
                    if (rotorList.size() >= 2) {
                        tmp_char = rotationBackwards(tmp_char, 1);
                    } else {
                        currentStatus++;
                    }
                }
                if (currentStatus == 7) {
                    if (rotorList.size() == 3) {
                        tmp_char = rotationBackwards(tmp_char, 2);
                    } else {
                        currentStatus++;
                    }
                }

                // Plugboad
                if (currentStatus == 8) {
                    tmp_char = plugboard(tmp_char);
                    moveRotors();
                }
            
        } else {
                currentStatus = currentStatus + 8;
        }
        return tmp_char;
    }
    
    public void changeMessage(){
        char tmp_char;
        if (!flagSBS) {
            currentChar = 0;
            for (currentChar = 0; currentChar < msg.length(); currentChar++) {
                tmp_char = msg.charAt(currentChar);
                if (tmp_char >= 'a' && tmp_char <= 'z') {
                    // Plugboard
                    tmp_char = plugboard(tmp_char);
                    // Iteration through rotors to deflector
                    for (int j = rotorList.size() - 1; j >= 0; j--) {
                        tmp_char = rotationForward(tmp_char, j);
                    }
                    // Going through deflector
                    tmp_char = deflector(tmp_char);
                    // Iteration through rotors from deflector
                    for (int j = 0; j < rotorList.size(); j++) {
                        tmp_char = rotationBackwards(tmp_char, j);
                    }
                    // Plugboad
                    tmp_char = plugboard(tmp_char);
                    moveRotors();
                }
                char[] msgChars = msg.toCharArray();
                msgChars[currentChar] = tmp_char;
                msg = String.valueOf(msgChars);
            }
            currentChar = 0;
            currentStatus = 0;
        } else {
            tmp_char = msg.charAt(currentChar);
            tmp_char = changeChar(tmp_char);
            char[] msgChars = msg.toCharArray();
            msgChars[currentChar] = tmp_char;
            msg = String.valueOf(msgChars);
            currentStatus++;
            if (currentStatus == 9) {
                currentChar++;
                currentStatus = 0;
            }
            
            if (currentChar == msg.length()) {
                currentChar = 0;
                flagNextStep = false;
            }
        }
        System.out.println("New message is: " + msg);
    }
    
}
