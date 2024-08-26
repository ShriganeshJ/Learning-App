package org.core.java.interview;

import org.ecom.pojo.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxSalEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(10,"raha",15000.0,"IT"),
                new Employee(101,"Hob",15000.0,"IT"),
                new Employee(102,"rom",81000.0,"IT"),
                new Employee(107,"Neh",17000.0,"IT"),
              new Employee(108,"Pal",570000.0,"IT"));


       Employee highSal= employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSal))).get();

        System.out.println("High Sal Employee "+highSal);

    }
}
