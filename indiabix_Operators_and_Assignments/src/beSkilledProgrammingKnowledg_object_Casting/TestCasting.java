/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledg_object_Casting;

/**
 *
 * @author Mostafizur
 */
public class TestCasting {

    public static void main(String[] args) {
        Animal aml = new Animal();
        Cat c = new Cat();
        //up casting is implicit and safe
        aml = c;//no cast need for upcasting 
        System.out.println(aml.health);
        /**
         * Converting an instance of a subclass to an instance of a superclass
         * loses the information down casting is always explicit
         */
        c = (Cat) aml;//must cast explicitly for downcastin 
        System.out.println(c.health);
    }
}
