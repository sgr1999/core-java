package org.example.unknown.company;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        String str = "sagardgset";

        Map<Character,Long> charCount = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet().stream().filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println(charCount);

//        select MAX(salary) as second_highest_salary from employee
//        where salary < (select max(salary) from employee);
    }
}
