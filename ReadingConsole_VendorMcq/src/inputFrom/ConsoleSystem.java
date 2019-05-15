
package inputFrom;

import java.util.Scanner;


public class ConsoleSystem {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("Enter yout radias :");
        double radius=input.nextDouble();
        double area=radius*radius*3.14159;
        System.out.println("The radius is "+ radius + " is "+ area);
        
        double nub1=input.nextDouble();
        double nub2=input.nextDouble();
        double nub3=input.nextDouble();
        double ava=(nub1+nub2+nub3)/3;
        System.out.println("The avarage of "+ nub1+" "+ nub2+ " "+ nub3 + " is "+ ava);
     
      
    }
}
