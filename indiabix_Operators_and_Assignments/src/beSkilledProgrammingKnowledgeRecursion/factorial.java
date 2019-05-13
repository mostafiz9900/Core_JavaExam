/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledgeRecursion;

/**
 *
 * @author Mostafizur
 */
public class factorial {

    public static int fac(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fac(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fac(5));
    }
}
