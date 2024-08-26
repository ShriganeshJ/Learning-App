package org.core.java.interview;

import java.util.Arrays;

public class ReversArrayFromIndex {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70,80,90};
        int index=4;

        Arrays.stream(reverseArrayFromIndex(arr, index)).forEach(i-> System.out.println(i));

    }

    public static int[] reverseArrayFromIndex(int[] arr, int startIndex) {
         int endIndex=arr.length-1;

       while (startIndex<endIndex)
       {
           int temp = arr[startIndex];
           arr[startIndex] = arr[endIndex];
           arr[endIndex] = temp;
           startIndex++;
           endIndex--;
       }

        return arr;
    }
}
