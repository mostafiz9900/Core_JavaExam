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
public class ComputeLoan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your annaual interest rate : ");
        double annaualInterestRate = input.nextDouble();

        double monthlyInterestRate = annaualInterestRate / 1200;

        System.out.println("No Of Year : ");
        int noOfYear = input.nextInt();

        System.out.println("Lone Amount : ");
        double loanAmount = input.nextDouble();

        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, noOfYear * 12));

        double totalPayment=monthlyPayment *noOfYear*12;
                
                System.out.println("The monthly payment is Tk. " + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment : "+(int) (totalPayment*100)/100.0);
    }
}
