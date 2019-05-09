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
public class OldEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name : ");
        int nubmer=input.nextInt();
        
        if (nubmer %2==0) {
            System.out.println("even number : "+ nubmer);
        }else{
            System.out.println("old number : "+nubmer);
        }
        System.out.println("Enter new number: ");
        
    }
}
