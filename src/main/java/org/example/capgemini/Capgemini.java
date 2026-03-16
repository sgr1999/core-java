package org.example.capgemini;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Capgemini {

    public void secondRoundQuestion(){
//        Find the first non-repeated character in a string.
//        String input = "aabbcddeff";


        String str = "aabbcddeff";

        Map<Character,Long> charCount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        charCount.entrySet().stream()
                .filter(entry -> entry.getValue()==1)
                .map(Map.Entry::getKey).findFirst();

    }
    public static void main(String[] args) {

        //First round
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
