/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledge;

import java.util.Arrays;

/**
 *
 * @author Mostafizur
 */
public class ArraySingleDimensional {

    public static void main(String[] args) {
        int arr[] = new int[3];// array declaration 
        arr[0] = 5;
        arr[1] = 8;
        arr[2] = 2;

        int num[] = {10, 50, 20, 60, 48, 2};//array declaration and instantiation
        int m = num.length;
        System.out.println("Given number :");
        for (int i = 0; i < m; i++) {
            System.out.println(" " + num[i]);
        }
        System.out.println("\n");
        System.out.println("Accending order number : ");
        Arrays.sort(num);
        for (int s : num) {
            System.out.println(" "+ s); 
        }
    }
}
