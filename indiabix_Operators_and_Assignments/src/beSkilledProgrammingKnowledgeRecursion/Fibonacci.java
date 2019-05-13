/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledgeRecursion;

import javax.swing.JOptionPane;

/**
 *
 * @author Mostafizur
 */
public class Fibonacci {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter N: ");
        int n = Integer.parseInt(input);
        for (int i = 1; i <= n; i++) {
            int f = fib(i);
            System.out.println("fib (" + i + ") =" + f);
        }
    }

    public static int fib(int n) {
        if (n <= 2) {
            return 1;

        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
