/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledge;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Mostafizur
 */
public class ArrayToList_2 {

    public static void main(String[] args) {
        String sArray[] = createArray();
        List list = Arrays.asList(sArray);
        System.out.println("\n..........Iterator Loop.....\n");
        long lIteratorStartTime = new Date().getTime();
        System.out.println("Start : " + lIteratorStartTime);

        //iterator Loop
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String stemp = iterator.next();
        }
        long lIteratorEndTime = new Date().getTime();
        System.out.println("End : " + lIteratorEndTime);

        long lIteratorDifference = lIteratorEndTime - lIteratorStartTime;
        System.out.println("Iterator - Elapsed time in millliseconds : " + lIteratorDifference);

        System.out.println("\n.......End.............\n");

        //for loop
        System.out.println("\n..........for loop.....\n");
        long lForStartTime = new Date().getTime();
        System.out.println("Start : " + lForStartTime);

        for (int i = 0; i < list.size(); i++) {
            String stemp = (String) list.get(i);
        }
        long lForEndTime = new Date().getTime();
        System.out.println("End : " + lForEndTime);

        long lForDifference = lForEndTime - lForStartTime;
        System.out.println("For loop - Elapsed time in millliseconds : " + lForDifference);

        System.out.println("\n.......End.............\n");

        //while loop
        System.out.println("\n..........while loop.....\n");
        long lWhileStartTime = new Date().getTime();
        System.out.println("Start : " + lWhileStartTime);

        int j = 0;
        while (j < list.size()) {
            String stemp = (String) list.get(j);
            j++;
        }
        long lWhileEndTime = new Date().getTime();
        System.out.println("End : " + lWhileEndTime);

        long lWhileDifference = lWhileEndTime - lWhileStartTime;
        System.out.println("While loop - Elapsed time in millliseconds : " + lWhileDifference);

        System.out.println("\n.......End.............\n");

    }

    static String[] createArray() {
        String sArray[] = new String[550000];
        for (int i = 0; i < sArray.length; i++) {
            sArray[i] = "Array :" + i;
        }
        return sArray;
    }
}
