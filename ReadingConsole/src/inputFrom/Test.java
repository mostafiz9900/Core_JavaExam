/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputFrom;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mostafizur
 */
public class Test {
    static int count =0;
     int i = 0;
     public  void changeCount(){
          while (i< 5) {
            i++;
            count++;
        }
     }
    public static void main(String[] args) {
       Test check1=new Test();
        Test check2=new Test();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count+" : " + check2.count);
  
    }
}
