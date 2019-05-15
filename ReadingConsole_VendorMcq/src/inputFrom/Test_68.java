/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputFrom;

/**
 *
 * @author Mostafizur
 */
public class Test_68 {
    static double area;
    int b=2, h=3;
    public static void main(String[] args) {
        double p = 0, b = 0, h = 0;
        if (area==0) {
            b=3;
            h=4;
            p=0.5;
        }
        area= p * b *  h;
        System.out.println("Area is "+ area);
    }
}
