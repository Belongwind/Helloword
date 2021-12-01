package com.test.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Object [] str = list.toArray();
        System.out.println(list);

        Map map = new HashMap<>();
        map.put("1","str");
        map.put("2","b");
        System.out.println(map);

        Set<String> set = new HashSet<>();
        set.add("s");
        System.out.println(set);

        Stream<String> stream = list.stream();
        Collection collection = stream.filter(a -> a.contains("a")).collect(Collectors.toList());
        //Collection collection = stream.collect(Collectors.toList());

        System.out.println(collection);
        System.out.println(collection.getClass());
        collection.forEach(System.out::println);


        List l = new ArrayList(20);
        l.add(1);
        System.out.println(l.size());

        Map map1 = new HashMap();
        map1.put("a","a");
        map1.put("b","b");
        map1.put("c","c");
        map1.put("d","d");
        map1.put("a","b");
        map1.put("a","c");

    }
}
