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
public class String_StringBuffer_Concat {

    public static String concateWithString() {
        String t = "Cat";
        for (int i = 0; i < 10000; i++) {
            t = t.concat("Dog");
        }
        return t;
    }

    public static String concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer("Cat");
        for (int i = 0; i < 10000; i++) {
            sb.append("Dog");
        }
        return sb.toString();
    }

    public static String concateStringBuilder() {
        StringBuilder sbs = new StringBuilder("Cat");
        for (int i = 0; i < 10000; i++) {
            sbs.append("Dog");
        }
        return sbs.toString();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concateWithString();
        System.out.println("Concat with string took : " + (System.currentTimeMillis()-start)+"ms");
        start = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Concat with string buffer took : " + (System.currentTimeMillis()-start)+"ms");

        start = System.currentTimeMillis();
        concateStringBuilder();
        System.out.println("Concat with string builder took : " + (System.currentTimeMillis()-start)+"ms");
    }
}
