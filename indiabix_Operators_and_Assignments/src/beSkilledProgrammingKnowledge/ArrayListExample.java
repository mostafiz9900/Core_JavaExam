/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledge;

import java.util.ArrayList;

/**
 *
 * @author Mostafizur
 */
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Size: " + list.size() + "and Element inside the ArrayList ::" + list);
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add(2, "s");
        System.out.println("Size: " + list.size() + "and Element inside the ArrayList ::" + list);

        list.remove("A");
        list.remove(2);
        System.out.println("Size: " + list.size() + "and Element inside the ArrayList ::" + list);
        list.remove("C");
        list.add(2, "X");
        System.out.println("Size: " + list.size() + "and Element inside the ArrayList ::" + list);
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.print(s);
        }
    }
}
