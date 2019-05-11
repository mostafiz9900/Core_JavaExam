/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledge;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import javafx.print.Collation;

/**
 *
 * @author Mostafizur
 */
public class Array_Sort_Reverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array size :");
        int sizeArray = input.nextInt();
        Integer arr[] = new Integer[sizeArray];
        System.out.println("Array value :");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
    }
}
