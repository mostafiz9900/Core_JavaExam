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
public class StaticVariable {

    private static double salary;

    int x;//instance/ non-static varable 
//Department is a constant
    public static final String DEPARTMENT = "Developmetn";

    void test() {
        x = 0;
        salary = 300;// non-saatic member can access static member
    }

    public static void main(String[] args) {
        //x=0;      //static member can not access non-static member
        StaticVariable sv = new StaticVariable();
        sv.x = 100;
        salary = 1000;
        System.out.println(DEPARTMENT + " average salary " + salary);
    }
}
