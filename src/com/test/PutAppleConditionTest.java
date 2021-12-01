package com.test;

import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PutAppleConditionTest implements Runnable{

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    private Stack<String> appleStack = new Stack<>();

    PutAppleConditionTest(Stack stack){
        this.appleStack = stack;
    }

    @Override
    public void run() {
        lock.lock();

        while(!Thread.currentThread().isInterrupted()){
            if(appleStack.size() == 0){
                for(int i=0;i<5;i++){
                    String appleName = "apple" + i;
                    appleStack.push(appleName);
                    System.out.println("放苹果:" + appleName);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //condition.notify();
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

        lock.unlock();
    }
}
