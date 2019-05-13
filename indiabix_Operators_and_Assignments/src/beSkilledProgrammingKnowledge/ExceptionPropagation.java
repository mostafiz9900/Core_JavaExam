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
public class ExceptionPropagation {

    void m() {
        int d = 50 / 0;
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation ep = new ExceptionPropagation();
        ep.p();
    }
}
