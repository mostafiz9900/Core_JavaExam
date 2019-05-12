/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledge;

/**
 *
 * @author Mostafizur
 */
public class Varargs {
    

    public static void main(String[] args) {
        test(201, "Dhaka", "Mirpur");
        test(201, "Dhaka", "Mirpur", "Mostafiz", "Rahman");
    }

    public static void test(int some, String... arg) {
        System.out.println("\n" + some);
        //java 5 Enhanced for loop
        for (String s : arg) {
            System.out.print(" " + s);
        }
    }
}
