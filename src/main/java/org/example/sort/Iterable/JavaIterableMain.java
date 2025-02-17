package org.example.sort.Iterable;

import java.util.*;
import java.lang.*;
public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        printAll(list.iterator());
        printAll(set.iterator());
        foreach(list);
        foreach(set);
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator.getClass());
        while(iterator.hasNext()){
            System.out.println("value = " + iterator.next());
        }
    }

    private static void foreach(Iterable<Integer> iterable) {
        for(Integer i : iterable){
            System.out.println(i);
        }
    }
}
