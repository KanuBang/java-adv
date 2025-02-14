package org.example.collection.testMapQueueStack;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] str = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String key : str) {
            map.put(key, map.getOrDefault(key,0)+1);
        }

        System.out.println(map);
    }
}
