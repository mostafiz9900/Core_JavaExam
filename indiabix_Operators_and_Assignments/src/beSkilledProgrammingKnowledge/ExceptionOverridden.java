/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledge;

import java.io.IOException;

/**
 *
 * @author Mostafizur
 */
public class ExceptionOverridden {
    void msg(){
        System.out.println("parent");
    }
    void someMethod()throws IOException{
        
    }
}
class TestA extends ExceptionOverridden{

}