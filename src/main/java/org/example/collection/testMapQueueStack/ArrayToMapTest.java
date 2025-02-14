package org.example.collection.testMapQueueStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},
                {"JPA", "30000"}};

        Map<String,String> map = new HashMap<>();

        for(int i=0; i < productArr.length; i++) {
            map.put(productArr[i][0], productArr[i][1]);
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("제품: " + entry.getKey() + ", 가격: " + entry.getValue());
        }
    }
}
