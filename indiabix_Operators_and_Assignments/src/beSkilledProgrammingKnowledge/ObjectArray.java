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
class Account {

    int a;
    String b;

    public Account(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public void showData() {
        System.out.println("Value of a : " + a);
        System.out.println("Value of b :" + b);
    }

}

public class ObjectArray {

    public static void main(String[] args) {
        Account obj[] = new Account[2];
        obj[0] = new Account(1, "Mostafiz");
        obj[1] = new Account(2, "Sofiqul");

        System.out.println("For Array Element 0");
        obj[0].showData();
        System.out.println("For Array Element 1");
        obj[1].showData();
    }
}
