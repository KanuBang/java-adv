package org.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntermediateOperation {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Eric", "Elena", "Java");

        //filter -> 필터(filter)은 스트림 내 요소들을 하나씩 평가해서 걸러내는 작업
        Stream<String> stream = names.stream().filter(name -> name.contains("a"));
        System.out.println(stream);

        //map -> 맵(map)은 스트림 내 요소들을 하나씩 특정 값으로 변환
        Stream<String> stream1 = names.stream().map(String::toUpperCase);

        //flatMap

        //sort
        List<Integer> collect = IntStream.of(4, 2, 6, 1)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        System.out.println(collect.toString());

        List<String> lang =
                Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");

        List<String> collect1 = lang.stream().sorted().collect(Collectors.toList());
        System.out.println(collect1.toString());

        List<String> collect2 = lang.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect2.toString());

        
        int sum = IntStream.of(1, 2, 3).sum();


    }
}
