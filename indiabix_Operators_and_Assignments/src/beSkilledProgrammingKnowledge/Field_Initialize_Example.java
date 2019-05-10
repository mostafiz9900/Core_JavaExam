/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledge;

import java.util.Date;

/**
 *
 * @author Mostafizur
 */
public class Field_Initialize_Example {

    //Field variable declaration 
    double d;//1. Initialization using default value
    Date date = new Date();//2. Initialization using explict value
    String s;//1. Initialization using constructor 

    public Field_Initialize_Example() {
    }

    public Field_Initialize_Example(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        Field_Initialize_Example obj = new Field_Initialize_Example("Mostafiz");
        System.out.println(obj.d);
        System.out.println(obj.date);
        System.out.println(obj.s);
    }
}
