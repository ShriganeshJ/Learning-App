package org.core.java.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestNo {
    public static void main(String[] args) {
        //find duplicate element from string
        String name="google";

        Map<String,Long> map = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        //second last min no
        int [] iarr={10,20,50,80,70,80,95,95,82,45,63,87};
        Integer secondLast=  Arrays.stream(iarr)
                .boxed()
                .sorted()
                .distinct()
                .skip(1)
                .findFirst().get();
        System.out.println("Second last min no "+secondLast);

        //second last max no
        Integer secondLastMax=  Arrays.stream(iarr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst().get();
        System.out.println("Second last max no "+secondLastMax);
    }
}
