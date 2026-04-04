package org.example.stream.api;

import java.util.*;
import java.util.stream.Collectors;

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

    public static void findMaxNum(List<Integer> list){

        Integer result = list.stream()
                .reduce((a,b) -> a < b ?b : a).orElse(0);
        System.out.println(result);
    }

    public static void secondHighestNumber(List<Integer> list){

        Optional<Integer> value = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        value.ifPresent(System.out::println);
    }

    public static void greaterThenNumCount(List<Integer> list){

        Long result = list.stream().filter(v -> v > 25).count();
        System.out.println(result);
    }

    public static void startWithA(List<String> list){

        List<String> result = list.stream().filter(s -> s.startsWith("a"))
                .map(String::toUpperCase).toList();

        System.out.println(result);
    }

    public static void squareOfNumber(List<Integer> list){

        Map<Integer,Integer> result = list.stream().collect(Collectors.toMap(a-> a,
                a -> a*a));

        System.out.println(result);
    }

    public static void squareOfNumberWithSorting(List<Integer> list){

        Map<Integer,Integer> result = list.stream()
                .sorted()
                .collect(Collectors.toMap(
                        a-> a,
                    a -> a*a,
                        (a,b) -> a,
                        LinkedHashMap::new
                ));

        System.out.println(result);
    }

    public static void checkDuplicate(List<String> list){
        list.stream().collect(Collectors.groupingBy())
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35);
        List<String> str = Arrays.asList("sagar", "ram", "shyam", "amit", "anil");

//        evenNumber(list);
//        sumOfNumber(list);
//        secondHighestNumber(list);
//        findMaxNum(list);
//        greaterThenNumCount(list);
        startWithA(str);
        squareOfNumber(list);
        squareOfNumberWithSorting(list);
    }
}
