package com.test;

import java.util.Stack;

public class ThreadConditionTest {


    public static void main(String[] args) {
        Stack <String> strings = new Stack<>();
        GetAppleConditionTest appleConditionTest = new GetAppleConditionTest(strings);
        PutAppleConditionTest putAppleConditionTest = new PutAppleConditionTest(strings);
        Thread getThread = new Thread(appleConditionTest);
        Thread putThread = new Thread(putAppleConditionTest);

        putThread.start();
        getThread.start();

    }
}
