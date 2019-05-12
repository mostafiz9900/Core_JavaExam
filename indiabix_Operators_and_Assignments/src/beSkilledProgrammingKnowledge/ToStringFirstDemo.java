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
public class ToStringFirstDemo {

    String s1, s2;

    public ToStringFirstDemo(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "ToStringFirstDemo{" + "s1=" + s1 + ", s2=" + s2 + '}';
    }

    public static void main(String[] args) {
        ToStringFirstDemo tdf = new ToStringFirstDemo("Hello", "World");
        System.out.println(tdf);
    }
}
