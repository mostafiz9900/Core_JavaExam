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
public class InstanceCounter {

    static {
        System.out.println("Class InstanceCounter Loading ..........");
    }
    static final long ONE_DAY_IN_MILLIS = 24 * 60 * 60 * 1000;
    static int instanceCounter;

    static {
        System.out.println("ONE_DAY_IN_MILLIS=" + ONE_DAY_IN_MILLIS + " instanceCounter " + instanceCounter);
    }

    {
        instanceCounter++;
        System.out.println("instanceCounter" + instanceCounter);
    }

    public static void main(String[] args) {
        System.out.println("Sttarting InstanceCounter Main Method");
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        System.out.println("instanceCounter in main :" + instanceCounter);
    }

    static {
        System.out.println("Class InstanceCounter Loaded");
    }
}
