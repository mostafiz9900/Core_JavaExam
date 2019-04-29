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
public class Test101 {
    static  int count =0;
    int  i =0;
    public void chanqeCount(){
        while (i<5) {
i++;
count++;            
            
        }
    }
    public static void main(String[] args) {
        Test101 check1=new Test101();
        Test101 check2=new Test101();
        check1.chanqeCount();
        check2.chanqeCount();
        System.out.println(check1.count+ " : " + check2.count);
    }
}
