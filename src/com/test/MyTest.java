package com.test;

import java.math.BigDecimal;
import java.util.*;

public class MyTest {


    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        list.add("1");
        list.add("2");
        System.out.println(list);

        //list 转array
        String b[] = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(b));


        //array 转list
        List l = Arrays.asList(new String[]{"a","b"});
        //快速打印list
        System.out.println(l);

        //打印array
        String a[]=new String[]{"hello","world"};
        System.out.println(Arrays.toString(a));

        Map map = new HashMap<>();
        //为什么加transient

        int i = 129;
        byte byt =(byte)i;
        System.out.println(byt);

        int c = Math.max(2,10);
        System.out.println(c);

        double f = 111231.5585;
        BigDecimal bigDecimal = new BigDecimal(f);
        double b1 = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(b1);

    }
}
