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
public class Test82 {
    public static void main(String[] args) {
        String s = "Java Duke";
        int len =s.trim().length();
        System.out.println(len);
        
        String names[] ={"Thmas", "Peter" , "Joseph"};
        System.out.println(names.length+"");
        for (String  ss : names) {
            System.out.println(ss + " " );
        }
        String pws [] = new String[3];
        System.out.println(pws.length);
        
        // Test 83
        boolean a =new Boolean(Boolean.valueOf(args[0]));
        boolean b = new Boolean(args[1]);
        System.out.println(a + " " + b);
        
        
    }
    
}
