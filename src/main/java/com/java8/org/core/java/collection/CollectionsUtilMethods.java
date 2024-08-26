package org.core.java.collection;

import java.util.*;

public class CollectionsUtilMethods {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","wxy");
        Collections.synchronizedList(list);
        Map<String,String> map = new HashMap<>();
        Collections.synchronizedMap(map);
    }
}
