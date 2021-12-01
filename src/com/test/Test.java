package com.test;

public class Test {

    public void change(String str, char ch[]){
        str = "test ok";
        ch [0] ='g';
    }

    public static void main(String[] args) {

        String str = new String("good");
        char [] ch = {'a','b','c'};

        Test test = new Test();
        test.change(str, ch);
        System.out.print(str + "and ");
        System.out.print(ch);


        System.out.print(Math.round(12.5));
        System.out.print(Math.round(-12.5));

    }
}
