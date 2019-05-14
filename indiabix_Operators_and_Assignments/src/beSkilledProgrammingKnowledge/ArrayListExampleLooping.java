/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledge;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mostafizur
 */
public class ArrayListExampleLooping {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mostafiz");
        list.add("Java");
        list.add("Programmer");
        System.out.println("#1 normal for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("#2 advanc for loop");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("# while loop");
        int j = 0;
        while (list.size() > j) {
            System.out.println(list.get(j));
            j++;
        }

        System.out.println("#4 iterator");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            //String s =iterator.next();
            System.out.println(iterator.next());
        }
    }
}
