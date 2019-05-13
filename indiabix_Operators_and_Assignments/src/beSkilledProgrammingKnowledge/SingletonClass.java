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
public class SingletonClass {
    private static SingletonClass obj=null;
    static int i=20;
    

    private SingletonClass() {
    }
    public static SingletonClass getInstance(){
        if (obj==null) {
            obj=new SingletonClass();
        }
        
    return obj;
    }
    public static void main(String[] args) {
        System.out.println(i);
    }
    
}
