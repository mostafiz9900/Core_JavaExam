/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputFrom;

/**
 *
 * @author Mostafizur
 */
public class Test4 {
    public static void main(String[] args) {
        String s = " geeks for geeks has all java functions to read  ";  
    System.out.println(s.trim());   
      
    // trims the leading spaces  
    s = "     Chetna loves reading books           ";  
    System.out.println(s.trim());
    
    
    String str=" ";
    str.trim();
        System.out.println(str.equals(" ")+ " " + str.isEmpty());
    }
}
