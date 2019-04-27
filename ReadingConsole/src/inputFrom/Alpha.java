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
public class Alpha {
    int ns;
    static int s;

    public Alpha(int ns) {
        if (s < ns) {
            s= ns;
            this.ns=ns;
            
        }
    }
    void doPrint(){
        System.out.println("ns = "+ ns + " s =" + s);
    }
}
