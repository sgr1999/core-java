package org.example.capgemini;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Capgemini {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1,"Sagar");
        hashMap.put(2,"Sagar");
        hashMap.put(3,"Ronit");

        Map<String,Long> valueCount = hashMap.values().stream()
                .collect(Collectors
                        .groupingBy(v-> v, Collectors.counting()));

        Stream<String> myString = Stream.of("a","b","c");
        myString.forEach(System.out::println);
        System.out.println(valueCount);
    }
}
