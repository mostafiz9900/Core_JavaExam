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
public class Test_90 {
    public static void main(String[] args) {
        String names[] ={"Thomas","Peter", "Joseph"};
        String pws[]=new String[3];
        int idx=0;
       String[] pwd = names;
        try {
            for (String n: names) {
                
                pwd[idx]=n.substring(2, 6);
                idx++;
            }
        } catch (Exception e) {
            System.out.println("Invalid Name");
        }
        for (String p: pws) {
            System.out.println(p);
        }
    }
}
