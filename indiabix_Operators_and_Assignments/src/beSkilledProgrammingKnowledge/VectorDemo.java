/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledge;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Mostafizur
 */
public class VectorDemo {

    public static void main(String[] args) {
        Vector v = new Vector(3, 2);
        System.out.println("Initial size : " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("Capacity after four additions : " + v.capacity());
        v.addElement(new Double(5.45));
        System.out.println("Current capacity : " + v.capacity());

        v.addElement(new Double(6.08));
        System.out.println("Current capacity : " + v.capacity());

        v.addElement(new Float(9.4));
        System.out.println("Current capacity : " + v.capacity());

        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("firstElement  : " + (Integer) v.firstElement());
        System.out.println("lastElement : " + (Integer) v.lastElement());
        
        if (v.contains(new Integer(3))) {
            System.out.println("Vector contains :3.");
        }
        Enumeration vEnum=v.elements();
        while (vEnum.hasMoreElements()) {            
            System.out.print(vEnum.nextElement()+" ");
        }
        System.out.println();

    }
}
