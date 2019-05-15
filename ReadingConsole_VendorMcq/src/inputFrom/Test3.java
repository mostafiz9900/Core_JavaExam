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
public class Test3 {
    public static void main(String[] args) {
         String[][] arr= {
        {"A", "B", "C", "F"},
        {"D", "E"}
    };
         for (int i = 0; i <arr.length; i++) {
            
             for (int j = 0; j < arr[i].length; j++) {
                 System.out.println(arr[i][j]+ " ");
                 if (arr[i][j].equals("B")) {
                     break;
                     
                 }
                 
             }
             continue;
        }
    }
    
}
