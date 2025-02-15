package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamGenerate {
    public static void main(String[] args) {

        //컬렉션 스트림
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Stream<Integer> stream = list.stream();

        //배열 스트림
        int[] arr = {1,2,3,4};
        IntStream stream1 = Arrays.stream(arr);

        //builder
        Stream<String> stream2 = Stream.<String>builder().add("a").add("b").add("c").build();

        //generate -> 람다 사용
        Stream<String> stream3 = Stream.generate(() -> "hi").limit(5);

        //iterate -> 초기값 + 람다
        Stream<Integer> stream4 = Stream.iterate(10, n -> n + 2).limit(3);


        //기본 타입형 스트림
        IntStream intStream = IntStream.range(1, 5); // 1<x<%
        LongStream longStream = LongStream.rangeClosed(1, 5); // 1<x<=5
        Stream<Long> boxed = LongStream.rangeClosed(1, 5).boxed();


        //문자열 스트림
        IntStream charsStream = "Stream".chars();

        //병렬 스트림
        Stream<Integer> parallelStream = list.parallelStream();
        IntStream parallel = IntStream.range(1, 5).parallel();

        //파일스트림
        //스트림 연결
        Stream<String> concat = Stream.concat(stream2, stream3);
    }
}
