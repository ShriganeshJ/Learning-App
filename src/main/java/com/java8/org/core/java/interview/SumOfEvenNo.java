package org.core.java.interview;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
      int sum=  list.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even no is"+sum);
    }
}
