/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledge;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Mostafizur
 */
public class ArrayToList {

    public static void main(String[] args) {
        String sArray[] = new String[]{"Array 1", "Array 2", "Array 3", "Array 4"};
        //convert array to list
        List<String> list = Arrays.asList(sArray);

        //iterator loop
        System.out.println("#1 iterator");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //for loop
        System.out.println("#2 for ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //for loop advance
        System.out.println("#3 for advance");
        for (String s : list) {
            System.out.println(s);
        }
        //for loop while
        System.out.println("#4 while");
        int j = 0;
        while (list.size() > j) {
            System.out.println(list.get(j));
            j++;
        }
    }
}
