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
public class Employee {
    public String name;
    public int employeeid;

    public Employee() {
        this.employeeid=1;
        this.name="Mostafiz";
    }

    public Employee(String name, int id) {
        this.name = name;
        this.employeeid = id;
    }
    String getDetails(){
    return "Id is "+employeeid+" and Name is "+ name;
    }
    
}
