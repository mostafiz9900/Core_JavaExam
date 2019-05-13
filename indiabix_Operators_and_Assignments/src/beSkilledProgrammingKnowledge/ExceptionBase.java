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
public class ExceptionBase {

    public static void main(String[] args) {
        try {
            int x = 2;
            int y = 34 / x;
            int z[] = new int[2];

            System.out.println(y);
            System.out.println(z[2]);

        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
        System.out.println("Finish");
    }

}
