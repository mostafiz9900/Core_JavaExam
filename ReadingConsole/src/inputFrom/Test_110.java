/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputFrom;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Mostafizur
 */
public class Test_110 {
    public static void main(String[] args) {
        int date[]={2010,2013,2014,2045,2014};
        int key=2014;
        int count = 0;
        for (int e : date) {
            if (e !=key) {
                continue;
                
                
            }
           
            count++;
        }
        System.out.println(count+ " ");
        
        
        LocalDateTime dt=LocalDateTime.of(2014, 7, 31, 1, 1);
        dt.plusDays(31);
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
    }
}
