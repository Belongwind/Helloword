package com.test.stream;

import java.util.*;

public class PrintTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        System.out.println(list);

        Map map = new HashMap<>();
        map.put("1","str");
        map.put("2","b");
        System.out.println(map);

        Set<String> set = new HashSet<>();
        set.add("s");
        set.add("d");
        System.out.println(set);

        String [] s =new String[]{"a","d"};
        List<String> sList = new ArrayList<String>(Arrays.asList(s));
        System.out.println(sList);
    }
}
