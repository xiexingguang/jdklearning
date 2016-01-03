package com.xxg.juc.CountDownLatcher;

import java.util.concurrent.CountDownLatch;

/**
 * Created by ecuser on 2015/12/24.
 */
public class TestCountDownLacher {

    private static  CountDownLatch countDownLatch = new CountDownLatch(2);


    /**
     * CountDownLatch.await 方法并不是做-1操作。只要countDownLatch 大于0，那么就一直阻塞在那
     * @param args
     * @throws Exception
     */

    public static void main(String[] args) throws  Exception{
        System.out.println("main is running...");
        createThread();
        countDownLatch.countDown();
        countDownLatch.countDown();
        Thread.sleep(2000);
        System.out.println("after main....");

    }


    public static void createThread() {
        for (int i = 0; i < 10; i++) {
            new Thread(new SayHello()).start();
        }
    }

   static  class SayHello   implements  Runnable {

        @Override
        public void run() {
            try {
            countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"=======hello wold..");
        }
    }
}
