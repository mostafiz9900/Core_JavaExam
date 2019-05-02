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
public class Test_84 {
    public static void main(String[] args) {
        int [][] arr=new int [3][5];
        arr[0]=new int []{1,3,5,7};
        arr[1]=new int[]{1,3};
        arr[2]=new int[]{1,5};
        
        for (int[] a : arr) {
            for (int i :a) {
                System.out.println(i+" ");
                
            }
            System.out.println();
        }
    }
}
