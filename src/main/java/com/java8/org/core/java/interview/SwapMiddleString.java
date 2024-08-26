package org.core.java.interview;

import java.util.Arrays;
import java.util.Collections;

public class SwapMiddleString {
    public static void main(String[] args) {
        String str[] ={"abc","hob","bob","xyz"};
        Collections.swap(Arrays.asList(str),1,2);
        Arrays.stream(str).forEach(i-> System.out.println(i));
    }
}
