package com.practicepackage;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(22);
        numbers.add(21);
        numbers.add(23);
        numbers.add(4);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers); // Output: [1, 2, 2, 3, 4, 4, 4, 5]
        /**
         * print duplicates
         */
        Set<Integer> s = numbers.stream().filter(x -> Collections.frequency(numbers, x) > 1).collect(Collectors.toSet());
        System.out.println(s);
        Integer max = numbers.stream().max(Integer::compare).get();
        System.out.println(max);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b).intValue();
        double avg = numbers.stream().mapToInt(e -> e).average().getAsDouble();
        List<Integer> startsWithTwo = numbers.stream()
                .map(x -> String.valueOf(x))
                .filter(x -> x.startsWith("2")).map(x -> Integer.valueOf(x)).limit(2).collect(Collectors.toList());
        List<Integer> sorted = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> secondHightest = numbers.stream().sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(startsWithTwo);
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(sorted);
        System.out.println(secondHightest);


    }
}

