/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputFrom;

/**
 *
 * @author Mostafizur
 */
public class Test_134 {

    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        if (x++ > ++y) {
            System.out.println("Hello ");
        } else {
            System.out.println("Welcom ");
        }
        System.out.println("Log " + x + ": " + y);
    }
}
