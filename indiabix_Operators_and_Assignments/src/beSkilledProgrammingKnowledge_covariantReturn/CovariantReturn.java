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
public class CovariantReturn extends Base {

    @Override
    SuperA getObject() {
        System.out.println("CovariantReturn");
        return new SubB(); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        Base test = new CovariantReturn();
        System.out.println(test.getObject() instanceof SubB);
        System.out.println(test.getObject().x);
    }

}
