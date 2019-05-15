/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputFrom;

import java.util.ArrayList;

/**
 *
 * @author Mostafizur
 */
public class Test_102 {
    public static void main(String[] args) {
        ArrayList<Integer> p=new ArrayList<>();
        p.add(1);
        p.add(2);
        p.add(3);
        p.add(4);
        p.add(null);
        p.remove(2);
        p.remove(null);
        System.out.println(p);
    }
}
