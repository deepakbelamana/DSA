package com.practicepackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreams {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", 4000.0));
        employees.add(new Employee(2, "Bob", 6000.0));
        employees.add(new Employee(3, "Samuel", 8000.0));

        /*
            get employess whose salary is greater than 6000 and their name starts with "s"
         */
        List<Employee>empStartsWithS = employees.stream().filter(e->e.getSalary()>6000.0 && e.getName().toLowerCase().startsWith("s"))
                                        .collect(Collectors.toList());
        System.out.println(empStartsWithS);
        /*
            give 40% hike to each employee and print
         */
        List<Employee>hiked= employees.stream().map(e-> new Employee(e.getId(),e.getName(),e.getSalary()*1.4)).collect(Collectors.toList());

        System.out.println(hiked);

        /**
         * max salaried employee
         */
        Double maxSalariedEmp = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get().getSalary();
        System.out.println(maxSalariedEmp);
    }
}
