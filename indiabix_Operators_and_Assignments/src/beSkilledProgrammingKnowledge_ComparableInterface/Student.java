/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledge_ComparableInterface;

/**
 *
 * @author Mostafizur
 */
public class Student implements Comparable {

    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Student st = (Student) o;
        System.out.println("======= " + this.age + " Compare with " +st.age);
        return this.age-st.age;
        //return st.age - this.age;
    }

}
