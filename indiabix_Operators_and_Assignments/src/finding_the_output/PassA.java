/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finding_the_output;

/**
 *
 * @author Mostafizur
 */
public class PassA {
    
 public static void main(String [] args) 
    {
        PassA p = new PassA();
        p.start();
    }

    void start() 
    {
        long [] a1 = {3,4,5};
        long [] a2 = fix(a1);
        System.out.print(a1[0] + a1[1] + a1[2] + " ");
        System.out.println(a2[0] + a2[1] + a2[2]);
    }

    long [] fix(long [] a3) 
    {
        a3[1] = 7;
        return a3;
    }
}
