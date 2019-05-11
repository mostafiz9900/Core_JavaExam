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
public class Manager extends Employee {

    public String department;

    public Manager(String department) {
        this.department = department;
    }

    public Manager(String department, String name, int id) {
        super(name, id);
        this.department = department;
    }

//    @Override
//    String getDetails() {
//        return "subdetails"; //To change body of generated methods, choose Tools | Templates.
//    }

    public static void main(String[] args) {
        Manager mgt = new Manager("Java", "Mostafizur Rahman", 1);
//        Employee e = new Manager("B", "Sofiqut", 2);
//        mgt = (Manager) e;
        System.out.println(mgt.getDetails());
    }

}
