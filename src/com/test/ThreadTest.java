package com.test;

public class ThreadTest {


    public static void main(String[] args) throws InterruptedException {


        //Thread thread = new Thread();
        //thread.interrupt();

        //Thread.interrupted();

        test();
    }

    public static void test() throws InterruptedException {
        Thread threadA = new Thread(){
        int count = 0;
            @Override
            public void run() {
                while (count <5){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("aaa");
                    count ++;
                }

            }
        };

        Thread threadB = new Thread(){

            @Override
            public void run() {
                try {
                    threadA.join();
                    System.out.println("bbbb");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        threadA.start();
        Thread.sleep(2000);
        threadB.start();
    }


}
