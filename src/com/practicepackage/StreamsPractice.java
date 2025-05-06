package com.practicepackage;

import java.util.*;
import java.util.function.Function;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 20, 30, 40,53,65,77,31);

        /*
            find longest string in list using stream
         */
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
        Optional<String> longestString = strings
                .stream()
                .max(Comparator.comparingInt(String::length));
        List<String> longest = strings.stream().sorted(Collections.reverseOrder()).limit(1).collect(Collectors.toList());
        System.out.println(longest);

        List<Integer> list1 = Arrays.asList(1, 3,4, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(3,2, 4, 6, 8, 10);
        /*
        merge two sorted list
         */
        List<Integer> mergedList =Stream.concat(list1.stream(),list2.stream()).sorted().collect(Collectors.toList());
        System.out.println(mergedList);
        /*
        find intersection
         */
        List<Integer> intersection = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
        System.out.println(intersection);
        /*
        removing duplicates preserving the order
         */
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> noD = numbersWithDuplicates.stream().distinct().collect(Collectors.toList());
        System.out.println(noD);
        /*
            kth smallest element
         */
        List<Integer> list = Arrays.asList(1, 3,4, 5, 7, 9);
        List<Integer> kthSmallest = list.stream().sorted().limit(3).skip(2).collect(Collectors.toList());
        System.out.println(kthSmallest);
        /*
            frequency of words in List
         */
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");

        Map<String, Long> wordFrequency = words
                .stream()
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting())
                );
        /**
         * partition list based on condition
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> partitioned = numbers
                .stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        List<Integer> evenNumbers = partitioned.get(true);
        List<Integer> oddNumbers = partitioned.get(false);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);

        /**
         * first non-repeating character in string
         */
        String s = "deepak";
        Optional<Character> firstNonRepeated = s.chars()
                .mapToObj(c -> (char) c) // Convert int to Character
                .collect(Collectors.groupingBy(c->c,LinkedHashMap::new, Collectors.counting())) // Count occurrences
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1) // Keep only non-repeated characters
                .map(Map.Entry::getKey)
                .findFirst(); // Get the first one
        System.out.println(firstNonRepeated.get());

        List<Integer> listone = Arrays.asList(1,3,4, 5, 7, 9);
        List<Integer> listtwo = Arrays.asList(3,2, 4, 6, 8, 10);
        List<Integer> mergedNewList = Stream.concat(listone.stream(),listtwo.stream()).sorted().toList();
        System.out.println(mergedNewList);
        System.out.println(mergedNewList.get(mergedNewList.size()/2));
        

    }
}
