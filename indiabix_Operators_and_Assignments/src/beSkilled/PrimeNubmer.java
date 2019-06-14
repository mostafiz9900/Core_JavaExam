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
public class PrimeNubmer {

    public static void main(String[] args) {
        int m, n, count = 0, totalPrime = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your 1st Number : ");
        m = input.nextInt();

        System.out.println("Enter your 2nd number : ");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    System.out.println("is not prime : " + i);
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
                totalPrime++;
            }
            count = 0;
        }
        System.out.println("Total Prime Number is : " + totalPrime);
    }
}
