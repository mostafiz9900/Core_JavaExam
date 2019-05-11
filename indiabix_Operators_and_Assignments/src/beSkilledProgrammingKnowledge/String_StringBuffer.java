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
public class String_StringBuffer {

    public static void main(String[] args) {
       // String s = new String("Dhaka");
        String s = "Dhaka";
        s.concat(" Bangladesh "); // s= s.concat(" Bangladesh "); string is immutable== unchange able
        System.out.println(s);

        StringBuffer sb = new StringBuffer("Dhaka");//mutable ==change able 
        sb.append(" Bangladesh");
        System.out.println(sb);
    }
}
