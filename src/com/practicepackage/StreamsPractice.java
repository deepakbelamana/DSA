package com.practicepackage;

import java.util.Arrays;
import java.util.List;

public class StreamsPractice {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 20, 30, 40,53,65,77,31);

        integerList.stream().filter(x->x%2!=0).forEach(x-> System.out.println(x));

    }
}
