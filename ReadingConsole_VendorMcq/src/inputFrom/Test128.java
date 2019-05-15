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
public class Test128 {
    public static void main(String[] args) {
        int  array[]={10,20,30,40,50};
        int x=array.length;
        while (x>0) {            
            //x--;
            System.out.println(array[--x]);
        }
    }
}
