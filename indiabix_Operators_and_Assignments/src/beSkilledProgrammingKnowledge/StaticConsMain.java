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
class StaticCons{

    public StaticCons() {
        System.out.println("super");
    }

}
public class StaticConsMain extends StaticCons{
    void someMethod(){
        System.out.println("method is sub");
    }
    public static void main(String[] args) {
        StaticConsMain staticConsMain=new StaticConsMain();
        staticConsMain.someMethod();
    }
}
