/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilledProgrammingKnowledge;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Mostafizur
 */
public class CollectionExample {

    public static void main(String[] args) {
        List l = new LinkedList();
        l.add("List:angel");
        l.add("schildt");
        l.add("mathew");
        l.add("schildt");
        print(l);
        Set s = new HashSet();
        s.add("set:rose");
        s.add("schildt");
        s.add("mathew");
        s.add("schildt");
        print(s);

        SortedSet ss = new TreeSet();
        ss.add("set:rose");
        ss.add("schildt");
        ss.add("mathew");
        ss.add("schildt");

        print(ss);

        LinkedHashSet sss = new LinkedHashSet();
        sss.add("set:rose");
        sss.add("schildt");
        sss.add("mathew");
        sss.add("schildt");
        print(sss);

        Map m = new HashMap();
        m.put("map", "HashMap");
        m.put("schildt", "java2s");
        m.put("mathew", "Hyden");
        m.put("schildt", "java2");
        print(m.keySet());
        print(m.values());

        SortedMap ms = new TreeMap();
        ms.put("map", "HashMap");
        ms.put("schildt", "java2s");
        ms.put("mathew", "Hyden");
        ms.put("schildt", "java2");
        print(ms.keySet());
        print(ms.values());

        LinkedHashMap lm = new LinkedHashMap();
        lm.put("map", "HashMap");
        lm.put("schildt", "java2s");
        lm.put("mathew", "Hyden");
        lm.put("schildt", "java2");
        print(lm.keySet());
        print(lm.values());

    }

    static void print(Collection coll) {
        Iterator iter = coll.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
