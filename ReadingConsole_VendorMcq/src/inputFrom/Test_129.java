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
public class Test_129 {

    int a1;

    public static void doProduct(int a) {
       
        a = a * a;
    }

    public static void doString(StringBuilder s) {
        s.append(" "+s);
    }

    public static void main(String[] args) {
        Test_129 item = new Test_129();
        item.a1 = 11;
        StringBuilder sb = new StringBuilder("Hello");
        Integer i = 10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i + " " + sb + " " + item.a1);
    }

}
