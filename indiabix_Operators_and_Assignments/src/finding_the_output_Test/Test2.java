/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finding_the_output_Test;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Mostafizur
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrr=new ArrayList<>();
        arrr.add(1);
        arrr.add(2);
        arrr.add(3);
        arrr.add(4);
        arrr.add(null);
        arrr.remove(2);
        arrr.remove(null);
        System.out.println(arrr);
        
        LocalDateTime dat=LocalDateTime.of(2014, 7, 31, 1, 1);
        dat.plusDays(31);
        dat.plusMonths(1);
        System.out.println(dat.format(DateTimeFormatter.ISO_DATE));
    }
}
