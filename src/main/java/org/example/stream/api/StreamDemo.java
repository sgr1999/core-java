package org.example.stream.api;

import java.util.*;

public class StreamDemo {

    public static void evenNumber(List<Integer> list){

        List<Integer> result = list.stream()
                .filter(v -> v%2==0)
                .map(x -> x * 2).toList();
        System.out.println(result);
    }

    public static void sumOfNumber(List<Integer> list){

        Integer result = list.stream().filter(v -> v > 10)
                .reduce(0,Integer::sum);
        System.out.println(result);
    }

    public static void secondHighestNumber(List<Integer> list){

        Optional<Integer> value = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        value.ifPresent(System.out::println);
    }


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35);

        evenNumber(list);
        sumOfNumber(list);
        secondHighestNumber(list);
    }
}
