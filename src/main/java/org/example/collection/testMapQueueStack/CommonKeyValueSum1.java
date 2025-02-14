package org.example.collection.testMapQueueStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A",1, "B",2,"C",3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Set<String> keySet = map1.keySet();
        for (String key : keySet) {
            if(map2.containsKey(key)){
                System.out.println("key: " + key + " value: " + (map1.get(key) + map2.get(key)));
            }
        }
    }
}
