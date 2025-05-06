package com.practicepackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndPeak {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", 4000.0));
        employees.add(new Employee(2, "Bob", 6000.0));
        employees.add(new Employee(3, "Samuel", 8000.0));

        /**
         * peak will not the transform the stream elements
         * it has a consumer which will not return anything
         * so no change in below operation
         */
        List<Employee> peekListEx = employees.stream().peek(x->x.setSalary(2000)).collect(Collectors.toList());
        System.out.println("peekListEx "+peekListEx);
        System.out.println("original List"+employees);

        /*
        where map has to return the transformed elements to the terminary operator
        and hence collectors collects the transormed elements
         */
        List<Employee> mapListEx = employees.stream().map(x-> {
             x.setSalary(30000);
             return x;
        }).collect(Collectors.toList());
        System.out.println("mapListex "+mapListEx);
        System.out.println("original List"+employees);

        /**
         * sort employees by name
         */
        List<Employee> sortByNames = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(sortByNames);
    }
}
