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
public class Primitive_to_Object_Casting {

    public static void main(String[] args) {

        //primitive ot object casting
        String s = "12";
        int stoi = Integer.parseInt(s);
        //or
        int stoi2 = Integer.valueOf(s).intValue();
        System.out.println("String to int : " + stoi);

        int i = 14;
        String si = Integer.toString(i);
        System.out.println("int to String : " + si);

        String ss = "55";
        double ds = Double.parseDouble(ss);
        System.out.println("String to Double : " + ds);

        double d = 13.5d;
        String sd = Double.toString(d);
        System.out.println("Double to String : " + sd);

        //primitive to primitive casting 
        //char to int 
        char c = 'a';
        int ctoi = c;
        System.out.println("char to int : " + ctoi);
        //int to char 
        int ii = 97;
        char itoc = (char) ii;
        System.out.println("int to char : " + itoc);

        //int to char another way
        System.out.println(Character.toChars(ctoi));

        //String to Character
     String sss = "welcome";
     char stoc='A';
        for (int j = 0; j <sss.length(); j++) {
             stoc = (char) sss.charAt(j);
            System.out.println("String to character : " + stoc);
        }
//        char stoc = (char) sss.charAt(0);
        System.out.println("String to character : " + stoc);



        //character to String 
        char cc = 'X';
        System.out.println("Character to string : " + String.valueOf(cc));

        //int to double widening 
        int iii = 5;
        double itod = iii;
        System.out.println("int to double :" + itod);

        //double to int narrowing 
        double dd = 5.5d;
        int dtoi = (int) dd;
        System.out.println("double to int : " + dtoi);
    }
}
