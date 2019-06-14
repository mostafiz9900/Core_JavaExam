/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled;

import java.util.Scanner;

/**
 *
 * @author Mostafizur
 */
public class OldEven2 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your 1st number : ");
        int m=input.nextInt();
        System.out.println("Enter Your 2nd number : ");
        int n =input.nextInt();
        
        for (int i = 0; i <=n; i++) {
            if (i%2==0) {
                System.out.println("old number : "+i);
            }else{
                System.out.println("Evend Numer : "+i);
            }
        }
                
    }
}
