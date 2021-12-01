package com.test.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        Stream<String> stream = list.stream();
        Collection collection = stream.filter(a -> a.contains("a")).collect(Collectors.toList());
        //Collection collection = stream.collect(Collectors.toList());

        System.out.println(collection);
        System.out.println(collection.getClass());
        collection.forEach(System.out::println);

    }
}
