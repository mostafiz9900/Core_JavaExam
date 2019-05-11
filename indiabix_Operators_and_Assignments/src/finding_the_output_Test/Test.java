/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finding_the_output_Test;

/**
 *
 * @author Mostafizur
 */
public class Test {

    public static void main(String[] args) {
        Employee employee = new Employee();

        Manager manager = new Manager();

        Director director = new Director();
        employee.salary = 20;
        director.salary = 50;
        manager.buddge = 50;
        director.stock = 90;
        director.salary = 90;

        
    }
}
