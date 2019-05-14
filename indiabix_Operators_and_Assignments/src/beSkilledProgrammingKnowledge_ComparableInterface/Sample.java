/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledge_ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Mostafizur
 */
public class Sample {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101, "Mostafiz", 23));
        list.add(new Student(102, "Sofiqul", 27));
        list.add(new Student(108, "Mahabub", 21));

        Collections.sort(list);
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student st = iterator.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
