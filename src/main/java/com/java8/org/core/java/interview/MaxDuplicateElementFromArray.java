package org.core.java.interview;

import java.util.*;
import java.util.stream.Collectors;

public class MaxDuplicateElementFromArray {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,50,44,88,88,35,41,35,96,36,45,96);
        System.out.println("Max Duplicate Element::"+list.stream().distinct().mapToInt(Integer::intValue).max());
        //All Max Duplicate Element from list
        Set<Integer> set = new HashSet<>();
       var element= list.stream().filter(i->!set.add(i))
                .collect(Collectors.toSet());
        System.out.println("All Duplicate Element is"+element);



    }
}
