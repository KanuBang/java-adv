package org.example.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String,Integer> studentMap = new HashMap<>();


        studentMap.put("studentA", 90);
        studentMap.put("studentA", 100);

        studentMap.put("studentB", 80);
        studentMap.put("studentC", 70);

        System.out.println(studentMap.get("studentA"));

        if(!studentMap.containsKey("studentB")) {
            studentMap.put("student", 99999);
        }

        studentMap.putIfAbsent("studentC", 88888);
        studentMap.putIfAbsent("studentD",12341234);
        System.out.println(studentMap);
    }
}
