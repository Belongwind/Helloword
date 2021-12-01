package com.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ChineseTest {


    public static void main(String[] args) {

        char a = '我';
        System.out.println((byte)a);
        System.out.println(a);

        String w = "我";
        System.out.println(w.getBytes());
        System.out.println(w.getBytes().length);

        String two = Integer.toBinaryString(127);
        System.out.println(two);
        String t = Integer.toOctalString(127);
        System.out.println(t);
        String hexStr = Integer.toHexString(127);
        System.out.print(hexStr);

        char b = 'b';
        System.out.println();

        //CopyOnWriteArrayList
    }

    public void test(){
        char a = '我';

    }

}
