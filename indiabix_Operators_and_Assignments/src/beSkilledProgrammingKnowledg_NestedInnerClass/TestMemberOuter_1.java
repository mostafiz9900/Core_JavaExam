/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledg_NestedInnerClass;

/**
 *
 * @author Mostafizur
 */
public class TestMemberOuter_1 {
    private int date=30;
    class Inner{
    void msg(){
        System.out.println("date is :"+ date);
    }
    }
    void display(){
    Inner in=new Inner();
    in.msg();
    }
    public static void main(String[] args) {
        TestMemberOuter_1 obj=new TestMemberOuter_1();
        obj.display();
    }
    
}
