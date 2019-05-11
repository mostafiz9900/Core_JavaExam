/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledge_covariantReturn;

/**
 *
 * @author Mostafizur
 */
public class Base {
    SuperA getObject(){
        System.out.println("Base");
        return new SuperA();
    }
}
