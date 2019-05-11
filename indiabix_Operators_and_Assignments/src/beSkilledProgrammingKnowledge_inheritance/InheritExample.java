/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledge_inheritance;

/**
 *
 * @author Mostafizur
 */
class Parent{
 int pi, pj;
    void shopipj(){
        System.out.println("pi and pj=="+ pi +" "+ pj);
    }
}
 
class Child extends Parent{
    int pk;
    void showpk(){
        System.out.println("pk : =="+ pk);
    }
    void sum(){
        System.out.println("pi+pj+pk=="+(pi+pj+pk));
    }
}
class InheritExample {
    public static void main(String[] args) {
        Parent p=new Parent();
        Child c=new Child();
        p.pi=2;
        p.pj=7;
        System.out.println("contents of parent class");
        p.shopipj();
        System.out.println();
        c.pi=18;
        c.pj=27;
        c.pk=9;
        c.shopipj();
        c.showpk();
        System.out.println();
        System.out.println("sum of pi , pj, pk in child : ");
        c.sum();
    }
}
