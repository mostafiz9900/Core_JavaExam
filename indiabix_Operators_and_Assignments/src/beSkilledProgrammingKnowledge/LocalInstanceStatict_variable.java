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
public class LocalInstanceStatict_variable {

    int y;

    public void callAge() {
        int age = 0;//cause compilation error if not initialized
        age = age + 7;
        y = y + 3;
        System.out.println("Age is : " + age + " "+ y);
    }

    public static void main(String[] args) {
        LocalInstanceStatict_variable test = new LocalInstanceStatict_variable();
        test.callAge();
    }
}
