/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled;

import java.util.Scanner;

/**
 *
 * @author Mostafizur
 */
public class OldEvenMtoN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter start number : ");
        int m = input.nextInt();
        System.out.println("Enter end number : ");
        int n = input.nextInt();
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("event num : " + i);
            } else {
                System.out.println("old num : " + i);
            }

        }
    }
}
