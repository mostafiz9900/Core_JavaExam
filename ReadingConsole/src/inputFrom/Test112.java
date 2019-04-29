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
public class Test112 {
    public static void main(String[] args) {
        String strl = "Java";
        String[] str2={"J","a", "v","a"};
        String str3="";
        for (String str :str2) {
            str3=str3+str;
        }
        boolean b1=(strl==str3);
        boolean b2=(strl.equals(str3));
        System.out.println(b1+ " , "+ b2);
    }
}
