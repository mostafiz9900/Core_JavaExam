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
public class InstanceVariable {

    public String name;
    private double salary;

    public InstanceVariable(String name) {
        this.name = name;
    }

    public void setSalary(double empSalary) {
         
        salary = empSalary;
    }

    public void printEmp() {
        System.out.println("Name : " + name);
        System.out.println("salary  : " + salary);
    }

    public static void main(String[] args) {
        InstanceVariable iv = new InstanceVariable("Mostafiz");
        iv.salary = 100;
        iv.printEmp();
    }
}
