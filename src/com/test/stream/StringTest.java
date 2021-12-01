package com.test.stream;

import java.util.ArrayList;
import java.util.List;

public class StringTest {

    public static void main(String[] args) {

        String s ="abc";

        //s = s+"1";



        System.out.println(s.concat("1"));
        s = "123";

        System.out.println(s);


        List<String> list =new ArrayList<>();
        list.add("a");
        list.addAll(new ArrayList<>());

    }
}
