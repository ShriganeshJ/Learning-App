package org.core.java.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElementFromStringUsingJava8 {
    public static void main(String[] args) {
        String str ="Google";
        Set<Character> set = new HashSet<>();
       int arr[]= str.chars().filter(i->!set.add((char)i)).toArray();
       Arrays.stream(arr).forEach(i-> System.out.println((char)i));
        /**
         *
         * Using groupingBy
         */

        String arr1[] =str.split("");

        Map<String, Long> duplicate1 = Arrays.stream(arr1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        duplicate1.forEach((k,v) -> {
            System.out.println("Duplicate Char::"+k +"  Count::"+v);
        });

    }
}
