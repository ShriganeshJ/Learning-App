package org.core.java.interview;

import org.ecom.pojo.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareTwoListObject {
    public static void main(String[] args) {
        List<Employee>   employeeList = Arrays.asList(new Employee(10,"raja",10000,"IT"),
        new Employee(11,"ramesh",10000,"IT"),
                new Employee(12,"mahesh",20000,"IT"),
        new Employee(14,"pritish",10000,"IT"),
                new Employee(18,"pushpak",10000,"IT"),
                new Employee(19,"deepak",20000,"IT"));

        List<Employee>   employeeList2 = Arrays.asList(new Employee(10,"raja",10000,"IT"),
                new Employee(11,"ramesh",10000,"IT"));




       var missingEmployeeFromList2=
               employeeList2.stream().filter(two->employeeList2.stream()
                       .anyMatch(one->one.getName().equals(two.getName())))
                       .collect(Collectors.toList());

        System.out.println("missing employee name from list one is"+missingEmployeeFromList2);

    }
}
