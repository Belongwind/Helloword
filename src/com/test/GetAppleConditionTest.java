package com.test;

import java.util.Stack;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class GetAppleConditionTest implements Runnable{

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    private Stack<String> appleStack = new Stack<>();

    GetAppleConditionTest(Stack stack){
        this.appleStack = stack;
    }


    @Override
    public void run() {
        lock.lock();
        while(!Thread.currentThread().isInterrupted()){
            if(appleStack.size() > 0){
                String apple = appleStack.peek();
                System.out.println("取苹果:" + apple);
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                condition.notify();
            }else{

            }

        }
        lock.unlock();
    }
}
