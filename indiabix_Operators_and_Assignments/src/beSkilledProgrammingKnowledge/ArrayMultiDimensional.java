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
public class ArrayMultiDimensional {

    public static void main(String[] args) {
        int arr1[][] = new int[3][];
        arr1[0] = new int[3];
        arr1[1] = new int[2];
        arr1[2] = new int[3];
        int arr[][] = {
            {2, 5, 4},
            {50, 10},
            {100, 80}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(" [" + i + "] [" + j + "]=" + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
