/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputFrom;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mostafizur
 */
public class Test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
      names.add("Robb");
      names.add("Bran");
      names.add("Rick");
      names.add("Bran");
        if (names.remove("Bran")) {
            names.remove("Rick");
            System.out.println(names);
        }
        System.out.println(names);
    }
}
