package com.xxg.juc.Schedule;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by ecuser on 2015/12/24.
 */
public class TestscheduleAtFixedRate {


    /**
     *  表示 从 0秒开始执行，每隔2秒执行一次
     */
    public static void executeFixRate() {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("hello world..."+ new Date().toLocaleString());
            }
        }, 0, 2, TimeUnit.SECONDS);
    }


    /**
     * 延时0秒执行，任务执行完后，一秒钟后执行。
     */
    public static void executFixRateDelay() {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleWithFixedDelay(new SayHello(), 0, 1, TimeUnit.SECONDS);
    }


   static class SayHello implements Runnable {
        @Override
        public void run() {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("....hello world..." + new Date().toLocaleString());
        }
    }
    public static void main(String[] args) {
       // executeFixRate();
        executFixRateDelay();
    }
}
