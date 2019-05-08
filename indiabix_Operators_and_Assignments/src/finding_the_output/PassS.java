/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finding_the_output;

/**
 *
 * @author Mostafizur
 */
public class PassS {
    public static void main(String[] args) {
        PassS s=new PassS();
        s.start();
    }
    void start(){
     String s1 = "slip";
        String s2 = fix(s1);
        System.out.println(s1 + " " + s2);
    }
    String fix(String s1){
    s1 = s1 + "stream";
        System.out.print(s1 + " ");
        return "stream";
    }
}
