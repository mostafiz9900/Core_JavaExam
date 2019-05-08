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
public class Test_2 {
      static int s;
    public static void main(String [] args) 
    {
     Test_2 p= new Test_2();
        p.start();
        System.out.println(s);
    }

    void start() 
    {
        int x = 7;
        twice(x);
        System.out.print(x + " ");
    }

    void twice(int x) 
    {
        x = x*2;
        s = x;
    }
}
