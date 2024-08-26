package org.core.java.thread.Executer;

import java.util.HashMap;
import java.util.Map;

public class ThreadLocalCase {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        ThreadLocal threadLocal = new ThreadLocal();
        System.out.println("initial value not set "+threadLocal.get());
        //set value
        threadLocal.set("durga");
        System.out.println("after set value "+threadLocal.get());
        //remove
        threadLocal.remove();
        System.out.println("after remove value "+threadLocal.get());


    }
}
